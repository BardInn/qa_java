import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatGetFoodWithMockTest {

	@Mock
	Feline feline;        //создаем мок

	@Test
	public void catGetFoodTest() throws Exception {
		Cat cat = new Cat(feline);                                         //создание объекта
		Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(feline).eatMeat();  //при вызове feline.eatMeat() вернется список
		List<String> expected = List.of("Животные", "Птицы", "Рыба");      //ожидаеый результат
		List<String> actual = cat.getFood();                          //вызов проверяемого метода
		assertEquals(expected, actual);                               //проверка результата
	}

}
