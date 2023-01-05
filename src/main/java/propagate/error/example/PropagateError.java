package propagate.error.example;

public class PropagateError {

    public static class MyObject{
        private String name;
        private Long numero;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getNumero() {
            return numero;
        }

        public void setNumero(Long numero) {
            this.numero = numero;
        }
    }

    public static class MyException extends RuntimeException{
        public MyException(String message) {
            super(message);
        }

        public MyException(String message, Throwable cause) {
            super(message, cause);
        }
    }

    public static Long toLong(String value){
        try{
            return Long.valueOf(value);
        }catch (NumberFormatException ex){
            throw new MyException("La celda: '"+value+"' deberia ser un entero.",ex);
        }
    }


    public static void main(String[] args) {

        try {
            MyObject myObject = new MyObject();
            myObject.setName("John");
            myObject.setNumero(toLong("1w23"));

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }


}
