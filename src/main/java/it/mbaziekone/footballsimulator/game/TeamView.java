package it.mbaziekone.footballsimulator.game;

import it.mbaziekone.footballsimulator.model.Player;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

public class TeamView {
	
	public static VBox getTeamView() {
		
		// layout
		VBox layout = new VBox();
		
		// table for players
		TableView<Player> playerTable = new TableView<>();
		
		// table's column
		TableColumn<Player, String> firstNameCol = new TableColumn<>("First Name");
	}
}
