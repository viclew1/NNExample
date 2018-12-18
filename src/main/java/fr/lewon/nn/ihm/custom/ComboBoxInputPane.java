package fr.lewon.nn.ihm.custom;

import java.util.Arrays;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.scene.control.ComboBox;

public class ComboBoxInputPane<T> extends InputPane<ComboBox<T>, T> {

	public ComboBoxInputPane(String label, T[] elems) {
		this(label, Arrays.asList(elems));
	}
	
	public ComboBoxInputPane(String label, List<T> elems) {
		super(label, new ComboBox<>(FXCollections.observableList(elems)));
	}

	@Override
	public T getValue() {
		return getControl().getValue();
	}

	@Override
	public void setValue(T value) {
		getControl().getSelectionModel().select(value);
	}

}
