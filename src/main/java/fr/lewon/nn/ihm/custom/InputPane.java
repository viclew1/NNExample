package fr.lewon.nn.ihm.custom;

import javafx.geometry.Insets;
import javafx.scene.control.Control;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

public abstract class InputPane<I extends Control, T> extends GridPane  {

	private Text textLabel;
	private I input;
	
	public InputPane(String label, I input) {
		this.textLabel = new Text(label);
		this.input = input;
		Pane spacer = new Pane();
		
		spacer.setPadding(new Insets(5));
		GridPane.setHgrow(spacer, Priority.ALWAYS);
	    
		add(this.textLabel, 0, 0);
		add(spacer, 1, 0);
		add(this.input, 2, 0);
	}
	
	public I getControl() {
		return input;
	}
	
	public String getLabel() {
		return textLabel.getText();
	}
	
	public abstract T getValue();
	
	public abstract void setValue(T value);
}
