package DictionaryTest;
import Dictionary.Dictionary;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dict;

    @Before
    public  void setUpClass(){
        dict = new Dictionary();
    }
    @Test
    public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

}
