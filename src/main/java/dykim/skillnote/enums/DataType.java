package dykim.skillnote.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DataType {
    DISAMBIGUATION("DISAMBIGUATION"),
    DISPLAY("DISPLAY"),
    ENTITY("ENTITY"),
    STOPWORD("STOPWORD"),
    DATA_EXTRACTION("DATA_EXTRACTION");

    @Getter
    private String value;
}