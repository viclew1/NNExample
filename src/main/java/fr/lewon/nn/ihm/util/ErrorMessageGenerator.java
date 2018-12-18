package fr.lewon.nn.ihm.util;

public enum ErrorMessageGenerator {

	INSTANCE;
	
	private ErrorMessageGenerator() {
	}

	public String generateNeededFieldMessage(String fieldName) {
		return "Field needed : " + fieldName + ".";
	}
	
}
