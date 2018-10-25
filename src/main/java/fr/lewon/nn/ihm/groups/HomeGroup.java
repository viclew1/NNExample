package fr.lewon.nn.ihm.groups;

import fr.lewon.ihm.builder.GenericGroup;
import fr.lewon.nn.ihm.listeners.HomeListener;
import fr.lewon.nn.ihm.panes.ParametersPane;
import fr.lewon.nn.ihm.panes.SimulationPane;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeGroup extends GenericGroup implements HomeListener {

	private ParametersPane parametersPane;
	private SimulationPane simulationPane;
	
	public HomeGroup(Stage stage) {
		super(stage);
	}

	@Override
	protected Node generateChildren() {
		GridPane content = new GridPane();
		
		parametersPane = new ParametersPane();
		simulationPane = new SimulationPane();
		
		content.add(parametersPane, 0, 0);
		content.add(simulationPane, 1, 0);
		
		parametersPane.getStartButton().setOnAction(e -> new Thread(() -> startSimulation()).start());
		return content;
	}

	@Override
	public void startSimulation() {
		//TODO startSimulation
	}
	
}
