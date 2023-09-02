package String;

public class RevSentences {
       public static void main(String args[]) {
    	   
    	   String str="java is boss";
    	   String word="";
    	   String revSen="";
    	   str=str+" ";
    	   for(int i=0;i< str.length();i++) {
    		   if(str.charAt(i)!=' ') {
    			   word+=str.charAt(i);
    		   }else
    		   {
    			   revSen=word+" "+revSen;
    			   word="";
    		   }
    	   }
    	   System.out.println("Reverse Sentences is : "+revSen);
       }
}
