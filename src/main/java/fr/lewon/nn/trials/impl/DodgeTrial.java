package fr.lewon.nn.trials.impl;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.Individual;
import fr.lewon.exceptions.NNException;
import fr.lewon.nn.ActivationFunctions;
import fr.lewon.nn.impl.NeuralNetworkClassic;
import fr.lewon.nn.trials.Simulation;

public class DodgeTrial extends Simulation {

	@Override
	public double getFitness(Individual individual) throws NNException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected List<Individual> generatePopulation(List<Integer> hiddenLayersSizes, int individualCount) {
		List<Individual> indivs = new ArrayList<>();
		for (int i = 0 ; i < individualCount ; i++) {
			indivs.add(new NeuralNetworkClassic(ActivationFunctions.SIGMOID, 1, 1, hiddenLayersSizes));
		}
		return indivs;
	}

}
