package fr.lewon.nn.trials;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.Individual;
import fr.lewon.SelectionProcessor;
import fr.lewon.Trial;
import fr.lewon.exceptions.NNException;
import fr.lewon.nn.collisions.HitboxUtil;
import fr.lewon.nn.collisions.Intersection;
import fr.lewon.nn.trials.elements.SimuElement;
import fr.lewon.selection.Selection;

public abstract class Simulation extends Trial {

	private List<SimuElement> simuElements = new ArrayList<>();

	public Individual start(int generationCount, int individualCount, int mutationChances, int crossoverChances, List<Integer> hiddenLayersSizes, Selection selection) throws NNException {

		List<Individual> population = generatePopulation(hiddenLayersSizes, individualCount);

		SelectionProcessor selectionProcessor = new SelectionProcessor(this, selection, mutationChances, crossoverChances);
		return selectionProcessor.start(population, generationCount, 1000000);
	}

	protected abstract List<Individual> generatePopulation(List<Integer> hiddenLayersSizes, int individualCount);

	public void reset() {
		//TODO implémenter la remise à 0
	}

	private void sleepAndRefresh() {
		List<Intersection> intersections = computeIntersections();
		applyCollisions(intersections);
		updateAll();
	}


	/**
	 * Returns a list of all the intersections between different SimuElements in the simulation
	 * @return
	 */
	private List<Intersection> computeIntersections() {
		List<Intersection> intersections = new ArrayList<>();
		for (int i = 0 ; i < simuElements.size() - 1 ; i++) {
			for (int j = i + 1 ; j < simuElements.size() ; j++) {
				SimuElement se1 = simuElements.get(i);
				SimuElement se2 = simuElements.get(j);
				intersections.addAll(HitboxUtil.INSTANCE.getIntersections(se1, se2));
			}
		}
		return intersections;
	}

	/**
	 * Applies the effect of the list of intersections between SimuElements
	 * @param intersections
	 */
	private void applyCollisions(List<Intersection> intersections) {
		for (Intersection i : intersections) {
			i.getLeft().processIntersection(i.getRight());
			i.getRight().processIntersection(i.getLeft());
		}
	}

	/**
	 * Updates the position and situation of all SimuElements in the simulation
	 */
	private void updateAll() {

	}
}
