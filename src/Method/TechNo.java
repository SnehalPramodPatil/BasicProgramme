package Method;


public class TechNo {
	public static void findTechNo(int n) {
   	 int f,l;
   	 f=n%100;
   	 l=n/100;
   	 int sq=(int) Math.pow((f+l),2);
   	 if(sq==n)
   	 {
   		 System.out.println(n+" "+"is a Tech No");
   	 }else
   	 {
   		 System.out.println(n+" "+"is a non Tech No");
   	 }
   }
    public static void main(String args[]) {
   	 // obj=new TechNo();
     	TechNo. findTechNo(2025);  //call using class name 
   	    findTechNo(2025);   //directly call method
}
}
