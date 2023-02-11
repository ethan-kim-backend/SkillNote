package dykim.skillnote.common;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
@ConfigurationProperties("proptest")
public class CollectionInfos {
    private List<CollectionInfo> collectionInfos;

//    public CollectionInfos collectionInfos(){
//        return new CollectionInfos();
//    }
}
