package DictionaryTest;
import Dictionary.Dictionary;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class DictionaryTest {
    Dictionary dict;

    @BeforeClass
    public void setUpClass(){
        dict = new Dictionary("Example");
    }
    @Test public void testDictionaryName() {
        assertThat(dict.getName(), equalTo("Example"));
    }

}
