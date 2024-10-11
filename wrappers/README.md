# Clprolf wrappers project for Java Standard Library

This project aims first to give real-world examples about clprolf and the class and interface roles, and some other clprolf's features.
	
It can truly serve in the projects anyway, thanks to the polymorphism of Java. Most of the wrappers runs threw inheritance. So you can use them, for example ClpSocket, everywhere a java Socket is wanted. This is true for the Java interfaces like java.sql.Connection, which can be replaced by ClpConnection objects.
	
For the rare cases where the Java classes are final, a solution is proposed, but not always very easy to handle. It mainly serves here to illustrate the way we could have categorized these classes.
The System class, for example, is a final class with only static methods. And classes like String are final too.

We not aim to be exhaustive, and we just want propose some wrappers, as a template about clprolf's compatibility with pure OOP languages.

Contributors are welcome to add their own wrappers!

## CLASSES

(final)java.lang.String => clprolf.wrappers.java.lang.ClpString
(final)java.lang.System => clprolf.wrappers.java.lang.ClpSystem

java.net.Socket => clprolf.wrappers.java.net.ClpSocket
ServerSocket => clprolf.wrappers.java.net.ClpSocketServer NAME CHANGED (FOR CONSISTENCY)
javax.swing.JButton => clprolf.wrappers.javax.swing.ClpJButton
java.util.Scanner => clprolf.wrappers.java.util.ClpScanner

## INTERFACES

java.sql.Connection => clprolf.wrappers.java.sql.ClpConnection

