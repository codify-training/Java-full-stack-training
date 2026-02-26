class CarSpec{
	
	//instance variable.
	int carMilegeSpec;
	static String carCompany;
	void carDecAnalysis(){
		System.out.println("instance variable: "+carMilegeSpec);
		System.out.println("Satic variable : "+ carCompany);
		
	}
	
	void doCarSpecAnalysis(){
	   //Local Variable demo
	   int carPrice = 10;
       System.out.println("localvariable : "+carPrice);
	   System.out.println(carMilegeSpec);
	   System.out.println("Satic variable : "+ carCompany);  
	}	
		
}

class VariableDemo{
    public static void main(String args[]){	  
   	  CarSpec.carCompany = "Ford";
	  
	  CarSpec carspec = new CarSpec();
	  carspec.carMilegeSpec = 20;
	  carspec.doCarSpecAnalysis();
	  carspec.carDecAnalysis();	
	  
	  
	  System.out.println("-------------------------");
	  System.out.println("");
	  
	  
	  CarSpec carspec2 = new CarSpec();
	  carspec2.carMilegeSpec = 30;
	  carspec2.doCarSpecAnalysis();
	  carspec2.carDecAnalysis();	
	  
	}	
}