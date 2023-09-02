package String;

public class DublicateChar {
        public static void main(String args[]) {
        	String str="great responsibility";
        	char ch[]=str.toCharArray();
        	int count;
        	System.out.println("Duplicate characters in given string is: ");
        	for(int i=0;i<ch.length;i++) {
        		count=1;
        		for(int j=i+1;j<ch.length;j++) {
        			if(ch[i]==ch[j] && ch[j]!=' ') {
        				count++;
        				ch[j]='0';  // i dont want to print again the same char
        			}
        		}
      
        		if(count>1 && ch[i]!='0') {
        			System.out.print(ch[i]+" ");
        		}
        	}
        
        }
}
