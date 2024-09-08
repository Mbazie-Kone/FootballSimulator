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
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		//
		String videoPath = getClass().getResource("/videos/DemoIntro.mp4").toExternalForm();
		
		// 
		Media media = new Media(videoPath);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		
		//
		MediaView mediaView = new MediaView(mediaPlayer);
		
		
			
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
