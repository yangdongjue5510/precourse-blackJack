package util;

import static util.Constants.*;

public class ExceptionMaker {
	private static void exceptionMake(String exceptionMessage) {
		System.out.println(exceptionMessage);
		throw new IllegalArgumentException(exceptionMessage);
	}

	public static void invalidStringException() {
		exceptionMake(ERROR_INVALID_STRING);
	}

	public static void invalidNumberException() {
		exceptionMake(ERROR_INVALID_NUMBER);
	}

	public static void invalidYesOrNoException() {
		exceptionMake(ERROR_INVALID_YES_NO);
	}
}
