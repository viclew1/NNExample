package fr.lewon.nn.ihm.objects;

public class ParametersInfos {

	private Integer generationCount;
	private Integer individualCount;
	private Integer mutationChances;
	private Integer crossoverChances;
	private Integer inputNeuronsCount;
	private Integer hiddenLayersCount;
	private Integer outputNeuronsCount;
	
	
	public Integer getGenerationCount() {
		return generationCount;
	}
	public void setGenerationCount(Integer generationCount) {
		this.generationCount = generationCount;
	}
	public Integer getIndividualCount() {
		return individualCount;
	}
	public void setIndividualCount(Integer individualCount) {
		this.individualCount = individualCount;
	}
	public Integer getMutationChances() {
		return mutationChances;
	}
	public void setMutationChances(Integer mutationChances) {
		this.mutationChances = mutationChances;
	}
	public Integer getCrossoverChances() {
		return crossoverChances;
	}
	public void setCrossoverChances(Integer crossoverChances) {
		this.crossoverChances = crossoverChances;
	}
	public Integer getInputNeuronsCount() {
		return inputNeuronsCount;
	}
	public void setInputNeuronsCount(Integer inputNeuronsCount) {
		this.inputNeuronsCount = inputNeuronsCount;
	}
	public Integer getHiddenLayersCount() {
		return hiddenLayersCount;
	}
	public void setHiddenLayersCount(Integer hiddenLayersCount) {
		this.hiddenLayersCount = hiddenLayersCount;
	}
	public Integer getOutputNeuronsCount() {
		return outputNeuronsCount;
	}
	public void setOutputNeuronsCount(Integer outputNeuronsCount) {
		this.outputNeuronsCount = outputNeuronsCount;
	}
}
