package it.mbaziekone.footballsimulator.game;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MessagesView {
	
	public static VBox getMessagesView() {
		
		VBox layout = new VBox();
		
		Label message1 = new Label("Welcome to Football Simulator!");
		
		Label message2 = new Label("Your team has a new training session.");
		
		layout.getChildren().addAll(message1, message2);
		
		return layout;
	
	}

}
