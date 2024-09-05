package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		StackPane splashLayout = new StackPane();
		
		Image logo = new Image("file:logo.png");
		ImageView logoView = new ImageView(logo);
		logoView.setFitWidth(300);
		logoView.setFitHeight(300);
		
		Label gameTitle = new Label("Football Simulator");
		gameTitle.setStyle("-fx-font-size: 36px; -fx-font-weight: bold; -fx-text-fill: white;");
		
		// main layout
		BorderPane mainLayout = new BorderPane();
		
		// create tabs (sheets)
		TabPane tabPane = new TabPane();
		
		// team and player tab
		Tab teamTab = new Tab("Team");
		teamTab.setContent(TeamView.getTeamView());
		
		// tab for messages
		Tab messagesTab = new Tab("Messages");
		messagesTab.setContent(MessagesView.getMessagesView());
		
		// tab for player profile
		Tab playerProfileTab = new Tab("Player Profile");
		playerProfileTab.setContent(PlayerProfileView.getPlayerProfileView());
		
		// add sheets
		tabPane.getTabs().addAll(messagesTab, teamTab, playerProfileTab);
		
		mainLayout.setCenter(tabPane);
		
		// main scene
		Scene scene = new Scene(mainLayout, 800, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
