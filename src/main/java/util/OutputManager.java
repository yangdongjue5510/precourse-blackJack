package util;

import static util.Constants.*;

import java.util.List;

import domain.card.Card;
import domain.user.Dealer;
import domain.user.Person;
import domain.user.Player;

public class OutputManager {

	public static void askUserNames() {
		System.out.println(MESSAGE_USERNAME_INPUT);
	}

	public static void askUserBetting(String userName) {
		System.out.println(userName + MESSAGE_USERBETTING_INPUT);
	}

	public static void startFirstTurn(List<Player> list) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("딜러와 ")
			.append(makePlayersToString(list))
			.append("에게 2장을 나누었습니다.");
		System.out.println(stringBuilder);
	}

	public static void showCardStatus(Dealer dealer, List<Player> list) {
		System.out.println("딜러 : " + getCardString(dealer));
		list.stream()
			.forEach(player -> System.out.println(player.getName()+ " : " + getCardString(player)));
	}

	private static String makePlayersToString(List<Player> list) {
		StringBuilder stringBuilder = new StringBuilder();
		list.stream().forEach(player -> stringBuilder.append(player.getName()).append(", "));
		return deleteLastCommaSpace(stringBuilder);
	}

	private static <T extends Person> String getCardString(T t) {
		StringBuilder stringBuilder = new StringBuilder();
		List<Card> cards = t.getCards();
		cards.stream().forEach(card -> stringBuilder.append(card).append(", "));
		return deleteLastCommaSpace(stringBuilder);
	}

	private static String deleteLastCommaSpace(StringBuilder stringBuilder) {
		int stringIndex = stringBuilder.length();
		stringBuilder.delete(stringIndex -2 , stringIndex-1);
		return stringBuilder.toString();
	}
}
