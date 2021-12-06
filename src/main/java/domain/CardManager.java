package domain;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

import domain.card.Card;
import domain.card.CardFactory;
import domain.user.Dealer;
import domain.user.Person;
import domain.user.Player;

public class CardManager {
	private List<Card> gameCard;
	private Set<Integer> usedCard = new LinkedHashSet<>();

	CardManager() {
		gameCard = CardFactory.create();
	}

	public void giveTwoCardEach(Dealer dealer, List<Player> playerList) {
		for (int i = 0 ; i < 2 ; i++) {
			dealer.addCard(getOneCard());
			playerList.stream().forEach(player -> player.addCard(getOneCard()));
		}
	}

	public void giveOneCard(Person person) {
		person.addCard(getOneCard());
	}

	private Card getOneCard() {
		int index = findIndex();
		Card card = gameCard.get(index);
		usedCard.add(index);
		return card;
	}

	private int findIndex() {
		int index;
		do {
			Random random = new Random();
			index = random.nextInt(gameCard.size());
		} while(usedCard.contains(index));
		return index;
	}
}
