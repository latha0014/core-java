class HelmetStarter{
	public static void main(String[] args){
		System.out.println("Starting Helmet in HelmetStarter");
		
		
		
		Helmet Helmet=new Helmet();
		System.out.println("Helmet brand is:" +Helmet.brand);
		System.out.println("Helmet color is :" +Helmet.color);
		System.out.println("Helmet type is :" +Helmet.type);
		System.out.println("Helmet cost is :" +Helmet.cost);
	
	
		Helmet Helmet1=new Helmet("vega");
		System.out.println("Helmet1 brand is:" +Helmet1.brand);
		System.out.println("Helmet1 color is :" +Helmet1.color);
		System.out.println("Helmet1 type is :" +Helmet1.type);
		System.out.println("Helmet1 cost is :" +Helmet1.cost);
		
		
		Helmet Helmet2=new Helmet("vega","black");
		System.out.println("Helmet2 brand is:" +Helmet2.brand);
		System.out.println("Helmet2 color is :" +Helmet2.color);
		System.out.println("Helmet2 type is :" +Helmet2.type);
		System.out.println("Helmet2 cost is :" +Helmet2.cost);
		
		
		Helmet Helmet3=new Helmet("vega","black","halfHelmet");
		System.out.println("Helmet3 brand is:" +Helmet3.brand);
		System.out.println("Helmet3 color is :" +Helmet3.color);
		System.out.println("Helmet3 type is :" +Helmet3.type);
		System.out.println("Helmet3 cost is :" +Helmet3.cost);
		
		
		Helmet Helmet4=new Helmet("vega","black","halfHelmet",2000);
		System.out.println("Helmet4 brand is:" +Helmet4.brand);
		System.out.println("Helmet4 color is :" +Helmet4.color);
		System.out.println("Helmet4 type is :" +Helmet4.type);
		System.out.println("Helmet4 cost is:" +Helmet4.cost);
		
		System.out.println("Ending Helmet in HelmetStarter");
		
	}
}
}