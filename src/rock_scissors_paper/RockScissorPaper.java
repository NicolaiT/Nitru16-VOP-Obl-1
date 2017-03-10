/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock_scissors_paper;

import java.util.Scanner;

/**
 *
 * @author nicol
 */
public class RockScissorPaper {

	public final static String[] HANDS = new String[]{"Sten", "Saks", "Papir"};
	private String player;
	private String computer;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		RockScissorPaper game = new RockScissorPaper();
		Boolean wantToPlay = true;
		Scanner input = new Scanner(System.in);
		String playerHand = "";
		while (wantToPlay) {
			System.out.println("[0]Sten, [1]Saks or [2]Papir ?");
			playerHand = input.nextLine();

			if (playerHand.contains("0")
					|| playerHand.contains("1")
					|| playerHand.contains("2")) {
				game.play(playerHand);
				System.out.println(game.getWinner());
			} else {
				wantToPlay = false;
				System.out.println("Thanks for playing!");
			}
		}
	}

	/**
	 * @return the player
	 */
	public String getPlayer() {
		return player;
	}

	/**
	 * @return the computer
	 */
	public String getComputer() {
		return computer;
	}

	public void play(String playerHand) {
		int randomizedInt = (int) (Math.random() * 3);

		switch (playerHand) {
			case "0":
				player = HANDS[0];
				break;
			case "1":
				player = HANDS[1];
				break;
			case "2":
				player = HANDS[2];
				break;
		}
		switch (randomizedInt) {
			case 0:
				computer = HANDS[0];
				break;
			case 1:
				computer = HANDS[1];
				break;
			case 2:
				computer = HANDS[2];
				break;
		}
		System.out.println("Dig: " + getPlayer() + "   Computer: " + getComputer());
	}

	public String getWinner() {
		String msg = "";
		if (getPlayer().equalsIgnoreCase(getComputer())) {
			msg = "Uafgjort!";
		} else if (getPlayer().contains("Papir") && getComputer().contains("Saks")
				|| getPlayer().contains("Saks") && getComputer().contains("Sten")
				|| getPlayer().contains("Sten") && getComputer().contains("Papir")) {
			msg = "Computeren vinder!";
		} else {
			msg = "Du vinder!";
		}
		return msg;
	}

}
