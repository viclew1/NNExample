package fr.lewon.nn.ihm.panes;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.IntegerInputPane;
import fr.lewon.nn.ihm.util.ErrorMessageGenerator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class SelectionDetailsPane extends GenericPane {

	private IntegerInputPane generationCount;
	private IntegerInputPane individualCount;
	private IntegerInputPane mutationChances;
	private IntegerInputPane crossoverChances;
	
	
	public SelectionDetailsPane() {
		super("Selection details");
	}

	@Override
	protected Pane generateContent() {
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
	
	public Integer getGenerationCount() {
		return generationCount.getValue();
	}
	
	public Integer getIndividualCount() {
		return individualCount.getValue();
	}
	
	public Integer getMutationChances() {
		return mutationChances.getValue();
	}
	
	public Integer getCrossoverChances() {
		return crossoverChances.getValue();
	}

	@Override
	public List<String> checkErrors() {
		List<String> errors = new ArrayList<>();
		
		if (getGenerationCount() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(generationCount.getLabel()));
		}
		if (getIndividualCount() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(individualCount.getLabel()));
		}
		if (getMutationChances() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(mutationChances.getLabel()));
		}
		if (getCrossoverChances() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(crossoverChances.getLabel()));
		}
		
		return errors;
	}

}
