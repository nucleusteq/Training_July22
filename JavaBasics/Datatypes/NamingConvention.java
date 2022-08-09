class NamingConvention{

	public static void main(String[] args){
		String firstName="Himanshu";// camelCase
		String lastName="Dhoke";
		System.out.println("firstName + lastName : "+firstName+" "+lastName);
		
		short age=25,Age=25;// Case sensitive age and Age are treated as different variables
		System.out.println("age : "+age +" Age: "+Age);

		String phone_Number="1234567890";//variable containing special character _
		System.out.println("phone_Number :"+ phone_Number);

		int max$holidays= 18; //variable names allows $ on variable name.
		System.out.println("max$holidays : "+max$holidays);

		String _city="Raipur",$city="Raipur";// variable name starting with special character.
		System.out.println("_city : "+ _city + " $city: "+$city);

		String NamingConvention="Pascal Case Example";// PascaleCase
		System.out.println("NamingConvention : "+ NamingConvention);
	}
}