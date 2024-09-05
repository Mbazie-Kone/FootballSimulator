package it.mbaziekone.footballsimulator.game;

import it.mbaziekone.footballsimulator.model.Player;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class TeamView {
	
	public static VBox getTeamView() {
		
		// layout
		VBox layout = new VBox();
		
		// table for players
		TableView<Player> playerTable = new TableView<>();
		
		
		TableColumn<Player, String> firstNameCol = new TableColumn<>("First Name");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		
		
		TableColumn<Player, String> lastNameCol = new TableColumn<>("Last Name");
		lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
				
		
		TableColumn<Player, String> roleCol = new TableColumn<>("Role");
		roleCol.setCellValueFactory(new PropertyValueFactory<>("role"));
		
		TableColumn<Player, String> teamCol = new TableColumn<>("Team");
		teamCol.setCellValueFactory(new PropertyValueFactory<>("teamName"));
		
		//
		playerTable.getColumns().addAll(firstNameCol, lastNameCol, roleCol, teamCol);
		
		ObservableList<Player> playerList = FXCollections.observableArrayList(
				// TO DO
		);
		
		playerTable.setItems(playerList);
		
		// add layout
		layout.getChildren().add(playerTable);
		
		return layout;
	}
}
