package fr.lewon.nn.ihm.panes;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.trials.Simulation;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ParametersPane extends GenericPane {

	private SelectionDetailsPane selectionDetailsPane;
	private NeuralNetworkDetailsPane neuralNetworkDetailsPane;
	private TrialDetailsPane trialDetailsPane;
	private Button start;

	public ParametersPane(Stage stage) {
		super(stage, "Parameters");
	}

	@Override
	protected Pane generateContent() {
		GridPane content = new GridPane();
		trialDetailsPane = new TrialDetailsPane(getStage());
		selectionDetailsPane = new SelectionDetailsPane(getStage());
		neuralNetworkDetailsPane = new NeuralNetworkDetailsPane(getStage());
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

	public Simulation generateSimulation() {
		return trialDetailsPane.getSelectedTrial();
	}

	@Override
	public List<String> checkErrors() {
		List<String> errors = new ArrayList<>();
		errors.addAll(selectionDetailsPane.checkErrors());
		errors.addAll(neuralNetworkDetailsPane.checkErrors());
		errors.addAll(trialDetailsPane.checkErrors());
		return errors;
	}

}
