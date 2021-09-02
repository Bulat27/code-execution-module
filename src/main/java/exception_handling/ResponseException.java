package exception_handling;

public class ResponseException extends RuntimeException{

    public ResponseException(String message){
        super(message);
    }
}
