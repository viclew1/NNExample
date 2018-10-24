package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.InputPane;
import fr.lewon.nn.ihm.custom.IntegerInputPane;
import javafx.scene.layout.GridPane;

public class NeuralNetworkDetailsPane extends GenericPane {

	private InputPane inputCount;
	private InputPane hiddenCount;
	private InputPane outputCount;
	
	public NeuralNetworkDetailsPane() {
		super("Neural network details");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		inputCount = new IntegerInputPane("Input neurons count");
		hiddenCount = new IntegerInputPane("hidden layers count", 1, 10);
		outputCount = new IntegerInputPane("Output neurons count");
		
		content.add(inputCount, 0, 0);
		content.add(hiddenCount, 0, 1);
		content.add(outputCount, 0, 2);
		return content;
	}

}
