1)java is a object oriented programming launguage it uses platform in itself only, secure ,fast 
and reliable to code everything.

*javac is java compiler which helps to compile the java program.

2)JDK: java development kit
java is a abbrevation of java development kit it consist of many software development tools and 
supporting libraries combine with the java run time environment and java virtual machin.

use: which build the java application ,applets.

*JRE:java runtime environment is a software which runs the java program corrects,or
 requires to be run the java program perfectly.
*it is implemented by JVM

*JVM: java virtual machine which enable the computer to run the java program and other launguage by converting to byte code

use: converts byte code into machine specific code.

3).java file is a source code can be run by JVM.
   .class file is a byte code which the user can written.
   
   
4)*Eclipse
  *jsectors
   
5) Variable:variable refers to the container to store the value of datatype.
   *variable names are ref to memory location.
   variable types:1)local variable.
				   2)static variable.
				   3)non-static variable or instance variable.
				   
				   
class Banner{
	static String name;
	static int height;
	static double cost;
	
	static void setName(String name){
		Banner.name=name;
	}
	static void setHeight(int height){
		Banner.height=height;
	}
	static void setCost(double cost){
		Banner.cost=cost;
	}
}
				   
*class Metro{
		static void name(){
		System.out.println("banglore");


     }

*class MetroStarter{
	public static void main(String[] args){
		System.out.println("Startig of main method");
		System.out.println("Ending of main method");
	}
}

*Here public is a non static variable
*static is a static variable.
*void is return type.
*main is method name.


6)Object oriented programming launguage represents the real world entitis.
*abstraction.
*encapsulation.
*polymorphism.
*inheritance.
anything in the real world can be considered as object.
 object is nothing but basic unit.
 every object consist of two properties 
 1)state:attributes,properties.
 2)Behaviour:methods
 
7)error:method main is already defined.


8)Datatype: 
	datatype have different in size and values that can be stored in a variable.
	types in Datatype:
	1)primitive Datatype.
	2)Non-primitive Datatype.

*primitive Datatype: the primitive Datatype has single value and have no special capability.
there are 8 primitive Datatypes are there:
	1)int
	2)float
	3)char
	4)double
	5)long
	6)short
	7)byte
	
	
*Non-primitive Datatype: the Non-primitive Datatype are userdefined Datatype.
the class name that defined by the user is known as Non-primitive datatype only.

there are infinity number of Non-primitive Datatypes.
ex:String,Array,Book,Laptop.

calss Book{
	static String name;
	static String color;
	static int size;
	static double cost;
}
 (Here String,String,int,double are the datatypes).
 
 
9)class Color{
	public static void main(String[] args){
	
	System.out.println("color is red");
	}

}


10)Features of java:
   *platform independent.
   *secure.
   *reliable.
   *fast.
   *reuseability.
   *object oriented.
   *interparability.
   
   
11)Array:
  Array consist of different values in a single variable.
  or, sequential memory allocation.
  array can be represented in a square brackets[].
  types of arrays:
  1)single dimensional array.
  2)two dimensional array.
  3)multi-dimensional array.
  
  int[] myNumber={2,3,4,5,6,7,8,9,0};
  
  String[][] colors={{"red","blue","green"}{"black","grey","white"}};
  
  
  
12)class and object:
   class : class is a user-defined blueprint,and it represents attributes or properties within the class.
   
   object : object is a basic unit it represents the two properties
   1)state
   2)behaviour
   
   ex:
class Dustbin{
	static void wastecollection(){
		System.out.println("wastecollection");
	}
	static void storage(){
		System.out.println("storage");
	}
	static void odorcontrol(){
		System.out.println("odorcontrol");
	}
	static void hygiene(){
		System.out.println("Hygiene");
	}
	public static void main(String[] args)
	{
		System.out.println("main class");
		wastecollection();
		storage();
		odorcontrol();
		Hygiene();
	}
}
   
   class Book{
       static String name;
	   static int size;
	   static double cost;
   
    }
   
   
13)keyword: keywords are the reserved words which act like a key for the code.
	keywords can not be used as class name,object or variable.
	
	
	*public
	*if
	*else
	*break
	*continue
	*class
	*case
	*do
	*while
	*access
	*this
	*super
	*private
	*static
	*abstract
	
class Free{
	String what;
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

14)Constructor:
	constructor is special method that can be used to create and intializing values.
	
	there are 3 main tyes
	1)no argument constructor.
	2)default constructor.
	3)parameterized constructor.
	
ex;class Wallet{
	String brand;
	String color;
	double cost;
	
	Wallet(){
	System.out.println("invoking no argument constructor");
	}
	
	Wallet(String name);{
	this.name=name;
	System.out.println("invoking String argument,"+String);
}
}
15)The main() method is static so that JVM can invoke it without instantiating the class.
interface method.
constructor method.

16) 
input array = [12, 3, 2, 45, 6, 7, 6]
array_length = len(input array);
print("The length of the array is:", array.length)

17)method:methods are the block of a code that runs when it is called.
   once the code is written and that can be used whenevr we want.
   
   class Soap{
	static void dissolvingdirty(){
		System.out.println("dissolvingdirty");
	}
	static void rinsing(){
		System.out.println("rinsing");
	}
	static void lirel(){
		System.out.println("lirel");
	}
	static void cleaning(){
		System.out.println("cleaning");
	}
	static void washing(){
		System.out.println("washing");
	}
	public static void main(String[] args){
		System.out.println("this is main class");
		dissolvingdirty();
		rinsing();
		lirel();
		cleaning();
		washing();
	}
}
Method Overloading in java.
 when a class have multiple methods by same name but different parameter is known as method overloading.
 
 
 
 