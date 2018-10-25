package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.IntegerInputPane;
import javafx.scene.layout.GridPane;

public class SelectionDetailsPane extends GenericPane {

	private IntegerInputPane generationCount;
	private IntegerInputPane individualCount;
	private IntegerInputPane mutationChances;
	private IntegerInputPane crossoverChances;
	
	
	public SelectionDetailsPane() {
		super("Selection details");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		
		generationCount = new IntegerInputPane("Generation count");
		individualCount = new IntegerInputPane("Individual count");
		mutationChances = new IntegerInputPane("Mutation chances", 0, 100);
		crossoverChances = new IntegerInputPane("Crossover chances", 0, 100);
		
		content.add(generationCount, 0, 0);
		content.add(individualCount, 0, 1);
		content.add(mutationChances, 0, 2);
		content.add(crossoverChances, 0, 3);
		return content;
	}

}
