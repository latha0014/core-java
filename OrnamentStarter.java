class OrnamentStarter{
	public static void main(String[] args){
		System.out.println("Starting Ornament in OrnamentStarter");
		
		
		
		Ornament Ornament=new Ornament();
		System.out.println("Ornament design is :" +Ornament.design);
		System.out.println("Ornament type is :" +Ornament.type);
		System.out.println("Ornament cost is :" +Ornament.cost);
	
		Ornament Ornament1=new Ornament("bangle");
		System.out.println("Ornament1 brand is:" +Ornament1.brand);
		System.out.println("Ornament1 design is :" +Ornament1.design);
		System.out.println("Ornament1 type is :" +Ornament1.type);
		System.out.println("Ornament1 cost is :" +Ornament1.cost);
		
		
		Ornament Ornament2=new Ornament("casio","painted");
		System.out.println("Ornament2 brand is:" +Ornament2.brand);
		System.out.println("Ornament2 design is :" +Ornament2.design);
		System.out.println("Ornament2 type is :" +Ornament2.type);
		System.out.println("Ornament2 cost is :" +Ornament2.cost);
		
		
		Ornament Ornament3=new Ornament("casio","painted","Automic");
		System.out.println("Ornament3 brand is:" +Ornament3.brand);
		System.out.println("Ornament3 design is :" +Ornament3.design);
		System.out.println("Ornament3 type is :" +Ornament3.type);
		System.out.println("Ornament3 cost is :" +Ornament3.cost);
		
		
		Ornament Ornament4=new Ornament("casio","painted","Automic",2000.0);
		System.out.println("Ornament4 brand is:" +Ornament4.brand);
		System.out.println("Ornament4 design is :" +Ornament4.design);
		System.out.println("Ornament4 type is :" +Ornament4.type);
		System.out.println("Ornament4 cost is :" +Ornament4.cost);
		
		System.out.println("Ending Clock in ClassStarter");
		
	}
}