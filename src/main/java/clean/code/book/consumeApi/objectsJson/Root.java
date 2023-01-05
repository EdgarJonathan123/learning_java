package clean.code.book.consumeApi.objectsJson;

import lombok.Data;

import java.util.List;

@Data
public class Root {
    private List<Ability> abilities;
    private Integer base_experience;
    private List<Form> forms;
    private List<GameIndex> game_indices;
    private Integer height;
    private List<HeldItem> held_items;
    private Integer id;
    private boolean is_default;
    private String location_area_encounters;
    private List<Move> moves;
    private String name;
    private Integer order;
    private List<Object> past_types;
    private Species species;
    private Sprites sprites;
    private List<Stat> stats;
    private List<Type> types;
    private Integer weight;
}
