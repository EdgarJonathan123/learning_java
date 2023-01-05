package clean.code.book.builider;

public class MyObjectClient {

        public void usarMyObject () {
            MyObject.Builder builder = new MyObject.Builder();
            builder.setProperty1("Hola")
                    .setProperty2("Mundo");
            MyObject myObject = builder.build();
        }

}
