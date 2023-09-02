package Method;

import java.util.Scanner;
public class ArmstrongNo {
	 void checkArmstrong(int n) {
     	int rem,Sum=0,orignal=n;
     	while(n>0)
     	{
     		rem=n%10;
     		Sum=Sum+(rem*rem*rem);
     		n=n/10;
     	}
     	if(Sum==orignal)
     	{
     		System.out.println(orignal+" "+"is a Armstrong No");
     	}else
     	{
     		System.out.println(orignal+" "+"is a not Armstrong No");
     	}
     }
     public static void main(String args[]) {
     	Scanner sc=new Scanner(System.in);
     	int n=sc.nextInt();
     	ArmstrongNo obj=new ArmstrongNo();
     	obj.checkArmstrong(n);
     }
}
