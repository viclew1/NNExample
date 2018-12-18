package fr.lewon.nn.ihm.util;

public enum AlertTitles {

	FIELDS_IN_ERROR("Fields in error");
	
	private final String title;
	
	private AlertTitles(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
}
