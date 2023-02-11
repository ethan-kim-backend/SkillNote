package dykim.skillnote.common;

import dykim.skillnote.enums.DataType;
import dykim.skillnote.enums.LanguageType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CollectionInfo {
    DataType dataType;
    LanguageType languageType;
    String name;
}
