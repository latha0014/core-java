class Carrom{
 String coinsColor;
 String Type;
 int noOfCoins;
 double cost;
 
Carrom()
{this(black,standardCarrom,19,1000);
System.out.println("Invoke the no-arguments....");	
}

Carrom(String coinsColor){
	this.CoinsColor=CoinsColor;
	System.out.println("Invoke the String  arguments:"+CoinsColor);	
}
Carrom(String CoinsColor,String Type ){
	this("black");
	this.Type=Type;
  System.out.println("Invoke the String, String arguments: " + coinsColor + ", " + Type);

}
Carrom(String CoinsColor,String Type,int noOfCoins ){
	this.CoinsColor=CoinsColor;
	this.type=type;
	this.noOfCoins=noOfCoins;
    System.out.println("Invoke the String, String, int arguments: " + coinsColor + ", " + Type + ", " + noOfCoins);

}
Carrom(String coinsColor,String Type,int noOfCoins,double cost ){
	this(black,standardCarrom);
	this.noOfCoins=noOfCoins;
	this.cost=cost;
    System.out.println("Invoke the String, String, int , double arguments: " + coinsColor + ", " + Type + ", " + noOfCoins+ "," +cost);
}
}