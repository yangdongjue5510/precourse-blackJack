package util;

import static util.Constants.*;

import java.util.Scanner;

public class InputManager {
	private static Scanner scanner = new Scanner(System.in);

	public static String[] inputUserNames() {
		String[] splitString;
		do {
			splitString = splitByComma(scanner.nextLine());
		} while (!isNoExceptionStringArray(splitString));
		return splitString;
	}

	private static String[] splitByComma(String inputLine) {
		return inputLine.split(COMMA);
	}

	private static boolean isNoExceptionStringArray(String[] stringArray) {
		try {
			ValidChecker.isValidStringArray(stringArray);
			return true;
		} catch (IllegalArgumentException exception) {
			return false;
		}
	}
}
