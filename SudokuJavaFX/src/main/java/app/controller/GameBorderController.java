package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import pkgEnum.eGameDifficulty;

public class GameBorderController implements Initializable {

	private Game game;

	@FXML
	private ToggleGroup tglSudokuSize;

	@FXML
	private ToggleGroup tglDifficulty;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}

	public void setMainApp(Game game) {
		this.game = game;
	}

	public int GetGameSize() {
		RadioMenuItem rmi = (RadioMenuItem) tglSudokuSize.getSelectedToggle();

		return Integer.parseInt(rmi.getText());
	}

	public eGameDifficulty GetGameDifficulty() {
		RadioMenuItem rmi = (RadioMenuItem) tglDifficulty.getSelectedToggle();
		eGameDifficulty eGD = null;

		switch (rmi.getText()) {
		case "Easy":
			eGD = eGameDifficulty.EASY;
			break;
		case " Medium":
			eGD = eGameDifficulty.MEDIUM;
			break;
		case "Hard":
			eGD = eGameDifficulty.HARD;
			break;
		}
		return eGD;
	}

}
