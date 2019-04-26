package app.controller;

import java.net.URL;
import java.util.ResourceBundle;

import app.Game;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;

public class GameBorderController implements Initializable  {

	private Game game;	
	
	
	@FXML
	private ToggleGroup tglSudokuSize;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {	
	}
	public void setMainApp(Game game)
	{
		this.game = game;
	}
	
	public int GetGameSize()
	{
		RadioMenuItem rmi = (RadioMenuItem)tglSudokuSize.getSelectedToggle();
		
		return Integer.parseInt(rmi.getText());
	}
	
}
