class MakeupKitStarter{
	public static void main(String[] args){
		System.out.println("Starting MakeupKit in MakeupKitStarter");
		
		
		
		MakeupKit MakeupKit=new MakeupKit();
		System.out.println("MakeupKit brand is:" +MakeupKit.brand);
		System.out.println("MakeupKit design is :" +MakeupKit.design);
		System.out.println("MakeupKit type is :" +MakeupKit.type);
		System.out.println("MakeupKit cost is :" +MakeupKit.cost);
	
	
		MakeupKit MakeupKit1=new MakeupKit("Fitme");
		System.out.println("MakeupKit1 brand is:" +MakeupKit1.brand);
		System.out.println("MakeupKit1 design is :" +MakeupKit1.design);
		System.out.println("MakeupKit1 type is :" +MakeupKit1.type);
		System.out.println("MakeupKit1 cost is :" +MakeupKit1.cost);
		
		
		MakeupKit MakeupKit2=new MakeupKit("Fitme","square");
		System.out.println("MakeupKit2 brand is:" +MakeupKit2.brand);
		System.out.println("MakeupKit2 design is :" +MakeupKit2.design);
		System.out.println("MakeupKit2 type is :" +MakeupKit2.type);
		System.out.println("MakeupKit2 cost is :" +MakeupKit2.cost);
		
		
		MakeupKit MakeupKit3=new MakeupKit3("Fitme","square","waterproof");
		System.out.println("MakeupKit3 brand is:" +MakeupKit3.brand);
		System.out.println("MakeupKit3 design is :" +MakeupKit3.design);
		System.out.println("MakeupKit3 type is :" +MakeupKit3.type);
		System.out.println("MakeupKit3 cost is :" +MakeupKit3.cost);
		
		
		MakeupKit MakeupKit4=new MakeupKit("Fitme","square","waterproof",3000.0);
		System.out.println("MakeupKit4 brand is:" +MakeupKit4.brand);
		System.out.println("MakeupKit4 design is :" +MakeupKit4.design);
		System.out.println("MakeupKit4 type is :" +MakeupKit4.type);
		System.out.println("MakeupKit4 cost is :" +MakeupKit4.cost);
		
		System.out.println("Ending Clock in MakeupKitStarter");
		
	}
}