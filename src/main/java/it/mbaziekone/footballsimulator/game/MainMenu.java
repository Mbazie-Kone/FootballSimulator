package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenu extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// Layout principale (VBox con allineamento centrale)
		VBox menuLayout = new VBox(20);
		menuLayout.setAlignment(Pos.CENTER);
		
		// Pulsante per iniziare una nuova partita
		Button newGameButton = new Button("New Game");
		newGameButton.setPrefWidth(200);
		newGameButton.setOnAction(e -> startNewGame(primaryStage));
		
		// Pulsante per continuare una partita precedente
		Button continueButton = new Button("Continue");
		continueButton.setPrefWidth(200);
		continueButton.setOnAction(e -> continueGame(primaryStage));
		
		// Pulsante per le impostazioni
		Button settingsButton = new Button("Settings");
		settingsButton.setPrefWidth(200);
		settingsButton.setOnAction(e -> openSettings(primaryStage));
		
		
		menuLayout.getChildren().addAll(newGameButton, continueButton, settingsButton);
		
	}

}
