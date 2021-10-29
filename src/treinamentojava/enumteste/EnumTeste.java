package treinamentojava.enumteste;

public enum EnumTeste {

	SISGRADE("SISGRADE"), //
	SICREF("SICREF"), //
	SIGRES("SIGRES"), //
	RHOSEEE("RHOSE"); //

	private String label;

	private EnumTeste(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
