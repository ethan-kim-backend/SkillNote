package dykim.skillnote.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

//https://prod.velog.io/@hailey_/TIL-enum
@AllArgsConstructor
public enum LanguageType {
    ko("ko"), // all these enums give error, for no constructor
    en("en");

    @Getter private String value;
}