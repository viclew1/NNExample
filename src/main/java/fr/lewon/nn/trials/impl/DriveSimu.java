package fr.lewon.nn.trials.impl;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.Individual;
import fr.lewon.exceptions.NNException;
import fr.lewon.nn.trials.Simulation;
import fr.lewon.utils.PopulationInfos;

public class DriveSimu extends Simulation {

	@Override
	public double testIndividual(Individual individual) throws NNException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected List<Individual> generatePopulation(List<Integer> hiddenLayersSizes, int individualCount) {
		return new ArrayList<>();
	}

	@Override
	public void processBetweenGenerationsActions(PopulationInfos infos) {
		// TODO Auto-generated method stub
		
	}

}
