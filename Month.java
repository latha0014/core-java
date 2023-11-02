class Month{
	
	String name;
	long noOfDays;
	int noOfWeekEnds;
	long noOfHolidays;
	
	Month(String name,long noOfDays,int noOfWeekEnds,long noOfHolidays){
		this.name=name;
		this.noOfDays=noOfDays;
		this.noOfWeekEnds=noOfWeekEnds;
		this.noOfHolidays=noOfHolidays;
	}
	
	displayInfo(){
		System.out.println("starting displayInfo");
		System.out.println(this.noOfDays);
		System.out.println(this.noOfWeekEnds);
		System.out.println(this.noOfHolidays);
		System.out.println("Ending displayInfo");
		
	}
}