package clean.code.book;

public class Main {
    public static void main(String[] args) {

        try {
           throw new MyException("Ocurrio algun error");
        }catch (MyException e){
            System.out.println("mensaje: "+e.getMessage());
            System.out.println("causa: "+e.getCause());
        }
    }

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }

        public MyException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}