import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionCatchExceptionTest {

	@Test
	public void catchMaleExceptionTest() {
		try {
			Feline feline = new Feline();
			String sex = "Бронтозавр";
			Lion lion = new Lion(sex);
		} catch (Exception exception) {
			System.out.println("Используйте допустимые значения пола животного - самец или самка");
		}
	}
}
