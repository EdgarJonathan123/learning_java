package clean.code.book.records;



public class ClienteRecord {

    private record MyRecord2(String name){}

    private record MyRecord(int param1,MyRecord2 record){};

    public static void main(String[] args) {


        //Java > 16
        //Nativo -> Jvm lo interpreta
        // menos codigo
        CarroDTO carrito = new CarroDTO(5,"Mazda",null);
        carrito.modelo();
        carrito.numeroLlantas();
        carrito.property1();

        //Java > 1
        // agarra en cualguier version de java
        // escribir mucho codigo
        CarroDTO1 carrito1 = new CarroDTO1(5,"Mazda","123");
        carrito1.getModelo();
        carrito1.getNumeroLlantas();
        carrito1.getProperty1();

        //No escribis casi nada de codigo
        //Dependencia de una libreria externa para que funcione

        CarroDTO2 carrito2 = new CarroDTO2(5,"Maz","123");



    }

}
