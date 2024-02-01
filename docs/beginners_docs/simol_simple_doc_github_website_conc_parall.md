#Explaining simol language for beginners - concurrency and parallelism aids

##How do we handle concurrency in simol in details?

We have two modifiers, in simol, "long_action", and "prevent_missing_collision", for concurrency. It has been added to clarify this point in simol. These aids concern especially simu_real_world_obj, but are made for both simu_comp_worker or simu_real_world_obj.

###"long_action" or "@Long_action"
Some methods of simu_real_world_obj, like jumping, have duration, in time, and don't consist in just a states changing. For a video game and a class Player, the "jump" method would be a long action. Because the player is moving towards up, then falls. And this action could take some seconds, or almost one second. We want just to trigger it, like saying to the player object to jump, and that's all. We don't want to matter about the fact it takes some time, to keep simple and stay like in the real-world life. So the idea is to cut in steps the action, and to execute it step by step. It is not a new idea to do that, because we can find it in video game programming.

Let's take a simpler example with "fall()":

In simol:

```java
public simu_real_world_obj Player {
	//A field to manage a long action, is marked with the @Long_action annotation, in the simol language
	@Long_action
	private boolean isFalling = false;

	public prevent_missing_collision void place(int xWanted, int yWanted, MovementKind kindWantedMvt) {
		
		//Case where we quite the ladder too early
		if (isSettingUpLadder && checkPlayerInLadder()==null) {
			this.isSettingUpLadder = false;
		}
		
		//checking if xWanted and yWanted are not in collision, that's why it' s a "prevent_missing_collision" method.
		if (!checkIfInEnemyPosition(int xWanted, int yWanted)){ // We do not accept the movement, if it is not permit!
				//It's important to detect this now, because we could miss a collision,
				// if the player and the enemy are passing each other at the same time!
			this.x = xWanted;
			this.y = yWanted;
		}
	}

	//Trigger the fall action. We use the method as any other methods!
	public long_action void fallIfHole() {
		// Do not make him jump, if he is jumping at the moment
		if (!this.isFalling && !isJumping && !isSettingUpLadder &&!checkIfNoPlatformBehind()) {
			this.isFalling = true;
			this.continueFallIfHole();
		}
	}
	
	public long_action void continueFallIfHole() {
		if (this.isFalling && !this.isSettingUpLadder) {
			if (!isJumping && !checkIfNoPlatformBehind()) {
				this.place(x, y+1 true); //We're trying to move the player, if possible without collision.
			}
			else {
				this.isFalling = false; //The falling is ended when the player decides to jump, or he met a platform ground.
			}
		}
	}

	//The "long_action" "endLongActions()" method of each class, is called when we want to execute the next step of the long action!
	public long_action void endLongActions() {
		if (this.game.realiz.waitPaintCount(2)) { //does not wait, but it's quite like that! We have a counter of paint cycles, which increase at each repaint() calling, in a refresh loop in a cycles thread!
			continueJump();
		}
		if (this.game.realiz.waitPaintCount(2)) {
			continueFallIfHole(); //Notice that when the fall is ended, this call becomes useless, until a new fall is triggered by a fallIfHole() calling.
		}
		
	}
}
```

In the simol framework:

```java
@Simu_real_world_obj
public class Player {
	//A field to manage a long action, is marked with the @Long_action annotation, in the simol language
	@Long_action
	private boolean isFalling = false;

	@Prevent_missing_collision
	public void place(int xWanted, int yWanted, MovementKind kindWantedMvt) {
		
		//Case where we quite the ladder too early
		if (isSettingUpLadder && checkPlayerInLadder()==null) {
			this.isSettingUpLadder = false;
		}
		
		//checking if xWanted and yWanted are not in collision, that's why it' s a "prevent_missing_collision" method.
		if (!checkIfInEnemyPosition(int xWanted, int yWanted)){ // We do not accept the movement, if it is not permit!
				//It's important to detect this now, because we could miss a collision,
				// if the player and the enemy are passing each other at the same time!
			this.x = xWanted;
			this.y = yWanted;
		}
	}

	//Trigger the fall action. We use the method as any other methods!
	@Long_action
	public void fallIfHole() {
		// Do not make him jump, if he is jumping at the moment
		if (!this.isFalling && !isJumping && !isSettingUpLadder &&!checkIfNoPlatformBehind()) {
			this.isFalling = true;
			this.continueFallIfHole();
		}
	}
	
	@Long_action
	public void continueFallIfHole() {
		if (this.isFalling && !this.isSettingUpLadder) {
			if (!isJumping && !checkIfNoPlatformBehind()) {
				this.place(x, y+1 true); //We're trying to move the player, if possible without collision.
			}
			else {
				this.isFalling = false; //The falling is ended when the player decides to jump, or he met a platform ground.
			}
		}
	}

	//The "@Long_action" like "endLongActions()" method of each class, is called when we want to execute the next step of the long action!
	@Long_action
	public void endLongActions() {
		if (this.game.realiz.waitPaintCount(2)) { //does not wait, but it's quite like that! We have a counter of paint cycles, which increase at each repaint() calling, in a refresh loop in a cycles thread!
			continueJump();
		}
		if (this.game.realiz.waitPaintCount(2)) {
			continueFallIfHole(); //Notice that when the fall is ended, this call becomes useless, until a new fall is triggered by a fallIfHole() calling.
		}
		
	}
}
```

With this example of a quite simple 2D-platform game, we realize that things can quickly become tricky.
	
##Are they some aid for parallelism in simol ? "one_at_a_time", "turn_monitor", "for_every_thread"

Parallelism aids in simol does not replace the classical and robust implementation support in java. But it complements it with some features with a goal of clarity.

###What is "one_at_a_time"?
"one_at_a_time" is a method modifier (@One_at_a_time in the framework). It marks synchronized methods, or methods containing synchronized blocks. It emphasizes that only one thread a a time is doing the job, so we almost mimic a single thread application! And it's here the important point, many threads in turn for parts of code, it's like having a single thread application for these parts.

###And what is a "turn_monitor"?
Many "one_at_at_time" parts can work together, with a "turn_monitor" object which manages the turns of each one. A "turn_monitor"(@Turn_monitor in the framework), is a field modifier, for the lock objects. We can have the same turn_monitor for two methods of two different classes, in Enemy and Player classes. These monitor controls that one player and his enemies are executed quite like a single-threaded application, for the critical parts. So yes, the implementation of "one_at_a_time" requires "synchronized" keyword in java, and yes "turn_monitor" is a java lock object. Here, we are trying to abstract the programming to ease such difficult code writing.
The critical parts are often the "prevent_missing_collision" parts, so the place() method in the last example. The getPosition()-like methods also could need to be "one_at_a_time" with the same "turn_monitor".

###What does "for_evey_thread" mean?
"for_every_thread" marks the fields that are not cached inside the threads, so we can read their values from different threads, without worrying about cache problems.
So it is the "volatile" fields in java.It highlights the fact that the field is usable directly for multi-threading programming, being sure that we are reading the last value of the field.

##Are these aids valuable?
Parallelism is such a complex topic, perhaps even more than class designing, so the more support we have, the better. Imagine if you could just think that some parts of the software must work like in a single-thread stuff, and the other parts not. That's it! To achieve this goal, we introduced both "one_at_a_time", and "turn_monitor" that aims to simplify the way we have to manage many "one_at_a_time" parts working together.
The "for_every_thread" is the icing on the cake, and is not used is all cases. It reminds us that some stuff like caching variables could be used by compilers without being aware of this. So that's a way to indicate clearly this in the language, in a top-level manner. It does not aim to compete with "volatile", which is quite like the used implementation to achieve our goal.
We still have to write the java keywords, because simol doesn't want to replace here the existing java keywords, which are great and well-known.

###Is there a link between concurrency and parallelism aids?
Yeah. It is recommended, in simol, to first write a single-thread code handling concurrency, and to then think about if it needs more than that. So if we decide that yes, we then use the parallelism keywords. Remember too that the "prevent_missing_collision" part, which are often about setter methods, have, in multi-threading case, to be in "one_at_a_time", and sometimes the associated getters.

