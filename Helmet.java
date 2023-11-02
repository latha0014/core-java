class Helmet{
	String brand;
	String type;
	double cost;
	String color;
	
	
	Helmet(){
		this(vega,halfHelmet,black,2000);
		System.out.println("Helmet is created");
		System.out.println("Invoke the no-arguments....");
	}
	Helmet(String brand){
		this.brand=brand;
		System.out.println("Invoke String arg:"+brand);
	}
	Helmet(String brand,String type){
		this.brand=brand;
		this.type=type;
		
		System.out.println("Invoke the String, String arguments: " + Brand + ", " + Type);
	}
	Helmet(String brand,String name, double cost){
		this(vega,2000);
		this.cost=cost;
		
		System.out.println("Invoke the String, String,double arguments: " + Brand + ", " + Type + ", " + cost+ ");
	}
	Helmet(String brand,String name, double cost,String color){
		this.brand=brand;
		this.type=type;
		this.cost=cost;
		this.color=color;
		
		System.out.println("Invoke the String, String,double,String arguments: " + Brand + ", " + Type + ", " + cost+ "," + color + ");
	}
}