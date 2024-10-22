import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class sqr_test {

	@Test
	public void test() {
		unittesting obj=new unittesting();
		int output=obj.square(5);
		assertEquals(28, output);

	}

}
