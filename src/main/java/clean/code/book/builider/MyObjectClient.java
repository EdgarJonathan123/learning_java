package clean.code.book.builider;

public class MyObjectClient {

    private String property1;
    private String property2;
    private  String property3;
        public void usarMyObject () {

        }


        public void testMethod(){

            if(property1!=null){ return; }
            if(property2!=null){ return; }
            if(property3!=null){ return; }

            //hacer algo


        }

}
