package lessonExcption;

public class UnccurentAgeException extends Exception {
    public UnccurentAgeException() {
    }

    public UnccurentAgeException(String message) {
        super(message);
    }

    public UnccurentAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnccurentAgeException(Throwable cause) {
        super(cause);
    }

    public UnccurentAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
