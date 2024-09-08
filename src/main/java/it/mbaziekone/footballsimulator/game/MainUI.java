package it.mbaziekone.footballsimulator.game;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// Path to the video file
		String videoPath = getClass().getResource("/videos/DemoIntro.mp4").toExternalForm();
		
		// Load the video
		Media media = new Media(videoPath);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		// Configure MediaView to display the video
		MediaView mediaView = new MediaView(mediaPlayer);
		
		// Set video resolution to fit the screen
		mediaView.setPreserveRatio(true);
		mediaView.setFitWidth(Screen.getPrimary().getBounds().getWidth());
		mediaView.setFitHeight(Screen.getPrimary().getBounds().getWidth());
		
		// Add MediaView to the layout
		StackPane root = new StackPane(mediaView);
		
		// Create the scene
		Scene scene = new Scene(root);
		
		// Set the scene
		primaryStage.setScene(scene);
		primaryStage.setTitle("Football Simulator");
		
		// Enable fullscreen mode
		primaryStage.setFullScreen(true); // Enable fullscreen
		primaryStage.setFullScreenExitHint(null); // Hide the exit hint for fullscreen
		
		// Show the stage
		primaryStage.show();
		
		// Start the video
		mediaPlayer.play();
		
		// When the video ends, show the main menu
		mediaPlayer
			
	}
	
	// Metodo per visualizzare il menù principale
	public void showMainMenu(Stage primaryStage) {
		MainMenu mainMenu = new MainMenu();
		mainMenu.start(primaryStage); // Mostra il menù principale dopo l'animazione
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
