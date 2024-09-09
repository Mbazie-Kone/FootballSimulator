package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainMenu extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// "Main layout (VBox with center alignment)"
		VBox menuLayout = new VBox(20);
		menuLayout.setAlignment(Pos.CENTER);
		
		// Ensure VBox takes the full size of the window
        menuLayout.setPrefWidth(Double.MAX_VALUE);
        menuLayout.setPrefHeight(Double.MAX_VALUE);
		
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
		
		// Button to exit the game
        Button exitButton = new Button("Exit Game");
        exitButton.setPrefWidth(200);
        exitButton.setOnAction(e -> exitGame());
		
		// "Add all buttons to the layout"
		menuLayout.getChildren().addAll(newGameButton, continueButton, settingsButton, exitButton);
		
		// "Creation of the main menu scene"
		Scene menuScene = new Scene(menuLayout);
		
		// "Set the scene on the stage"
		primaryStage.setScene(menuScene);
		primaryStage.setFullScreen(true); // Keep the game fullscreen
        primaryStage.setFullScreenExitHint(""); // Hide the "Press Esc to exit fullscreen" hint
        
        // Add an event listener for the "Esc" key to exit fullscreen
        menuScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE) {
                primaryStage.setFullScreen(false);  // Exit fullscreen

                // Adapt the window to the screen size
                primaryStage.setWidth(Screen.getPrimary().getBounds().getWidth() * 0.9);  // Set width to 90% of screen
                primaryStage.setHeight(Screen.getPrimary().getBounds().getHeight() * 0.9); // Set height to 90% of screen
                primaryStage.centerOnScreen();  // Center the window on the screen
         
            }
        });
        
        // Add a listener to detect when the maximize button is clicked
        primaryStage.maximizedProperty().addListener((obs, wasMaximized, isNowMaximized) -> {
            if (isNowMaximized) {
                // Switch to fullscreen when the window is maximized
                primaryStage.setFullScreen(true);
            }
        });

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
    
    // Method to exit the game
    private void exitGame() {
        Platform.exit();  // Closes the application
    }

    public static void main(String[] args) {
        launch(args);
    }

}
