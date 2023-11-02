class Free{
	String What;
	String why;
	boolean freeForAll;
	
	
	Free(String what,String why,boolean freeForAll){
		this.what=what;
		this.why=why;
		this.freeForAll=freeForAll;
		System.out.println("Creating Free with String,String,boolean arg constructor");
	}
	
	void displayInfo(){
		System.out.println("starting displayInfo");
		System.out.println(this.what);
		System.out.println(this.why);
		System.out.println(this.freeForAll);
		
		System.out.println("ending displayInfo");
	}
}