class Project{
	
	Project()
	{
		System.out.println("this is default constructor with no-argument of Project");

	}
	// System.out.println("person :"+person);
	
	void validate(Person person)
	{
		if(person!=null)
		{
			//person.validate();
			
			if(person instanceof Developer)
			{
				Developer developer=(Developer)person;
				developer.code();
				developer.eat();
				developer.Sleep();
			}
			if(person instanceof Tester)
			{
				Tester tester=(Tester)person;
				tester.qualityCheck();
			}
			if(person instanceof BusinessAnalyst)
			{
				BusinessAnalyst businessanalyst = (BusinessAnalyst)person;
				businessanalyst.checkRequirement();
			}
			if(person instanceof ProductOwner)
			{
				ProductOwner productOwner=(ProductOwner)person;
				productOwner.validate();
			}
			if(person instanceof DataBaseDeveloper)
			{
				DataBaseDeveloper dataBaseDeveloper =(DataBaseDeveloper)person;
				dataBaseDeveloper.runScripts();
			}
			if(person instanceof Devops)
			{
				Devops devops = (Devops)person;
				devops.runBuild();
								
			}
		}
	}
}