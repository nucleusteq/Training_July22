package test.com.in.nucleusteq.addition;


public class Addition {
	public String natural(Integer add1) {
		if(add1==null) {
			return "value is null";
		}
		if(add1<0) {
			return "value is negative";
		}
		int add = 0;
	    for(int i =1; i<=add1; i++) {
	    	
	    	add =  add+i;
	    }
		System.out.println(" the sum "+add);
		
		return ""+add;
    
	}

	
	
}

