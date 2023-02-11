package dykim.skillnote.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CollectionInfosTest {
    @Autowired
    private CollectionInfos collectionInfos;

    @Test
    public void testProp(){
        System.out.println(collectionInfos);
        Assertions.assertThat(collectionInfos.getCollectionInfos()).isNotNull();
        Assertions.assertThat(collectionInfos.getCollectionInfos()).isNotEmpty();
    }

}