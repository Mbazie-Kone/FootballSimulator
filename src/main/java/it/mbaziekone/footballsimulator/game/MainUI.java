package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class MainUI extends Application {
	
	private boolean isVideoPlaying = true; // flag to indicate if the videos is playing

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
		
		// Create a layout for the video
		StackPane videoLayout = new StackPane(mediaView);
		Scene videoScene = new Scene(videoLayout);
		
		// Set the scene and enable fullscreen mode
		primaryStage.setScene(videoScene);
		primaryStage.setTitle("Football Simulator");
		primaryStage.setFullScreen(true); // Enable fullscreen
		primaryStage.setFullScreenExitHint(""); // Hide the "Press Esc to exit fullscreen" hint
		
		// Start the video
		mediaPlayer.play();
		
		// Disable "Esc" key while video is playing
        videoScene.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ESCAPE && !isVideoPlaying) {
                // Allow "Esc" key to exit fullscreen only after the video ends
                primaryStage.setFullScreen(false);
            }
        });
		
		// When the video ends, show the main menu and enable "Esc" functionality
		mediaPlayer.setOnEndOfMedia(() -> {
			isVideoPlaying = false; // Video has finished playing	
			showMainMenu(primaryStage); // Switch to the main menu
		});
		
		// Handle errors during video playback
        mediaPlayer.setOnError(() -> {
            System.err.println("Error occurred while playing the video: " + mediaPlayer.getError().getMessage());
        });
        
    	// Show the stage
		primaryStage.show();
			
	}
	
	// Method to show the main menu after the video
	public void showMainMenu(Stage primaryStage) {
		// Transition to MainMenu after video ends
		MainMenu mainMenu = new MainMenu();
		mainMenu.start(primaryStage);
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
