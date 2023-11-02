class Printer{
 String Brand;
 String Type;
 int Capacity;
 int NoOFPages;
 boolean Collate;
 
Printer()
{this("Epson","laser",20,100,true);
System.out.println("Invoke the no-arguments....");	
}

Printer(String Brand ){
	this.Brand=Brand;
	System.out.println("Invoke the String  arguments:"+Brand);	
}
Printer(String Brand,String Type ){
	this("Epson");
	this.Type=Type;
  System.out.println("Invoke the String, String arguments: " + Brand + ", " + Type);

}
Printer(String Brand,String Type,int Capacity ){
	this("Epson","laser");
	this.Capacity=Capacity;
    System.out.println("Invoke the String, String, int arguments: " + Brand + ", " + Type + ", " + Capacity);

}
Printer(String Brand,String Type,int Capacity,int NoOFPages ){
	this("Epson","laser",20);
	this.NoOFPages=NoOFPages;
    System.out.println("Invoke the String, String, int , int arguments: " + Brand + ", " + Type + ", " + Capacity+ "," +NoOFPages);
}

Printer(String Brand,String Type,int Capacity,int NoOFPages,boolean Collate ){
	this("Epson","laser",20,100);
	this.Collate=Collate;
    System.out.println("Invoke the String, String, int , int, boolean arguments: " + Brand + ", " + Type + ", " + Capacity+ "," +NoOFPages+ "," +Collate);
