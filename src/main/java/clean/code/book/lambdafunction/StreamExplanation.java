package clean.code.book.lambdafunction;

import lombok.Builder;

import java.util.Collection;
import java.util.List;

public class StreamExplanation {

    @Builder
    public record User(String name,int age) {
        public  User addYears(Integer years){
            return new User(name,age+years);
        }
        public User changeName(String name){
            return new User(name,age);
        }
    }

    public static void main(String[] args) {

        Collection<User> users = List.of(new User("Mario",37),new User("Kennet",24),new User("Pablo",37),new User("Luis",15));
        System.out.println(users);
        List<User> usuariosCon5MasEdad = users.stream().map(x->x.changeName("lolsito")).toList();
        System.out.println(usuariosCon5MasEdad);
    }

    public static User add5Years(User user){
        return new User(user.name(),user.age()+5);
    }

}
