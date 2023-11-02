class Bracelet{
	int size;
	String type;
	double cost;
	String shape;
	
	
	Bracelet(){
		this(5,gold,20000,round);

		System.out.println("Invoke the no-arguments....");
	}
	Bracelet(int size){
		this.size=size;
		System.out.println("Invoke int arg:"+size);
	}
	Bracelet(int size,String type){
		this.size=size;
		this.type=type;
		
		System.out.println("Invoke the int, String arguments: " + size + ", " + Type);
	}
	Bracelet(int size,String type, double cost){
		this(5,gold);
		this.cost=cost;
		
		System.out.println("Invoke the int, String,double arguments: " + size+ ", " + Type + ", " + cost+ ");
	}
	Bracelet(int size,String type, double cost,String shape){
		this.size=size;
		this.type=type;
		this.cost=cost;
		this.shape=shape;
		
		System.out.println("Invoke the int, String,double,String arguments: " + size + ", " + Type + ", " + cost+ "," + shape + ");
	}

}