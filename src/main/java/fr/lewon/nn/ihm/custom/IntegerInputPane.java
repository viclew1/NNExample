package fr.lewon.nn.ihm.custom;

public class IntegerInputPane extends InputPane<NumberTextField, Integer> {

	public IntegerInputPane(String label) {
		this(label, null, null);
	}
	
	public IntegerInputPane(String label, Integer minValue, Integer maxValue) {
		super(generateLabel(label, minValue, maxValue), new NumberTextField(minValue, maxValue));
	}
	
	private static String generateLabel(String label, Integer minValue, Integer maxValue) {
		if (minValue == null && maxValue == null) {
			return label;
		}
		label += " (" + minValue + " - " + maxValue + ")";
		return label;
	}

	@Override
	public Integer getValue() {
		return getControl().getValue();
	}

	@Override
	public void setValue(Integer value) {
		getControl().setText(String.valueOf(value));
	}

}
