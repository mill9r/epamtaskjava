package task2.exception;

/**
 * Created by Administrator on 2/9/2017.
 */
public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
        super();
    }
}
