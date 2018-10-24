package fr.lewon.nn.ihm.panes;

import fr.lewon.ihm.builder.GenericPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class GamePane extends GenericPane {

	public GamePane() {
		super("Game");
	}

	@Override
	protected GridPane generateContent() {
		GridPane content = new GridPane();
		content.add(new Rectangle(50, 50, Color.RED), 0, 0);
		content.add(new Rectangle(50, 50, Color.BLUE), 1, 0);
		content.add(new Rectangle(50, 50, Color.GREEN), 0, 1);
		content.add(new Rectangle(50, 50, Color.YELLOW), 1, 1);
		return content;
	}

}
