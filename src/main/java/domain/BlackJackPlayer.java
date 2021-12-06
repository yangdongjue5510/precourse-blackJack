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

	public void startBlackJack() {
		setPlayers();
	}

	private void setPlayers() {
		OutputManager.askUserNames();
		String[] strings = InputManager.inputUserNames();

	}

}
