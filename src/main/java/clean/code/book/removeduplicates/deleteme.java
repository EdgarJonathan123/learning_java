package clean.code.book.removeduplicates;

import org.la4j.Vector;
import org.la4j.Vectors;
import org.la4j.vector.dense.BasicVector;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class deleteme {


    public static void main(String[] args) {


        Vector a = new BasicVector(new double[]{ 1.0, 2.0, 3.0 });
        double norm0   = a.fold(Vectors.mkEuclideanNormAccumulator()); // Euclidean Norm
        double norm1   = a.fold(Vectors.mkManhattanNormAccumulator()); // Manhattan Norm
        double normMax = a.fold(Vectors.mkInfinityNormAccumulator());  // Infinity Norm
        //When norm is available, the distance between two vectors can be calculated as:
               a = new BasicVector(new double[]{ 1.0, 2.0, 3.0 });
        Vector b = new BasicVector(new double[]{ 4.0, 5.0, 6.0 });
        // the distance between vectors 'a' and 'b' in terms of Manhattan space
        double distance = a.subtract(b).fold(Vectors.mkManhattanNormAccumulator());
        //You also can use norm in order to normalize the vector's components:
            a = new BasicVector(new double[]{ 1.0, 2.0, 3.0 });
        double norm = a.fold(Vectors.mkEuclideanNormAccumulator());
        // normalize 'b' in terms of Eucludean space
             b = a.divide(norm);


        Stream.iterate(1, i -> i + 1)
                .limit(100)
                .forEach(System.out::println);


        generateListWithRamdomNumbers(3).forEach(deleteme::PrintList);
    }
    public  static <T>  void   PrintList(T item) {
        System.out.println("item = " + item);
    }
    public static List<Double> generateListWithRamdomNumbers(Integer size) {
        List<Double> result = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            result.add(Math.random()*100);
        }
        return result;
    }

}
