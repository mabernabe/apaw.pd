package es.upm.miw.pd.factoryMethod.naturalNumber.solution;

public class NaturalNumberEn extends NaturalNumber {

    private static final String[] textValueEn = {"zero", "one", "two", "three", "four", "five"};

    public NaturalNumberEn(int value) {
        this.setValue(value);
    }

    @Override
    public String getTextValue() {
        if (this.getValue()< textValueEn.length) {
            return NaturalNumberEn.textValueEn[this.getValue()];
        } else {
            return "???";
        }
    }

}
