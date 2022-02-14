import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParametrizedTest {


	private final String sex;                            //поле пола животного
	private final boolean expected;                      //поле ожидаемого результата

	public LionDoesHaveManeParametrizedTest(String sex, boolean expected) {
		this.sex = sex;
		this.expected = expected;
	}


	@Parameterized.Parameters
	public static Object[][] getMaleData() {
		return new Object[][]{                       //наборы тестовых данных
				{"Самец", true},
				{"Самка", false},
		};
	}

	@Test
	public void doesHaveManeTest() throws Exception {
		Lion lion = new Lion(sex);
		boolean actual = lion.doesHaveMane();
		assertEquals(expected, actual);
	}


}
