package it.mbaziekone.footballsimulator.game;

import javafx.geometry.Pos;
import javafx.scene.Scene;
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
		
		// Aggiungi tutto al layout
		settingsLayout.getChildren().addAll(volumeLabel, volumeSlider, backButton);
		
		// Creazione della scena per le impostazioni
		Scene settingsScene = new Scene(settingsLayout, 800, 600);
		
		// Imposta la scena sullo stage
		primaryStage.setScene(settingsScene);
		primaryStage.show();
	}
	
	private void returnToMenu(Stage primaryStage) {
		MainMenu mainMenu = new MainMenu();
		mainMenu.start(primaryStage); // Torna al menù principale
	}
}
