package Bank;

public class BankDetails {
  String name;
  String ifsc;
  private int accountNo;

  final static String bankName="SBI";
 
  public BankDetails(){
	  
  }
  public BankDetails(String name,String ifsc) {
	  this.name=name;
	  this.ifsc=ifsc;
  }
  
  public int getaccountNo() {
	  return this.accountNo;
  }
  public void setaccountNo(int accountNo) {
	  this.accountNo=accountNo;
  }
}
