package String;
import java.util.Scanner;
public class VowelsConsonants {
        public static void main(String args[]) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter a String");
        	String str=sc.next();
        	str=str.toLowerCase();
        	int vcount=0,ccount=0;
        	
        	for(int i=0;i<str.length();i++)
        	{
        		char ch=str.charAt(i);
        		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        		{
        			vcount++;
        			System.out.println(ch+" "+"is a vowel");
        		}
        		else if(ch>='a' && ch<='z')
        	    {
        			ccount++;
        			System.out.println(ch+" "+"is a consonant");
       
        		}
        	}
        	System.out.println("total no of vowels: "+vcount);
        	System.out.println("total no of consonants: "+ccount);
        	
        }
}
