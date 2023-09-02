package DesignPatternBankAccount;

public class BankAccountFactory {
      public static BankAccount createAccount(String type) {
    	  BankAccount b1=null;
    	  
    	  if(type.equalsIgnoreCase("P")) {
    		  b1=new PersonalAccount();
    	  }
    	  
    	  else if(type.equalsIgnoreCase("B")) {
    		  b1=new BusinessAccount();
    	  }
    	  
    	  else if(type.equalsIgnoreCase("C")) {
    		 b1=new CheckingAccount();
    	  }
    	  
    	  else {
    		  System.out.println("Invalid Type");
    	  }
    	  
    	  return b1;
      }
}
