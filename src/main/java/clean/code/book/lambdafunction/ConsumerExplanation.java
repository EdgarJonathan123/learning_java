package clean.code.book.lambdafunction;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExplanation {


    public static void main(String[] args) {

        List<String> datos =  List.of("1","juan","2","Maria","3");

        miForEach(datos,ConsumerExplanation::metodo);

    }

    public static void miForEach(List<String> lista, Consumer<String> consumer){
        for (int i = 0; i <lista.size() ; i++) {
            String x = lista.get(i);
            consumer.accept(x);
        }
    }

    public static void miforEachSinLambda(List<String> lista){
        for (int i = 0; i <lista.size() ; i++) {
            String x = lista.get(i);
            metodo(x);
        }
    }
    public static void metodo(String dato){
        System.out.println("forEach: "+dato);
        dato = dato + dato;
    }











}
