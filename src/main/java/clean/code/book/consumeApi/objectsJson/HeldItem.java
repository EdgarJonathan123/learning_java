package clean.code.book.consumeApi.objectsJson;

import lombok.Data;

import java.util.List;

@Data
public class HeldItem {
    private Item item;
    private List<VersionDetail> version_details;
}
