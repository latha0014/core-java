class WalletStarter{
	public static void main(String[] args){
		System.out.println("Starting Wallet in WalletStarter");
		
		
		
		Wallet Wallet=new Wallet();
		System.out.println("Wallet brand is:" +Wallet.brand);
		System.out.println("Wallet design is :" +Wallet.design);
		System.out.println("Wallet size is :" +Wallet.size);
		System.out.println("Wallet cost is :" +Wallet.cost);
	
	
		Wallet Wallet1=new Wallet("UrbanForest");
		System.out.println("Wallet1 brand is:" +Wallet1.brand);
		System.out.println("Wallet1 design is :" +Wallet1.design);
		System.out.println("Wallet1 size is :" +Wallet1.size);
		System.out.println("Wallet1 cost is :" +Wallet1.cost);
		
		
		Wallet Wallet2=new Clock("UrbanForest","square");
		System.out.println("Wallet2 brand is:" +Wallet2.brand);
		System.out.println("Wallet2 design is :" +Wallet2.design);
		System.out.println("Wallet2 size is :" +Wallet2.size);
		System.out.println("Wallet2 cost is :" +Wallet2.cost);
		
		
		Wallet Wallet3=new Wallet("UrbanForest","square","small");
		System.out.println("Wallet3 brand is:" +Clock3.brand);
		System.out.println("Wallet3 design is :" +Clock3.design);
		System.out.println("Wallet3 size is :" +Clock3.size);
		System.out.println("Wallet3 cost is :" +Clock3.cost);
		
		
		Wallet Wallet4=new Wallet("UrbanForest","square","small",500);
		System.out.println("Wallet4 brand is:" +Wallet4.brand);
		System.out.println("Wallet4 design is :" +Wallet4.design);
		System.out.println("Wallet4 size is :" +Wallet4.size);
		System.out.println("Wallet4 cost is :" +Wallet4.cost);
		
		System.out.println("Ending Wallet in WalletStarterStarter");
		
	}
}