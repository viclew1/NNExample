package fr.lewon.nn.ihm.panes;

import java.util.ArrayList;
import java.util.List;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.trials.Simulation;
import fr.lewon.selection.Selection;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SimulationPane extends GenericPane {

	private Simulation simulation;
	private Button pauseButton;
	private Button stopButton;

	public SimulationPane(Stage stage) {
		super(stage, "Simulation");
	}

	@Override
	protected Pane generateContent() {
		GridPane content = new GridPane();

		Pane simPane = new Pane();
		simPane.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
		simPane.setMinSize(400, 400);

		content.add(simPane, 0, 0);

		VBox buttons = new VBox();

		pauseButton = new Button("Pause");
		stopButton = new Button("Stop");
		buttons.getChildren().addAll(pauseButton, stopButton);

		content.add(buttons, 0, 1);
		GridPane.setConstraints(buttons, 0, 1, 2, 1, HPos.CENTER, VPos.CENTER);
		return content;
	}

	public void startSimulation(Simulation simulation, int generationCount, int individualCount, int mutationChances,
			int crossoverChances, List<Integer> hiddenLayersSizes, Selection selection) {

		if (this.simulation != null) {
			this.simulation.reset();
		}

		this.simulation = simulation;
		new Thread(new Runnable() {

			@Override
			public void run() {
				SimulationPane.this.simulation.start(generationCount, individualCount, mutationChances, crossoverChances, hiddenLayersSizes, selection);
			}

		}).start();
	}

	@Override
	public List<String> checkErrors() {
		return new ArrayList<>();
	}

}
