class MainTypeCast
{
	public static void main(String... args)
	{
		System.out.println("Starting from main");
		System.out.println("==============");
		Wood wood=new Bat();
		wood.making();
		Bat bat=(Bat)wood;
		bat.play();
		
		System.out.println("==============");
		
		Machine machine=new Generator();
		machine.electric();
		Generator generator=(Generator)machine;
		generator.light();
		
		System.out.println("==============");
		
		Plant plant=new Food();
		plant.leaves();
		Food food=(Food)plant;
		food.eat();
		System.out.println("==============");
		System.out.println("Ending main");
		
	
	}
}