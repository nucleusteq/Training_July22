1) Remove public from main method - Error: Main method not found in class FirstProg, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application - This happened because main() 
method in Java is an standard method which is used by JVM to start execution of any Java program. 
Main method is referred as entry point of Java application which is true in case of core java application.
​
​
2) Remove static - Error: Main method is not static in class FirstProg, please define the main method as:
   public static void main(String[] args) - This happened because Java main() method is always static, 
so that compiler can call it without the creation of an object or before the creation of an object of the class.
​
​
3) Remove void - Error: Main method not found in class FirstProg, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application - This happened because main() 
method in Java is an standard method which is used by JVM to start execution of any Java program. 
Main method is referred as entry point of Java application which is true in case of core java application and with no return type the program won't compile.
​
​
4) Remove out from println line - Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method println(String) is undefined for the type System
​
	at FirstProg.main(FirstProg.java:4) - This happened because Unresolved compilation problems in the code are due to compilation errors in the code,
 and java is looking for reference to a method to run.
​
​
5) Remove System from println line - Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	out cannot be resolved
​
	at FirstProg.main(FirstProg.java:4) - This happened because Unresolved compilation problems in the code are due to compilation errors in the code
​
​
6) Remove args - Error: Main method not found in class FirstProg, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application - This happened because main() 
method in Java is an standard method which is used by JVM to start execution of any Java program. 
Main method is referred as entry point of Java application which is true in case of core java application.
​
​
7) Remove "class" from class definition - Error: Could not find or load main class FirstProg
Caused by: java.lang.ClassNotFoundException: FirstProg- This happened because without the keyword class in the class definition the compiler won't identify it as a class def. without which,
it won't load.
​
​
8) Remove main from main method - Error: Main method not found in class FirstProg, please define the main method as:
   public static void main(String[] args)
or a JavaFX application class must extend javafx.application.Application - This happened because main() 
method in Java is an standard method which is used by JVM to start execution of any Java program. 
Main method is referred as entry point of Java application which is true in case of core java application
​
9) Remove println - Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method out(String) is undefined for the type System
	at FirstProg.main(FirstProg.java:4) - This happened because Unresolved compilation problems in the code are due to compilation errors in the code,
 and java is looking for a method to run.
​
10) Remove semicolon - Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Syntax error, insert ";" to complete BlockStatements
​
	at FirstProg.main(FirstProg.java:4) - This happened because Semicolon is a part of syntax in Java. 
It shows the compiler where an instruction ends and where the next instruction begins. 
Semicolon allows the java program to be written in one line or multiple lines, by letting the compiler know where to end the instructions.
​
​
​
​
If we change the class name while keeping the file name same we get this error - Error: Could not find or load main class FirstProg
Caused by: java.lang.ClassNotFoundException: FirstProg