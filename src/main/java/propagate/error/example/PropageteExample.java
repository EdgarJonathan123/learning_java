package propagate.error.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

public class PropageteExample {


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class GoogleSheetData {
        private String name;
        private List<List<String>> data;
    }


    public static void main(String[] args) {


    }


    public void process(GoogleSheetData googleSheetData) {

        for (List<String> row : googleSheetData.getData()) {

            String numerCert = row.get(0);
            String codcli =  row.get(1);

            if(codcli.length()< 11){
                throw new RuntimeException("El codigo de cliente debe tener 11 caracteres");
            }

        }

    }


}
