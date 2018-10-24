package fr.lewon.nn.ihm.groups;

import fr.lewon.ihm.builder.GenericGroup;
import fr.lewon.nn.ihm.panes.SimulationPane;
import fr.lewon.nn.ihm.panes.ParametersPane;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeGroup extends GenericGroup {

	public HomeGroup(Stage stage) {
		super(stage);
	}

	@Override
	protected Node generateChildren() {
		GridPane content = new GridPane();
		content.add(new ParametersPane(), 0, 0);
		content.add(new SimulationPane(), 1, 0);
		return content;
	}

}
