package it.mbaziekone.footballsimulator.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Football Simulator");
		
		// main layout
		BorderPane mainLayout = new BorderPane();
		
		// create tabs (sheets)
		TabPane tabPane = new TabPane();
		
		// team and player tab
		Tab teamTab = new Tab("Team");
		teamTab.setContent(TeamView.getTeamView());
		
		// tab for messages
		Tab messagesTab = new Tab("Messages");
		
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
