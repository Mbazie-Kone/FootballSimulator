package it.mbaziekone.footballsimulator.game;

import javax.swing.plaf.basic.BasicTabbedPaneUI.TabbedPaneLayout;

import javafx.application.Application;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainUI extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Football Simulator");
		
		BorderPane mainLayout = new BorderPane();
		
		TabPane tabPane = new TabPane();
	}

}
