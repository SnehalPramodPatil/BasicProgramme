package User;
abstract class RBIBank{
	private long accNo;
	public void setaccNo(long accNo) {
		this.accNo=accNo;
	}
	public long getaccNo() {
		return this.accNo;
	}
	public float getrepoRate() {
		return 4.5f;
	}
	public abstract float getROI();
}
class SBI extends RBIBank{
	public float getROI() {
		return 6.5f;
	}
}
class BOI extends RBIBank{
	public float getROI() {
		return 7.2f;
	}
}
public class Assignment {
    public static void main(String args[]) {
    	RBIBank b1=new SBI();
    	b1.setaccNo(245212l);
    	System.out.println("Account no: "+b1.getaccNo());
    	System.out.println("Repo Rate: "+b1.getrepoRate());
    	System.out.println("Rate Of Interest: "+b1.getROI());
    	
    	b1=new BOI();
    	System.out.println("Repo Rate: "+b1.getrepoRate());
    	System.out.println("Rate Of Interest: "+b1.getROI());
    
    }
}
