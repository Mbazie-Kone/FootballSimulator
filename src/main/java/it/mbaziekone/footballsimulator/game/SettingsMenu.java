package it.mbaziekone.footballsimulator.game;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SettingsMenu {
	
	public void start(Stage primaryStage) {
		
		// Layout delle impostazioni
		VBox settingsLayout = new VBox(20);
		settingsLayout.setAlignment(Pos.CENTER);
		
		// Slider per il volume della musica
		Label volumeLabel = new Label("Music volume:");
		Slider volumeSlider = new Slider(0, 100, 50); // Min: 0, Max: 100, Default: 50
		
		// Pulsante per tornare al menù principale
		Button backButton = new Button("Return to menu");
		backButton.setOnAction(e -> returnToMenu(primaryStage));
		
		
		settingsLayout.getChildren().addAll(volumeLabel, volumeSlider, backButton);
	}
}
