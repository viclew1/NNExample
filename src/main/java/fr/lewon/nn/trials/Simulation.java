package fr.lewon.nn.trials;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.lewon.Individual;
import fr.lewon.SelectionProcessor;
import fr.lewon.Trial;
import fr.lewon.exceptions.NNException;
import fr.lewon.selection.Selections;

public abstract class Simulation extends Trial {

	private static final Logger logger = LoggerFactory.getLogger(Simulation.class);
	
	public void start(int generationCount, int individualCount, int mutationChances, int crossoverChances, List<Integer> hiddenLayersSizes) {
		
		List<Individual> population = generatePopulation(hiddenLayersSizes, individualCount);
		
		SelectionProcessor selectionProcessor = new SelectionProcessor(this, Selections.STOCHASTIC_UNIVERSAL_SAMPLING, mutationChances, crossoverChances);
		try {
			selectionProcessor.start(population, generationCount, 1000000);
		} catch (NNException e) {
			logger.error("Error during selection", e);
		}
	}
	
	protected abstract List<Individual> generatePopulation(List<Integer> hiddenLayersSizes, int individualCount);

	public void reset() {
		//TODO implémenter la remise à 0
	}
}
