package justfun;
import java.util.function.Predicate;
public class JustFun { public void m(Predicate<String> predicate){ predicate.test("lol"); } }

interface  Funcion{ public Predicate<String> predicate();}
record FuncionImpl(Predicate<String> predicate) implements Funcion{ }

class  Testclass{

    public static void main(String[] args) {
        Funcion lol = new FuncionImpl(x->true);
        lol.predicate();
        System.out.println("despues del predicado");

    }
}
