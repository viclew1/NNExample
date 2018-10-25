package fr.lewon.nn.ihm.panes;

import java.util.Random;

import fr.lewon.ihm.builder.GenericPane;
import javafx.scene.Node;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SimulationPane extends GenericPane {

	public SimulationPane() {
		super("Simulation");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		content.add(new Rectangle(400, 400, Color.BLACK), 0, 0);
		return content;
	}
	
	public void update() {
		for (Node n : getChildren()) {
			n.setOpacity(new Random().nextDouble());
		}
	}

}
