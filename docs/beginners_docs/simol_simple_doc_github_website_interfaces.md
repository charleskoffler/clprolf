Differences between simol and java or any usual object-oriented language - The interfaces

What are the differences between Java-like languages and simol?

In Java, there is one keyword for interfaces, "interface". An interface is quite a set of method signatures, grouped to constitute a type. An interface can not contain instance fields. And an interface can not have protected methods or members. By inheriting of an interface, a class inherits only of a signature, not of an implementation.
So the class have to write it. So in simol, interfaces are considered as a contract. In the oracle website, about java interface concept: "Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.".
That's why in simol, we talk rather of "compatibility interfaces", instead of pure "interfaces". It remains interfaces, because simol is compatible with object-oriented concepts. But interfaces are viewed for a compatibility goal, for a variable, field, or parameter to reach out a class type respecting a given interface.

What is a capacity compatibility interface ?

So then, in simol, we distinguishes two types of interfaces, the version interfaces, and the capacity interfaces.
Capacity interfaces exist for a long time in Java, with the "able" suffix in their type name. For example, the "java.lang.Runnable" interface in java, which ensures the capacity te be run. So this is the "compat_interf_capacity" in simol language.

```java
package org.me.mylib;

public compat_interf_capacity Runnable {
	void execute();

}
```

```java
package org.me.mylib;

@Compat_interf_capacity
public interface Runnable {
	void execute();

}
```

```java

import org.me.mylib.Runnable;

public simu_comp_worker MyLauncher contracts Runnable {
	public void execute(){
		//The executed code.
	}
}

```

```java

import org.me.mylib.Runnable;

@Simu_comp_worker
public class MyLauncher implements @Contracts Runnable {
	public void execute(){
		//The executed code.
	}
}

```

But what is the "contracts" keyword?

The "contracts" keyword, or "@Contracts" in the simol framework, is just a word for "implements". It means "Here are the contracts of the class". So it precedes the list of interface types a class implements. That's not more than that. In simol, we emphasizes the compatibility side of the interfaces, so it remains coherent.

What are the version compatibility interfaces in simol?

The other sort of interfaces, in simol, is the version interface. A version interface aims to provide a whole version of a class, when used. It is not only a set of methods asked, but the interface aims to guarantee to have a whole implementation version of a class.
It is rather easy to understand for a experienced object oriented programmer, because interfaces are often used for weak coupling. In this case, we create an interface, to obtain later a variable of a type of class which is an implementation version.
The factory pattern, for example, often use such interfaces for different versions of the factories, or for the made object.

Let's rewrite the wikipedia factory example:

```java
 public compat_interf_version ImageReader {
     public DecodedImage getDecodedImage();
 }
 
 public simu_real_world_obj GifReader contracts ImageReader {
     public GifReader( with_compat InputStream in ) {
         // check that it's a gif, throw exception if it's not, then if it is
         // decode it.
     }
 
     public DecodedImage getDecodedImage() {
        return decodedImage;
     }
 }
 
 public class JpegReader contracts ImageReader {
     //...
 }

```

Framework version:

```java
 @Compat_interf_version
 public interface ImageReader {
     public DecodedImage getDecodedImage();
 }
 
 @Simu_real_world_obj
 public class GifReader implements @Contracts ImageReader {
     public GifReader( @With_compat InputStream in ) {
         // check that it's a gif, throw exception if it's not, then if it is
         // decode it.
     }
 
     public DecodedImage getDecodedImage() {
        return decodedImage;
     }
 }
 
 public class JpegReader contracts ImageReader {
     //...
 }

```
The choice between a version or capacity compatibility interface is always free. But the slogan is always to indicate our choice.

Is it really useful?

I think so. We should know that the compiler will ensure, by semantic stage checks, that the interface role would be coherent despite the interface can inherit by another interface. So a growing of interface will still remain clean and meaningful. And the compiler will check if the contracts of a class are coherent.
In rare and particular use cases where we want to overstep these rules, we can use "@Forced_int_inh" annotation in both language and framework. This forcing can be done about an "extends" of an interface, or "contracts" of a class.

```java

public compat_interf_version CityDao {
	public City getCityById(int id);
	//(...)
}

// THIS IS NOT PERMITTED BY THE COMPILER, BECAUSE A VERSION CAN NOT INHERIT OF ANOTHER VERSION
public compat_interf_version ClientDao extends CityDAO { //Notice that there is no "nature" keyword about the "extends" between interfaces!
	public Client getClientById(int id);
	//(...)
}

// Here, we enforce the classical rules of simol for interface inheritance.
public compat_interf_version ClientDao extends @Forced_int_inh CityDAO {
	public Client getClientById(int id);
	//(...)
}

```

In the framework:

```java

@Compat_interf_version
public interface CityDao {
	public City getCityById(int id);
	//(...)
}

// THIS IS NOT PERMITTED BY THE COMPILER, BECAUSE A VERSION CAN NOT INHERIT OF ANOTHER VERSION

@Compat_interf_version
public interface ClientDao extends CityDAO { //Notice that there is no "nature" keyword about the "extends" between interfaces!
	public Client getClientById(int id);
	//(...)
}

// Here, we enforce the classical rules of simol for interface inheritance.
@Compat_interf_version
public interface ClientDao extends @Forced_int_inh CityDAO {
	public Client getClientById(int id);
	//(...)
}

```

NOR

```java
public simu_comp_worker ClientMysqlDao contracts ClientDAO, CityDAO { //THIS IS NOT ALLOWED BY THE COMPILER. WE CAN NOT IMPLEMENT TWO VERSION INTERFACES, BECAUSE WE CAN NOT BE TWO VERSIONS AT THE SAME TIME!
(...)
}

```

In the framework:

```java
@Simu_comp_worker
public class ClientMysqlDao implements @Contracts ClientDAO, CityDAO { //THIS IS NOT ALLOWED BY THE COMPILER. WE CAN NOT IMPLEMENT TWO VERSION INTERFACES, BECAUSE WE CAN NOT BE TWO VERSIONS AT THE SAME TIME!
(...)
}

```

What is the "with_compat" stuff, is it really useful?

"with_compat" is just a keyword to add when interface type is used. It precedes a variable, field, or parameter declaration. It means "with compatibility", so we accept, for these variables, any objects with a class type compatible with our required interface. We do not use "with compat" on a return type. It keeps our vision of interfaces, while permitting to remind that the requested object is still an object with a class. Actually, an interface is not really a type, by a requirement about a class type. And the weakly coupled variables are quickly visible, as well as the dependency injection(needed or done).

```java

public simu_comp_worker Launcher {

	public static void main(String[] args){
		with_compat ClientDAO daoClient = new MysqlClientDAO();
		Client client = daoClien.getClient(2);
	}


}
```

In the framework:

```java

@Simu_comp_worker
public class Launcher {

	public static void main(String[] args){
		@With_compat ClientDAO daoClient = new MysqlClientDAO();
		Client client = daoClien.getClient(2);
	}


}

```
