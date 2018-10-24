package fr.lewon.nn.ihm;

import fr.lewon.ihm.builder.GenericApplication;
import fr.lewon.ihm.builder.GenericGroup;
import fr.lewon.nn.ihm.groups.HomeGroup;
import javafx.stage.Stage;

public class MainFrame extends GenericApplication {

	public MainFrame() {
		super("Neural network example project");
	}

	@Override
	protected GenericGroup getBaseGroup(Stage stage) {
		return new HomeGroup(stage);
	}

}
