class Technology{
	String name;
	String scope;
	String importance;
	String benefits;
	String type;
	String uses;
	double fee;
	String features;
	String example;
	String application;
	String impact;
	
	
	Technology(String name,String scope,String importance,String benefits,String type,String uses,double fee,String features,String example,String application,String impact);
	this.name=name;
	this.scope=scope;
	this.importance=importance;
	this.benefits=benefits;
	this.type=type;
	this.uses=uses;
	this.fee=fee;
	this.features=features;
	this.example=example;
	this.application=application;
	this.impact=impact;
	
	displayInfo(){
		System.out.println)"starting displayInfo");
		System.out.println(this.name);
		System.out.println(this.scope);
		System.out.println(this.importance);
		System.out.println(this.benefits);
		System.out.println(this.type);
		System.out.println(this.uses);
		System.out.println(this.fee);
		System.out.println(this.features);
		System.out.println(this.example);
		System.out.println(this.application);
		System.out.println(this.impact);
		System.out.println("ending displayInfo");
		
	}
}