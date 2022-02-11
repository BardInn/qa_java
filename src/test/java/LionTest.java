import com.example.Lion;
import org.junit.Test;


import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionTest {


	@Test
	public void lionGetFoodTest() throws Exception {
		Lion lion = new Lion("Самка");
		List<String> expected = List.of("Животные", "Птицы", "Рыба");
		List<String> actual = lion.getFood();
		assertEquals(expected, actual);
	}


	@Test
	public void lionGetKittensTest() throws Exception {
		Lion lion = new Lion("Самец");
		int expected = 1;
		int actual = lion.getKittens();
		assertEquals(expected, actual);
	}
}
