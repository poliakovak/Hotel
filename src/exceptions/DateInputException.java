package exceptions;

public class DateInputException extends RuntimeException{

    public DateInputException(String errorMessage) {
        super(errorMessage);
    }

}
