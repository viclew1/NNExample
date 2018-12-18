package fr.lewon.nn.ihm.panes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fr.lewon.ihm.builder.GenericPane;
import fr.lewon.nn.ihm.custom.IntegerInputPane;
import fr.lewon.nn.ihm.custom.NumberTextField;
import fr.lewon.nn.ihm.util.ErrorMessageGenerator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class NeuralNetworkDetailsPane extends GenericPane {

	private static final int MAX_LAYERS = 10;
	
	private IntegerInputPane hiddenCount;
	private Button validButton;
	private VBox layersSizesPane;
	private List<Integer> sizesAvailable;
	
	public NeuralNetworkDetailsPane() {
		super("Neural network details");
	}

	@Override
	protected Pane generateContent() {
		GridPane content = new GridPane();

		layersSizesPane = new VBox();
		sizesAvailable = new ArrayList<>();
		for (int i = 0 ; i < MAX_LAYERS ; i++) {
			sizesAvailable.add(i);
			Node ntf = new NumberTextField(1, 20);
			ntf.setVisible(false);
			layersSizesPane.getChildren().add(ntf);
		}
		
		hiddenCount = new IntegerInputPane("hidden layers count", 0, 10);
		hiddenCount.setValue(0);
		
		validButton = new Button("Define size");
		defineValidButtonAction();
		
		content.add(hiddenCount, 0, 0);
		content.add(validButton, 1, 0);
		content.add(layersSizesPane, 0, 1);
		
		return content;
	}
	
	public void defineValidButtonAction() {
		validButton.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				Integer hiddenCountValue = hiddenCount.getValue();
				int val = hiddenCountValue == null ? 0 : hiddenCountValue;
				
				for (int i = 0 ; i < MAX_LAYERS ; i++) {
					layersSizesPane.getChildren().get(i).setVisible(i < val);
				}
			}
		});
	}

	public Integer getHiddenLayersCount() {
		return hiddenCount.getValue();
	}

	public List<Integer> getHiddenLayersSizes() {
		return layersSizesPane.getChildren().stream()
				.map(n -> (NumberTextField) n)
				.map(NumberTextField::getValue)
				.filter(v -> v != null)
				.collect(Collectors.toList());
	}

	@Override
	public List<String> checkErrors() {
		List<String> errors = new ArrayList<>();
		
		if (getHiddenLayersCount() == null) {
			errors.add(ErrorMessageGenerator.INSTANCE.generateNeededFieldMessage(hiddenCount.getLabel()));
		}
		for (Node n : layersSizesPane.getChildren()) {
			NumberTextField ntf = (NumberTextField) n;
			if (ntf.isVisible() && ntf.getValue() == null) {
				errors.add("All layers sizes must be specified.");
				break;
			}
		}

		return errors;
	}

}
