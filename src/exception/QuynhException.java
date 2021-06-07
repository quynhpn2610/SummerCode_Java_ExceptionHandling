package exception;

public class QuynhException extends Exception {
    public QuynhException() {
        System.out.println("Em Be Tin hu lam");
    }

    public QuynhException(String message) {
        System.out.println("Em Be Tin hu lam");
    }

    public QuynhException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuynhException(Throwable cause) {
        super(cause);
    }

    public QuynhException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
