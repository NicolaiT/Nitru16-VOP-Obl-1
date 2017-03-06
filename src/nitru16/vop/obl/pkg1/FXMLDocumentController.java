/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nitru16.vop.obl.pkg1;

import java.io.File;
import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import nitru16.vop.obl.pkg1.rock_scissors_paper.RockScissorPaper;

/**
 *
 * @author Nicolai
 */
public class FXMLDocumentController implements Initializable {

	@FXML
	private Label computerHand;
	@FXML
	private Button sten;
	@FXML
	private Button saks;
	@FXML
	private Button papir;
	@FXML
	private Label result;

	private RockScissorPaper game = new RockScissorPaper();
	private Map<String, Image> picMap = new HashMap<>();
	@FXML
	private ImageView playerHandPicture;
	@FXML
	private ImageView computerHandPicture;

	@FXML
	private void pressedRock(ActionEvent event) {
		game.play("0");
		updateComputerHandLabel();
		updateResultLabel();
		playerHandPicture.setImage(picMap.get(game.getPlayer()));
		computerHandPicture.setImage(picMap.get(game.getComputer()));
	}

	@FXML
	private void pressedScissor(ActionEvent event) {
		game.play("1");
		updateComputerHandLabel();
		updateResultLabel();
		playerHandPicture.setImage(picMap.get(game.getPlayer()));
		computerHandPicture.setImage(picMap.get(game.getComputer()));
	}

	@FXML
	private void pressedPaper(ActionEvent event) {
		game.play("2");
		updateComputerHandLabel();
		updateResultLabel();
		playerHandPicture.setImage(picMap.get(game.getPlayer()));
		computerHandPicture.setImage(picMap.get(game.getComputer()));
	}

	private void updateComputerHandLabel() {
		computerHand.setText("Computer: " + game.getComputer());
	}

	private void updateResultLabel() {
		result.setText(game.getWinner());
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		picMap.put(RockScissorPaper.HANDS[0],
				new Image(new File("Rock.png").toURI().toString()));
		picMap.put(RockScissorPaper.HANDS[1],
				new Image(new File("Scissors.png").toURI().toString()));
		picMap.put(RockScissorPaper.HANDS[2],
				new Image(new File("Paper.png").toURI().toString()));
	}

}
