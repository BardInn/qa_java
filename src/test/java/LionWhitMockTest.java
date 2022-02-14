import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionWhitMockTest {

	@Mock
	Feline feline;         //создание мок


	@Test
	public void lionGetFoodTest() throws Exception {
		Lion lion = new Lion(feline);                              //создание объекта
		Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(feline).eatMeat();      //при вызове feeline.eatMeat() вернется список
		List<String> expected = List.of("Животные", "Птицы", "Рыба");       //ожидаемый результат
		List<String> actual = lion.getFood();                             //вызов проверяемого метода
		assertEquals(expected, actual);                                   //проверка результата
	}


	@Test
	public void lionGetKittensTest() {
		Lion lion = new Lion(feline);                    //создание объекта
		Mockito.doReturn(1).when(feline).getKittens();     //при вызове feline.getKittens вернется 1
		int expected = 1;                                              //ожидаеый результат
		int actual = lion.getKittens();                                //вызов проверяемого метода
		assertEquals(expected, actual);                                //проверка результата
	}
}
