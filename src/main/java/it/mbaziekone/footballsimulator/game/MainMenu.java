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
		Scene menuScene = new Scene(menuLayout);
		
		// "Set the scene on the stage"
		primaryStage.setScene(menuScene);
		
		// Ensure fullscreen is maintained
        primaryStage.setFullScreen(true);
        
		primaryStage.show();
	}
	
	// Method to start a new game
    private void startNewGame(Stage primaryStage) {
        // Code to start a new game
        
        
    }

    // Method to continue a previous game
    private void continueGame(Stage primaryStage) {
        // Code to continue a saved game
       
        
    }

    // Method to open the game settings
    private void openSettings(Stage primaryStage) {
        // Code to open the settings menu
        
     
    }

    public static void main(String[] args) {
        launch(args);
    }

}
