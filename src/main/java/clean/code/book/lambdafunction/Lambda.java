package clean.code.book.lambdafunction;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Lambda {


    public static void main(String[] args) {

        //const suma = (a,b)=>a+b;

        BiFunction<Integer, Integer, Integer> sumaLamdba = (a, b) -> a + b;

        Function<Integer,Integer> sumaLamdba2 = (a) -> a + 1;

        Consumer<Integer> sumaLamdba3 = (a) -> System.out.println(a + 1);


        List<String> datos =  List.of("1","juan","2","Maria","3");


        Integer variableExterna = 0;

        for (int i = 0; i <datos.size() ; i++) {
           String x = datos.get(i);
            System.out.println("fori"+x);

            variableExterna++;
        }


        for (String x: datos) {
            System.out.println("for"+x);
            variableExterna++;
        }


        datos.forEach(dato ->{
            System.out.println("forEach"+dato);
        });



        int resultsuma = sumaLamdba.apply(5, 5);
        System.out.println(resultsuma);


        int result = suma(5, 5);
        System.out.println(result);
    }


    public static int suma(int a, int b) {
        return a + b;
    }


}
