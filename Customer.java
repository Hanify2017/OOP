package OOP;

public class Customer {
	String name;
	double credit_limit;
	String email;
	
	public Customer(){												//best is public
	
		
		this("Naseem", 57.90, "naseemcs@gmail.com");
		
	}
	public Customer(String N,double C){
		
		this(N, C, "djfhjk");

	}
	
	public Customer(String N,double C,String E){
		this.name=N;
		this.credit_limit=C;
		this.email=E;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
