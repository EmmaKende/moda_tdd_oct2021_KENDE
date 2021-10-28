package DictionaryTest;
import Dictionary.Dictionary;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dict;

    @Before
    public  void setUpClass(){
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
        dict.addTranslation("contre", "against");
        dict.addTranslation("salut", "hello");
        assertThat(dict.getTranslation("contre"), equalTo("against"));
        assertThat(dict.getTranslation("salut"), equalTo("hello"));
    }


}
