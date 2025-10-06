package clprolf.wrappers.java.lang;


import org.clprolf.framework.java.Abstraction;
import org.clprolf.framework.java.Gender;
import org.clprolf.framework.java.Agent;

//This class has two aspects, static and instance.

@Agent(Gender.EXPERT_COMPONENT_STATIC) //A expert component in strings!
@Abstraction //Abstraction of the concept of string.
public final class ClpString { //The String class is final.
	private final String internal;
	
	/**
	 * To access methods.
	 * @return
	 */
    public String getInternal() {
		return internal;
	}

	public ClpString(String internalString) {
        // Creates an empty string
    	internal = internalString;
    }

	//The static methods, belonging to the static simu_real_obj aspect.
    //Put here what you want, or nothing!
    public static String valueOf​(int i) {
    	return String.valueOf(i);
    }
    
}
