package fr.lewon.nn.ihm.custom;

import javafx.scene.control.TextField;

public class StringInputPane extends InputPane<TextField, String> {

	public StringInputPane(String label) {
		super(label, new TextField());
	}
	
	@Override
	public String getValue() {
		return getControl().getText();
	}
	
}
