import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatGetSoundTest {

	@Test
	public void getSoundTest(){
		Feline feline = new Feline();
		Cat cat = new Cat(feline);
		String expected = "Мяу";
		String actual = cat.getSound();
		assertEquals(expected, actual);
	}
}
