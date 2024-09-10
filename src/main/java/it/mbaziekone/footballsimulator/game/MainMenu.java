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
		menuLayout.setStyle("-fx-padding: 40px; -fx-background-color: #2c3e50;"); // Add padding and background color

		// Ensure VBox takes the full size of the window
		menuLayout.setPrefWidth(Double.MAX_VALUE);
		menuLayout.setPrefHeight(Double.MAX_VALUE);

		// Button to start a new game
		Button newGameButton = new Button("New Game");
		newGameButton.setPrefWidth(200);
		newGameButton.setOnAction(e -> startNewGame(primaryStage));
		styleButton(newGameButton);  // Apply the style to the button

		// Button to continue a previous game
		Button continueButton = new Button("Continue");
		continueButton.setPrefWidth(200);
		continueButton.setOnAction(e -> continueGame(primaryStage));
		styleButton(continueButton);  // Apply the style to the button

		// Button for settings
		Button settingsButton = new Button("Settings");
		settingsButton.setPrefWidth(200);
		settingsButton.setOnAction(e -> openSettings(primaryStage));
		styleButton(settingsButton);  // Apply the style to the button

		// Button to exit the game
		Button exitButton = new Button("Exit Game");
		exitButton.setPrefWidth(200);
		styleButton(exitButton);  // Apply the style to the button
		exitButton.setOnAction(e -> exitGame());

		// "Add all buttons to the layout"
		menuLayout.getChildren().addAll(newGameButton, continueButton, settingsButton, exitButton);

		// "Creation of the main menu scene"
		Scene menuScene = new Scene(menuLayout);
		menuScene.getStylesheets().add(getClass().getResource("/styles/menu.css").toExternalForm()); // Link CSS file

		// "Set the scene on the stage"
		primaryStage.setScene(menuScene);
		primaryStage.setFullScreen(true); // Keep the game fullscreen
		primaryStage.setFullScreenExitHint(""); // Hide the "Press Esc to exit fullscreen" hint

		// Allow "Esc" key to exit fullscreen now
		menuScene.setOnKeyPressed(event -> {
			if (event.getCode() == KeyCode.ESCAPE) {
				primaryStage.setFullScreen(false); // Exit fullscreen

				// Adapt the window to the screen size
				primaryStage.setWidth(Screen.getPrimary().getBounds().getWidth() * 0.9); // Set width to 90% of screen
				primaryStage.setHeight(Screen.getPrimary().getBounds().getHeight() * 0.9); // Set height to 90% of screen
				primaryStage.centerOnScreen(); // Center the window on the screen

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
	
	// Apply consistent style to the buttons
    private void styleButton(Button button) {
        button.setStyle("-fx-font-size: 18px; -fx-background-color: #34495e; -fx-text-fill: white; -fx-pref-width: 200px; -fx-pref-height: 50px;");
        button.setOnMouseEntered(e -> button.setStyle("-fx-font-size: 18px; -fx-background-color: #1abc9c; -fx-text-fill: white; -fx-pref-width: 200px; -fx-pref-height: 50px;"));
        button.setOnMouseExited(e -> button.setStyle("-fx-font-size: 18px; -fx-background-color: #34495e; -fx-text-fill: white; -fx-pref-width: 200px; -fx-pref-height: 50px;"));
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
		Platform.exit(); // Closes the application
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

}
