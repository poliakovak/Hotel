package exceptions;

public class InvalidDateInputException extends RuntimeException{

    public InvalidDateInputException(String errorMessage) {
        super(errorMessage);
    }

}
