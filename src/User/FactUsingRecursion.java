package User;

public class FactUsingRecursion {
     public long getFact(long no) {
//    	if(no==0) {
//    		return 1;
//    	}
//    		return no*getFact(no-1);
//    	
    	 if(no>=1) {
    		 return no*getFact(no-1);
    	 }
    	    return 1;
     }
     public static void main(String args[]) {
    	 FactUsingRecursion f1=new FactUsingRecursion();
    	// long no=5l;
    	 System.out.println("Factorial is "+f1.getFact(5));
     }
}
