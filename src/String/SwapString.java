
package String;

public class SwapString {
     public static void main(String args[]) {
    	 String str1="cloud";
    	 String str2="tech";
    	 System.out.println("first String before swapping: "+str1);
    	 System.out.println("Second String before swapping: "+str2);
    	 
    	 //using third variable
//    	 String temp =str1;
//    	 str1=str2;
//    	 str2=temp;
    	 
    	 //without using third variable
    	 str1=str1+str2;  //cloudtech
    	 str2=str1.substring(0,str1.length()-str2.length());  //0,(9-4)
    	 str1=str1.substring(str2.length());
    	 
    	 System.out.println("first String after swapping: "+str1);
    	 System.out.println("Second String after swapping: "+str2);
    	 
     }
}
