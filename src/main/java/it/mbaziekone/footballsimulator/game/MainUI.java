package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		// Path to the video file
		String videoPath = null;
		
		try {
		    videoPath = getClass().getResource("/videos/DemoIntro.mp4").toExternalForm();
		} catch (NullPointerException e) {
		    System.err.println("Video file not found! Check the path and ensure it's in the classpath.");
		    return; // Exit the application or handle the error appropriately
		}
		
		// Load the video
		Media media = new Media(videoPath);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		// Configure MediaView to display the video
		MediaView mediaView = new MediaView(mediaPlayer);
		
		// Set video resolution to fit the screen
		mediaView.setPreserveRatio(true);
		mediaView.setFitWidth(Screen.getPrimary().getBounds().getWidth());
		mediaView.setFitHeight(Screen.getPrimary().getBounds().getHeight());
		
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
		mediaPlayer.setOnEndOfMedia(() -> showMainMenu(primaryStage));
			
	}
	
	// Method to show the main menu after the video
	public void showMainMenu(Stage primaryStage) {
		MainMenu mainMenu = new MainMenu();
		primaryStage.setFullScreen(false); // Disable fullscreen if desired
		mainMenu.start(primaryStage); // Show the main menu
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
