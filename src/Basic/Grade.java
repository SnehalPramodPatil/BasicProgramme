package Basic;

public class Grade {
      public static void main(String args[]) {
    	  int Marks=85;
    	  
    	  if(Marks<40)
    	  {
    		System.out.println("Fail");  
    	  }
    	  else if(Marks>=40 && Marks<=60)
    	  {
    		System.out.println("Grade D");  
    	  }
    	  else if(Marks>=60 && Marks<=75)
    	  {
    		System.out.println("Grade C");  
    	  }
    	  else if(Marks>=75 && Marks<=85)
    	  {
    		System.out.println("Grade B");  
    	  }
    	  else
    	  {
    		System.out.println("Grade A");  
    	  }
      }
}
