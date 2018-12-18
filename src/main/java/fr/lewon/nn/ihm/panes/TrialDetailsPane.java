package fr.lewon.nn.ihm.panes;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.ComboBoxInputPane;
import fr.lewon.nn.ihm.util.ErrorMessageGenerator;
import fr.lewon.nn.trials.Simulation;
import fr.lewon.nn.trials.Simulations;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TrialDetailsPane extends GenericPane {

	private ComboBoxInputPane<Simulations> trialsInput;
	
	public TrialDetailsPane() {
		super("Trial");
	}

	@Override
	protected Pane generateContent() {
		GridPane content = new GridPane();
		trialsInput = new ComboBoxInputPane<>("Chosen trial", Simulations.values());
		trialsInput.getControl().setValue(Simulations.values()[0]);
		content.add(trialsInput, 0, 0);
		return content;
	}

	public Simulation getSelectedTrial() {
		if (trialsInput.getValue() == null) {
			return null;
		}
		return trialsInput.getValue().getSimulation();
	}

	@Override
	public List<String> checkErrors() {
		List<String> errors = new ArrayList<>();
		
		if (getSelectedTrial() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(trialsInput.getLabel()));
		}
		
		return errors;
	}

}
