package Abtraction;

abstract class RBIBank{
	public abstract void displayBankName();
	public abstract float getROI();
	public float getRepoRate() {
		return 4.5f;
	}	
}
class SBI extends RBIBank{
	public  void displayBankName() {
		System.out.println("SBI Bank");
	}
	public float getROI() {
		return 8.75f;
	}
}
class HDFC extends RBIBank{
	public  void displayBankName() {
		System.out.println("HDFC Bank");
	}
	public float getROI() {
		return 9.5f;
	}
}
public class TestAbstact {
	public static void main(String args[]) {
 	   RBIBank b1=new SBI();
 	   b1.displayBankName();
 	   System.out.println("Repo Rate: "+b1.getRepoRate()+"%");
 	   System.out.println("ROI: "+b1.getROI()+"%");
 	   System.out.println("*****************");
 	   RBIBank b2=new HDFC();
 	   b2.displayBankName();
 	   System.out.println("Repo Rate: "+b2.getRepoRate()+"%");
 	   System.out.println("ROI: "+b2.getROI()+"%");
    }
}
