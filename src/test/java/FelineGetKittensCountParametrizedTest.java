import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensCountParametrizedTest {

	private final int kittensCount;          //поле подсчета котят
	private final int expected;              //поле ожидаеый результат

	public FelineGetKittensCountParametrizedTest(int kittensCount, int expected) {                   //конструктор класса
		this.kittensCount = kittensCount;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Object[][] getKittensCount() {
		return new Object[][]{               //наборы тестовых данных
				{2, 2},
				{1, 1},
				{10, 10},
		};
	}

	@Test
	public void getKittensCountTest() {
		Feline feline = new Feline();
		int actual = feline.getKittens(kittensCount);
		assertEquals(expected, actual);
	}


}
