package domain;

import java.util.ArrayList;
import java.util.List;

import domain.user.Dealer;
import domain.user.Player;
import util.InputManager;
import util.OutputManager;

public class BlackJackPlayer {
	private Dealer dealer = new Dealer();
	private List<Player> players = new ArrayList<>();
	private CardManager cardManager = new CardManager();

	public void startBlackJack() {
		setPlayers();
		firstTurn();
		playTurn();
	}

	private void setPlayers() {
		OutputManager.askUserNames();
		for(String name : InputManager.inputUserNames()) {
			OutputManager.askUserBetting(name);
			double userBetting = InputManager.inputUserBetting();
			players.add(new Player(name, userBetting));
		}
	}

	private void firstTurn() {
		OutputManager.startFirstTurn(players);
		cardManager.giveTwoCardEach(dealer, players);
		OutputManager.showCardStatus(dealer, players);
	}

	private void playTurn() {
		players.stream().forEach(player -> playerTurn(player));
	}

	private void playerTurn(Player player) {
		boolean playerGetCard = false;
		while (playerCanGetCard(player) && playerCardDecision(player)) {
			giveOneCardToPlayer(player);
			playerGetCard = true;
		}
		if (playerGetCard == false) {
			OutputManager.showPlayerCards(player);
		}
	}

	private boolean playerCanGetCard(Player player) {
		if (player.sumCards() > 21) {
			return false;
		}
		return true;
	}

	private boolean playerCardDecision(Player player) {
		OutputManager.askPlayerGetCard(player.getName());
		if (InputManager.inputUserGetCard()) {
			return true;
		}
		return false;
	}

	private void giveOneCardToPlayer(Player player) {
		cardManager.giveOneCard(player);
		OutputManager.showPlayerCards(player);
	}
}
