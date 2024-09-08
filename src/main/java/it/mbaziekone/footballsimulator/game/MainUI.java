package it.mbaziekone.footballsimulator.game;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		String videoPath = "file:/videos/DemoIntro.mp4";
		
		// game logo
		Image logo = new Image("file:logo.png"); // "Insert the path to the logo"
		ImageView logoView = new ImageView(logo);
		logoView.setFitWidth(300);
		logoView.setFitHeight(300);
		
		// game name
		Label gameTitle = new Label("Football Simulator");
		gameTitle.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: white;");
		
		// Added logo and title to the StackPane
		splashLayout.getChildren().addAll(logoView, gameTitle);
		
		// Creation of the scene
		Scene splashScene = new Scene(splashLayout, 800, 600);
		
		// Setting the background color (black in this case)
		splashLayout.setStyle("-fx-background-color: black;");
		
		// Fade-in/fade-out animation
		FadeTransition fadeIn = new FadeTransition(Duration.seconds(20), splashLayout);
		fadeIn.setFromValue(0.0);
		fadeIn.setToValue(1.0);
		fadeIn.setOnFinished(e -> {
			// After the fade-in animation, load the main menu
			showMainMenu(primaryStage);
		});
		
		// Display the startup scene
		primaryStage.setScene(splashScene);
		primaryStage.show();
		
		// Start the animation
		fadeIn.play();
			
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
