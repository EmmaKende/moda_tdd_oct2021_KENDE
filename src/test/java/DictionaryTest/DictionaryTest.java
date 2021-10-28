package DictionaryTest;
import Dictionary.Dictionary;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dict;

    @Before
    public  void initialisation(){
        dict = new Dictionary("Example");
    }

    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

    @Test
    public void testDictionaryIsEmpty(){
        Assert.assertFalse(dict.isEmpty());
    }

    @Test public void testOneTranslation() {
        dict.addTranslation("contre", List.of("against"));
        dict.addTranslation("salut", List.of("hello"));
        assertThat(dict.getTranslation("contre"), equalTo(List.of("against")));
        assertThat(dict.getTranslation("salut"), equalTo(List.of("hello")));
    }

    @Test public void testDeuxTranslation(){
        dict.addTranslation("contre", List.of("against","hi","coucou"));
        assertThat(dict.getTranslation("contre"), containsInAnyOrder("against","hi","coucou"));
    }


}
