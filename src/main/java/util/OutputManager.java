package util;

import static util.Constants.*;

public class OutputManager {

	public static void askUserNames() {
		System.out.println(MESSAGE_USERNAME_INPUT);
	}

	public static void askUserBetting(String userName) {
		System.out.println(userName + MESSAGE_USERBETTING_INPUT);
	}
}
