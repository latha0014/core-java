class KeyChain{
	String brand;
	String type;
	double cost;
	String color;
	
	
	KeyChain(){
		this();
		
		System.out.println("Invoke the no-arguments....");
	}
	KeyChain(String brand){
		this.brand=brand;
		System.out.println("Invoke String arg:"+brand);
	}
	KeyChain(String brand,String type){
		this.brand=brand;
		this.type=type;
		
		System.out.println("Invoke the String, String arguments: " + Brand + ", " + Type);
	}
	KeyChain(String brand,String name, double cost){
		this();
		this.cost=cost;
		
		System.out.println("Invoke the String, String,double arguments: " + Brand + ", " + Type + ", " + cost+ ");
	}
	KeyChain(String brand,String name, double cost,String color){
		this.brand=brand;
		this.type=type;
		this.cost=cost;
		this.color=color;
		
		System.out.println("Invoke the String, String,double,String arguments: " + Brand + ", " + Type + ", " + cost+ "," + color + ");
	}
}