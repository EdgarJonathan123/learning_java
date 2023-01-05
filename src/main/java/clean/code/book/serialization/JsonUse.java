package clean.code.book.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.json.JSONObject;
import java.util.List;

public class JsonUse {

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    static class ExcelData{
       private String name;
       private String url;
       private List<List<String>> values;

       public String toJson(){
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("name", name);
           jsonObject.put("url", url);
           jsonObject.put("values", values);
          return jsonObject.toString();
       }
    }


    public static void main(String[] args) {
        ExcelData excelData = new ExcelData();
        excelData.setName("name");
        excelData.setUrl("url");
        excelData.setValues(
                List.of(
                    List.of("01", "02", "03"),
                    List.of("11", "12", "13")
                )
        );

        System.out.println(excelData.toJson());
    }
}
