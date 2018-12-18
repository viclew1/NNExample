package fr.lewon.nn.ihm.groups;

import java.util.List;

import fr.lewon.ihm.builder.GenericGroup;
import fr.lewon.nn.ihm.panes.ParametersPane;
import fr.lewon.nn.ihm.panes.SimulationPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HomeGroup extends GenericGroup {

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
		defineStartButtonAction(parametersPane.getStartButton());
		
		content.add(parametersPane, 0, 0);
		content.add(simulationPane, 1, 0);
		
		return content;
	}
	
	private void defineStartButtonAction(Button button) {
		button.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				List<String> errors = parametersPane.checkErrors();
				if (errors == null || errors.isEmpty()) {
					int generationCount = parametersPane.getSelectionDetailsPane().getGenerationCount();
					int individualCount = parametersPane.getSelectionDetailsPane().getIndividualCount();
					int mutationChances = parametersPane.getSelectionDetailsPane().getMutationChances();
					int crossoverChances = parametersPane.getSelectionDetailsPane().getCrossoverChances();
					List<Integer> hiddenLayersSizes = parametersPane.getNeuralNetworkDetailsPane().getHiddenLayersSizes();

					simulationPane.startSimulation(parametersPane.generateSimulation(), generationCount, individualCount, 
							mutationChances, crossoverChances, hiddenLayersSizes);
				} else {
					Alert alert = new Alert(AlertType.WARNING);
					alert.initOwner(getStage());
					alert.setTitle("Error");
					String content = "";
					for (String error : errors) {
						content += error + "\n";
					}
					alert.setContentText(content);
					alert.showAndWait();
				}
			}
		
		});
	}

}
