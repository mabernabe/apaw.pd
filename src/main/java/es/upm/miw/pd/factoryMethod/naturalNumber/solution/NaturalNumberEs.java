package es.upm.miw.pd.factoryMethod.naturalNumber.solution;


public class NaturalNumberEs extends NaturalNumber{

    private static final String[] textValueEs = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        this.setValue(value);
    }

    @Override
    public String getTextValue() {
        if (this.getValue() < textValueEs.length) {
            return NaturalNumberEs.textValueEs[this.getValue()];
        } else {
            return "???";
        }
    }

}
