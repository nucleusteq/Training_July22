// John is working on a complex Java based project. John is new to java programming. 
// John is working on a School dataset which he got in the below matrix. Row in matrix has data for a particular class. 
// (e.g. Row 0 is class 1 row 1 is of class 2) and grades are arranged as per roll number in each row. (e.g. class 2 roll number 3 grade is A)
// [B+ A C A+...
//  C D	A	A+..
//  A- B A	A..
// .	
//  ]
 
// This Metrics represents:
// [class 1 rollnumber 1, Class 1 roll number 2...
// class2  roll number 1, class 2 roll number 2..
// .] 
// Since John is a new programmer so he doesn't know collections. John has some questions which he is unable to solve by himself. Help John in one line/one word only(Q1 to 6).

// Q1: He is given number of students in each class and school has only classes from 1st till 12th. How can he store these constants in Java?
// Ans->	he can create a matrix  of the particular dimension , and can user nested for loops to store the values .

// Q2: He has to identify the correct Data Type for the grade of student. What is the correct data type for grades?
// Ans->  by putting nested for loops , john can acces every element and for every element we can write a check i.e suppose n is a string stored in a matrix then -> if(n instanceof String)
// 	by this we can know if the element is string or not.

// Q3: He has to initialize the complete matrix data by which he can get the data by entering class name and roll number. Please suggest him how he can do that.
// Ans->String[][] names = { {"A", "B"}, {"A+", "A"}, {"B", "C"}, };  , in the above matrix he can user the indexing to acces any element -> to get the 2nd class roll number 1 -> names[1][0]


// Read more: https://www.java67.com/2014/10/how-to-create-and-initialize-two-dimensional-array-java-example.html#ixzz7bLjtmt4o
// Q4: He has to initialize his class without creating objects. He is not sure if it can be done or if it can be so how he can do it.
// Ans-> he can initialize the matrix where he is declaring it , and thas how he dont have to use the class object , he can directly access everything by the array name.

// Q5: While doing some operations he got an Exception. Tell him what are the different types of exceptions in Java.
// Ans-> Generally for matrix operations we get (java.lang.ArrayIndexOutOfBoundsException) because of accessing an index of an array which is not there.

// Q6: Tell him what is the base class of Exception and Error.
// Ans-> Throwable class is the base class of exception and error.

// Q7: Suggest him how he can handle Exceptions and use of finally.
// Ans-> by putting the code which looks risky we can first write a try block and then we can write a catch block in which we can write the exception name 
// which we think can come during try block and then The finally block is used to write the important code which must be executed  .

// Q8: Write a code snippet to iterate the matrix data.
// ->suppose mat is a 2d matrix . Then
// 	 for(int i=0; i< mat.length; i++) {
//             for(int j=0; j< mat[i].length; j++) {
//                 System.out.print(mat[i][j] + "\t");
//             }
//             System.out.println("");
//         }

// Q9: He has to transfer data to a different system. But he is confused if he can use Serialization and also suggest the purpose of it.
// Ans->  Serialization can allow him to convert the state of the object to a byte system by which it can be saved into a file and can be sent to other system .
// 	and then yes he can use deserialization to reverse the process to convert the serialized byte code t an object again.

// Now Rakesh Join the team and they have to work on the similar data and they have to solve another Problem. They need to enhancement the application. They are also facing some challenges.
// Let's help them out.
// Q10: They are looking to store the metrics data in collection so roll number and class should be unique and upon entering the same data value should be overridden. what collection they should use.
// Ans-> to set the unique data they can use LinkedHashSet.

// Q11. Now they have to sort the data as well as the different methods available to sort it in collection and write a generic method to solve collection framed in Q10.
// Ans->By making and arraylist object of linkedhasset , we can use Collections.sort(linkedhassetobject); method to sort elements

// Q12. They faced a very challenging situation here. Now Each class teacher will be entering their students' data concurrently so how can Rakesh and John make their collection thread safe.
// Ans-> By making separate threads for separate teacher , we can use wait and notify method of Thread class to make it safer.

// Q13. As concurrent users started updating the dataset they are thinking to have a multi threaded application. Suggest them the various ways to create a multithreaded application.
// Ans-> Theads can be used in two ways ->  by extending the Thread class or by implementing the runnable

// Q14. They have another situation where their multi threaded application enters in a deadlock. How to prevent an application from a deadlock situation.
// Ans-> Deadlock can be prevented by using mututual exclusion.

// Q15. They got another problem in the code where they are facing memory leaks. What are the different ways to resolve the memory leaks for their app.
// Ans-> no limit for the thread , using wrong variable types which takes too much memories, by avoiding string concatenation..

// Coding Exercise
// Q We have to create a weather records set where 10 cities data can be recorded at 1 min interval.
//  After an hour, records should be sorted as per the cities in a collection. 
// Remember that There can be multiple systems that can enter the weather data so it should 
// support a multi threaded environment and consistency to be met. All java codes should be compiled.
// Ans-> In Source Folder

