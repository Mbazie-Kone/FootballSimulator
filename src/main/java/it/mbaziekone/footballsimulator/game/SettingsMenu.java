package it.mbaziekone.footballsimulator.game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SettingsMenu {
	
	public void start(Stage primaryStage) {
		
		VBox settingsLayout = new VBox(20);
		settingsLayout.setAlignment(Pos.CENTER);
		
		
		Label volumeLabel = new Label("Music volume:");
		Slider volumeSlider = new Slider(0, 100, 50); // Min: 0, Max: 100, Default: 50
		
		
		Button backButton = new Button("Return to menu");
		backButton.setOnAction(e -> returnToMenu(primaryStage));
	}
}
