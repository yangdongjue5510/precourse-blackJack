package util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.After;
import org.junit.jupiter.api.Test;

class InputManagerTest {
	private final InputStream systemIn = System.in;
	private ByteArrayInputStream testIn;

	@After
	public void resetSystemIn() {
		System.setIn(systemIn);
	}

	private void inputData(String data) {
		testIn = new ByteArrayInputStream(data.getBytes());
		System.setIn(testIn);
	}

	@Test
	void inputUserNames() {
		inputData("1,2,3\n");
		String[] strings = InputManager.inputUserNames();
		assertEquals(3, strings.length);
		InputManager.inputUserNames();
	}
}