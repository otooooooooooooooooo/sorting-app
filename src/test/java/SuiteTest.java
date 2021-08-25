import com.oto.classTests.ExceptionTest;
import com.oto.classTests.SortTest;
import com.oto.classTests.InputMapperTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Class provides Suited test for all test classes
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({ExceptionTest.class, InputMapperTest.class, SortTest.class})
public class SuiteTest {

}
