package clean.code.book.consumeApi.objectsJson;

import lombok.Data;

@Data
public class Stat {
    private Integer base_stat;
    private Integer effort;
    private Stat2 stat;
}
