package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.ComboBoxInputPane;
import fr.lewon.nn.trials.Trials;
import javafx.scene.layout.GridPane;

public class TrialDetailsPane extends GenericPane {

	private ComboBoxInputPane<Trials> trialsInput;
	
	public TrialDetailsPane() {
		super("Trial");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		trialsInput = new ComboBoxInputPane<>("Chosen trial", Trials.values());
		trialsInput.getControl().setValue(Trials.values()[0]);
		content.add(trialsInput, 0, 0);
		return content;
	}

}
