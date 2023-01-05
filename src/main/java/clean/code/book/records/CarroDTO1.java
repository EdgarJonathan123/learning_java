package clean.code.book.records;

public final class CarroDTO1 {

    private final int numeroLlantas;
    private final String modelo;
    private final String property1;

    public CarroDTO1(int numeroLlantas, String modelo, String property1) {
        this.numeroLlantas = numeroLlantas;
        this.modelo = modelo;
        this.property1 = property1;
    }

    public int getNumeroLlantas() {
        return numeroLlantas;
    }

    public String getModelo() {
        return modelo;
    }

    public String getProperty1() {
        return property1;
    }
}
