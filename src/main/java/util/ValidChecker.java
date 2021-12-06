package util;

public class ValidChecker {
	public static void isValidStringArray(String[] array) {
		for (String string : array) {
			isNotEmptyString(string);
		}
	}

	public static void isValidLong(String string) {
		for (char digit : string.toCharArray()) {
			isNotNumber(digit);
		}
	}

	public static void isValidYesNo(String string) {
		if (!string.equals("y") && !string.equals("n")) {
			ExceptionMaker.invalidYesOrNoException();
		}
	}

	private static void isNotEmptyString(String string) {
		if (string.equals("")) {
			ExceptionMaker.invalidStringException();
		}
	}

	private static void isNotNumber(char digit) {
		if (digit < '0' || digit > '9') {
			ExceptionMaker.invalidNumberException();
		}
	}
}
