package Datatypes;

class NamingConvention {

    public static void main(String[] args) {
        String firstName = "Manav";// camelCase
        String lastName = "Jindal";
        System.out.println("firstName + lastName : " + firstName + " " + lastName);

        short age = 22, Age = 22;// Case sensitive age and Age are treated as different variables
        System.out.println("age : " + age + " Age: " + Age);

        String phone_Number = "458784549";// variable containing special character _
        System.out.println("phone_Number :" + phone_Number);

        int max$holidays = 12;// variable containing special character $
        System.out.println("max$holidays : " + max$holidays);

        String _city = "Indore", $city = "Indore";// variable name starting with special character
        System.out.println("_city : " + _city + " $city: " + $city);

        String NamingConvention = "Pascal Case Example";// PascaleCase
        System.out.println("NamingConvention : " + NamingConvention);
    }
}