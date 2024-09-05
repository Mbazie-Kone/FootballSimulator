package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainMenu extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// "Main layout (VBox with center alignment)"
		VBox menuLayout = new VBox(20);
		menuLayout.setAlignment(Pos.CENTER);
		
		// Button to start a new game
		Button newGameButton = new Button("New Game");
		newGameButton.setPrefWidth(200);
		newGameButton.setOnAction(e -> startNewGame(primaryStage));
		
		// Button to continue a previous game
		Button continueButton = new Button("Continue");
		continueButton.setPrefWidth(200);
		continueButton.setOnAction(e -> continueGame(primaryStage));
		
		// Button for settings
		Button settingsButton = new Button("Settings");
		settingsButton.setPrefWidth(200);
		settingsButton.setOnAction(e -> openSettings(primaryStage));
		
		// "Add all buttons to the layout"
		menuLayout.getChildren().addAll(newGameButton, continueButton, settingsButton);
		
		// "Creation of the main menu scene"
		Scene menuScene = new Scene(menuLayout, 800, 600);
		
		// "Set the scene on the stage"
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}
	
	// Method to start a new game
    private void startNewGame(Stage primaryStage) {
        // Codice per iniziare una nuova partita
        System.out.println("Start new game");
        
    }

    // Metodo per continuare una partita precedente
    private void continueGame(Stage primaryStage) {
        // Codice per continuare una partita salvata
        System.out.println("Load game");
        
    }

    // Metodo per aprire le impostazioni del gioco
    private void openSettings(Stage primaryStage) {
        // Codice per aprire il menu delle impostazioni
        System.out.println("Open settings");
     
    }

    public static void main(String[] args) {
        launch(args);
    }

}
