package com.meritamerica.assignment1;

	
public class MeritAmericaBankApp {

	public static void main(String[] args) {
		
		AccountHolder Holder1 = new AccountHolder("Luna", "the", "cat", "123-45-6789", 100, 1000);
	
		System.out.println("-----------------------------------------");
	    System.out.println("   Welcome to Merit America Bank App!");
	    System.out.println("    Your account details are below:");
	    System.out.println("-----------------------------------------");
	
	
	    System.out.println(Holder1.toString());
	    

	    
	    
        System.out.println("-----------------------------------------");
        System.out.println("         Transaction Complete");
        System.out.println("-----------------------------------------");
	    
	    
	    
	}

}


