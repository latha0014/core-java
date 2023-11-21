class PersonStarter{

			public static void main(String args[])
			{
        			System.out.println("Starting from main method wire");
					
					Person person = new Person();
					Developer developer = new Developer();
					Tester tester =new Tester();
					BusinessAnalyst businessanalyst =new BusinessAnalyst();
					ProductOwner productOwner=new ProductOwner();
					DataBaseDeveloper databaseDeveloper=new DataBaseDeveloper();
					Devops devops =new Devops();
					
					Project project=new Project();
					
					project.validate(person);
					project.validate(developer);
					project.validate(tester);
					project.validate(businessanalyst);
					project.validate(productOwner);
					project.validate(databaseDeveloper);
					project.validate(devops);
					
				    System.out.println("endinging from main method wire");
					}
		


}