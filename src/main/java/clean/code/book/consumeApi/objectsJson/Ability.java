package clean.code.book.consumeApi.objectsJson;

import lombok.Data;

@Data
public  class Ability {
    private Ability2 ability;
    private boolean is_hidden;
    private Integer slot;
}
