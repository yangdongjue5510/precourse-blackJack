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

	public static double inputUserBetting() {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while(!isNoExceptionNumber(inputLine));
		return Double.parseDouble(inputLine);
	}

	public static boolean inputUserGetCard() {
		String inputLine;
		do {
			inputLine = scanner.nextLine();
		} while(!isNoExceptionYesNo(inputLine));
		return isYesString(inputLine);
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

	private static boolean isNoExceptionNumber(String string) {
		try {
			ValidChecker.isValidLong(string);
			return true;
		} catch (IllegalArgumentException exception) {
			return false;
		}
	}

	private static boolean isNoExceptionYesNo(String string) {
		try {
			ValidChecker.isValidYesNo(string);
			return true;
		} catch (IllegalArgumentException exception) {
			return false;
		}
	}

	private static boolean isYesString(String string) {
		if (string.equals("y")) {
			return true;
		}
		return false;
	}
}
