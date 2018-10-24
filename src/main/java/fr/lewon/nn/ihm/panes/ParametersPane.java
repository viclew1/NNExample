package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class ParametersPane extends GenericPane {

	private SelectionDetailsPane selectionDetailsPane;
	private NeuralNetworkDetailsPane neuralNetworkDetailsPane;
	private Button start;
	
	public ParametersPane() {
		super("Parameters");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		selectionDetailsPane = new SelectionDetailsPane();
		neuralNetworkDetailsPane = new NeuralNetworkDetailsPane();
		start = new Button("Start");
		setHalignment(start, HPos.RIGHT);
		
		content.add(selectionDetailsPane, 0, 0);
		content.add(neuralNetworkDetailsPane, 0, 1);
		content.add(start, 0, 2);
		return content;
	}
	
}
