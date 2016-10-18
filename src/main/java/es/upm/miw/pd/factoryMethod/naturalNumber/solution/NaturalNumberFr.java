package es.upm.miw.pd.factoryMethod.naturalNumber.solution;


public class NaturalNumberFr extends NaturalNumber{
	

    private static final String[] textValueFr = {"zero", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        this.setValue(value);
    }

    @Override
    public String getTextValue() {
        if (this.getValue() < textValueFr.length) {
            return NaturalNumberFr.textValueFr[this.getValue()];
        } else {
            return "???";
        }
    }

}
