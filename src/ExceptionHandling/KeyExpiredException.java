package ExceptionHandling;

public class KeyExpiredException extends RuntimeException {
	public KeyExpiredException(String error) {
		super(error);
	}

}
