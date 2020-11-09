package errorHandler;

/**
 * Created by Alireza on 6/28/2015.
 */
public class ErrorHandler {
    private boolean hasError = false;
    private static ErrorHandler errorHandler = new ErrorHandler();

    private ErrorHandler() {
    }

    public boolean getHasError() {
        return hasError;
    }

    public static ErrorHandler getInstance() {
        return errorHandler;
    }

    public void printError(String msg) {
        hasError = true;
        System.out.println(msg);
    }
}
