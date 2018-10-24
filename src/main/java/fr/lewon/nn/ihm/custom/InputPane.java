package fr.lewon.nn.ihm.custom;

import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;

public abstract class InputPane extends GridPane  {

	private Text textLabel;
	private TextField input;
	
	public InputPane(String label, TextField input) {
		this.textLabel = new Text(label);
		this.input = input;
		Pane spacer = new Pane();
		
		spacer.setPadding(new Insets(5));
		GridPane.setHgrow(spacer, Priority.ALWAYS);
	    
		add(this.textLabel, 0, 0);
		add(spacer, 1, 0);
		add(this.input, 2, 0);
	}
	
	public String getValue() {
		return input.getText();
	}
}
