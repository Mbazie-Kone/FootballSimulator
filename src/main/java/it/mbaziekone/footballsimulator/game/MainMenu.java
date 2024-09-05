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
		
		// Aggiungi tutti i pulsanti al layout
		menuLayout.getChildren().addAll(newGameButton, continueButton, settingsButton);
		
		// Creazione della scena per il menù principale
		Scene menuScene = new Scene(menuLayout, 800, 600);
		
		// Imposta la scena sullo stage
		primaryStage.setScene(menuScene);
		primaryStage.show();
	}
	
	// Metodo per avviare una nuova partita
    private void startNewGame(Stage primaryStage) {
        // Codice per iniziare una nuova partita
        System.out.println("Start new game");
        // Qui potresti passare a una nuova schermata o inizializzare i dati del gioco
    }

    // Metodo per continuare una partita precedente
    private void continueGame(Stage primaryStage) {
        // Codice per continuare una partita salvata
        System.out.println("Load game");
        // Qui potresti caricare i dati da un file di salvataggio
    }

    // Metodo per aprire le impostazioni del gioco
    private void openSettings(Stage primaryStage) {
        // Codice per aprire il menu delle impostazioni
        System.out.println("Open settings");
        // Qui puoi aprire una nuova finestra con le opzioni di impostazione
    }

    public static void main(String[] args) {
        launch(args);
    }

}
