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
        assertThat(dict.isEmpty(),equalTo(false));
    }

}
