package clean.code.book.exceptionanidate;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> datos =  List.of("1","juan","2","Maria","3");

        for (String dato: datos) {
            tratarDato(dato);
        }
    }

    public static void tratarDato(String dato){
        try {
            Integer datoInteger = toInteger(dato);
            System.out.println(datoInteger);
        }catch (NumberFormatException ex){
            throw new RuntimeException(" eSTA ES MI NUEVA EXCEPTION",ex);
        }
    }

    public static Integer toInteger(String value){
        return Integer.parseInt(value);
    }






}
