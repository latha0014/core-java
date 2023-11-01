class RocketStarter{
	public static void main(String[] args){
		System.out.println("Starting Rocket in RocketStarter");
		
		
		
		Rocket Rocket=new Rocket();
		System.out.println("Rocket name is:" +Rocket.name);
		System.out.println("Rocket design is :" +Rocket.design);
		System.out.println("Rocket type is :" +Rocket.type);
		System.out.println("Rocket cost is :" +Rocket.cost);
	
	
		Rocket Rocket1=new Rocket("NASA");
		System.out.println("Rocket1 name is:" +Rocket1.name);
		System.out.println("Rocket1 design is :" +Rocket1.design);
		System.out.println("Rocket1 type is :" +Rocket1.type);
		System.out.println("Rocket1 cost is :" +Rocket1.cost);
		
		
		Rocket Rocket2=new Rocket("NASA","narrower");
		System.out.println("Rocket2 name is:" +Rocket2.name);
		System.out.println("Rocket2 design is :" +Rocket2.design);
		System.out.println("Rocket2 type is :" +Rocket2.type);
		System.out.println("Rocket2 cost is :" +Rocket2.cost);
		
		
		Rocket Rocket3=new Rocket("NASA","narrower","lon");
		System.out.println("Rocket3 name is:" +Rocket3.name);
		System.out.println("Rocket3 design is :" +Rocket3.design);
		System.out.println("Rocket3 type is :" +Rocket3.type);
		System.out.println("Rocket3 cost is :" +Rocket3.cost);
		
		
		Rocket Rocket4=new Rocket("NASA","narrower","lon",8000000.0);
		System.out.println("Rocket4 name is:" +Rocket4.name);
		System.out.println("Rocket4 design is :" +Rocket4.design);
		System.out.println("Rocket4 type is :" +Rocket4.type);
		System.out.println("Rocket3 cost is:" +Rocket4.cost);
		
		System.out.println("Ending Clock in RocketStarter");
		
	}
}