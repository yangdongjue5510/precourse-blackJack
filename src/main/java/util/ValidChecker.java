package util;

public class ValidChecker {
	public static void isValidStringArray(String[] array) {
		for (String string : array) {
			isNotEmptyString(string);
		}
	}

	private static void isNotEmptyString(String string) {
		if (string == null) {
			ExceptionMaker.invalidStringException();
		}
	}
}
