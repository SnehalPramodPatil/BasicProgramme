package Basic;

public class Alphabet {
      public static void checkAlphabet(char ch) {
    	  
    	  if((ch>='A' && ch<='Z') ||(ch>='a' && ch<='z')) {
    		  System.out.println(ch+" "+"is an alphabet"); 
    	  }
    	  else 
    	  {
    		  System.out.println(ch+" "+"is not an alphabet"); 
    	  }
    	 
      }
      public static void main(String args[]) {
    	  Alphabet obj=new Alphabet();
    	  obj.checkAlphabet('5');
      }
}
