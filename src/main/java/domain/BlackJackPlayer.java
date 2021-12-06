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


}
