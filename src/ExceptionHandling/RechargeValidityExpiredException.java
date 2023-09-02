package ExceptionHandling;

public class RechargeValidityExpiredException extends RuntimeException {
     public RechargeValidityExpiredException(String error) {
    	 super(error);
     }
}
