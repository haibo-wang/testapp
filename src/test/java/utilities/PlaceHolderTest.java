package utilities;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlaceHolderTest {

	@Test
	public void testGetName() {
		PlaceHolder holder = new PlaceHolder();
		assertEquals(holder.getName(), "Hello, World");
	}

}
