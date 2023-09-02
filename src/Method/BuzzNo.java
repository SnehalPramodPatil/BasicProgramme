package Method;

public class BuzzNo {
	public void checkBuzzNo(int n) {
   	 if(n%10==7 || n%7==0) 
   	 {
   		 System.out.println(n+" "+"is a Buzz No");
   	 }else
   	 {
   		 System.out.println(n+" "+"is a not Buzz No");
   	 }
  }
    
    public static void main(String args[]) {
   	 BuzzNo obj=new BuzzNo();
   	 obj.checkBuzzNo(17);
   }
}
