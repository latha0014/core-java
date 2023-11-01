class ClockStarter{
	public static void main(String[] args){
		System.out.println("Starting Clock in ClassStarter");
		
		
		
		Clock Clock=new Clock();
		System.out.println("Clock brand is:" +Clock.brand);
		System.out.println("Clock design is :" +Clock.design);
		System.out.println("Clock type is :" +Clock.type);
		System.out.println("Clock cost is :" +Clock.cost);
	
	
		Clock Clock1=new Clock("casio");
		System.out.println("Clock1 brand is:" +Clock1.brand);
		System.out.println("Clock1 design is :" +Clock1.design);
		System.out.println("Clock1 type is :" +Clock1.type);
		System.out.println("Clock1 cost is :" +Clock1.cost);
		
		
		Clock Clock2=new Clock("casio","painted");
		System.out.println("Clock2 brand is:" +Clock2.brand);
		System.out.println("Clock2 design is :" +Clock2.design);
		System.out.println("Clock2 type is :" +Clock2.type);
		System.out.println("Clock2 cost is :" +Clock2.cost);
		
		
		Clock Clock3=new Clock("casio","painted","Automic");
		System.out.println("Clock3 brand is:" +Clock3.brand);
		System.out.println("Clock3 design is :" +Clock3.design);
		System.out.println("Clock3 type is :" +Clock3.type);
		System.out.println("Clock3 cost is :" +Clock3.cost);
		
		
		Clock Clock4=new Clock("casio","painted","Automic",2000.0);
		System.out.println("Clock4 brand is:" +Clock4.brand);
		System.out.println("Clock4 design is :" +Clock4.design);
		System.out.println("Clock4 type is :" +Clock4.type);
		System.out.println("Clock4 cost is :" +Clock4.cost);
		
		System.out.println("Ending Clock in ClassStarter");
		
	}
}