package clean.code.book.records;

import lombok.*;

@Builder()
public class CarroDTO2 {

    private final int numeroLlantas;

    private final String modelo;

    private final String property1;
}
