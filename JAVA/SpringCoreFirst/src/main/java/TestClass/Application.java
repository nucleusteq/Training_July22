package TestClass; 


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
public static void main(String[] args) {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansetter.xml");
    Student s = (Student) context.getBean("Student");
    System.out.println(s);
    
}
}