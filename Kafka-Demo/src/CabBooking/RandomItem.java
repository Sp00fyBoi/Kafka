package CabBooking;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class RandomItem {
	

	public static String randomElement(String[] array) {
		Random r = new Random();
		return array[r.nextInt(array.length)];
	}
	
}