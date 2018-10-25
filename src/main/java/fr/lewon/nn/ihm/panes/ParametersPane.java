package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ParametersPane extends GenericPane {

	private SelectionDetailsPane selectionDetailsPane;
	private NeuralNetworkDetailsPane neuralNetworkDetailsPane;
	private TrialDetailsPane trialDetailsPane;
	private Button start;
	
	public ParametersPane() {
		super("Parameters");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		trialDetailsPane = new TrialDetailsPane();
		selectionDetailsPane = new SelectionDetailsPane();
		neuralNetworkDetailsPane = new NeuralNetworkDetailsPane();
		start = new Button("Start");
		
		setHalignment(start, HPos.RIGHT);
		
		content.add(trialDetailsPane, 0, 0);
		content.add(selectionDetailsPane, 0, 1);
		content.add(neuralNetworkDetailsPane, 0, 2);
		content.add(start, 0, 3);
		return content;
	}
	
	public SelectionDetailsPane getSelectionDetailsPane() {
		return selectionDetailsPane;
	}
	
	public NeuralNetworkDetailsPane getNeuralNetworkDetailsPane() {
		return neuralNetworkDetailsPane;
	}
	
	public Button getStartButton() {
		return start;
	}
	
}
