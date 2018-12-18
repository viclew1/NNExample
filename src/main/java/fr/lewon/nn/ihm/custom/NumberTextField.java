package fr.lewon.nn.ihm.custom;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class NumberTextField extends TextField {

	public NumberTextField(Integer minValue, Integer maxValue) {
		lengthProperty().addListener(new ChangeListener<Number>(){
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (newValue.intValue() > oldValue.intValue()) {
					char ch = getText().charAt(oldValue.intValue());
					// Check if the new character is the number or other's
					if (!(ch >= '0' && ch <= '9' )) {
						// if it's not number then just setText to previous one
						setText(getText().substring(0, getText().length()-1)); 
					}
				}
				
				Integer val = "".equals(getText()) ? null : Integer.parseInt(getText());
				if (val != null && maxValue != null && val > maxValue) {
					setText(String.valueOf(maxValue));
				} else if (val != null && minValue != null && val < minValue) {
					setText(String.valueOf(minValue));
				}
			}

		});
	}
	
	public Integer getValue() {
		if (getText() == null || "".equals(getText())) {
			return null;
		}
		return Integer.parseInt(getText());
	}

}