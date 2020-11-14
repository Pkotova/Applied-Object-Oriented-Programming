package code;

public class MonetaryCoin extends Coin {
    private int value;

    MonetaryCoin(Face newFace, int newValue) {
        super(newFace);
        setValue(newValue);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int newValue) {
        if (newValue == 1 || newValue == 2 ||
                newValue == 5 || newValue == 10 ||  newValue == 20 ||
                newValue == 50 || newValue == 100 ||
                newValue == 200) {
            this.value = newValue;
        } else{
            this.value = 100;
        }
    }

    @Override
    public String toString() {
        return String.format("%s value: %d",super.toString(),value);

    }
}

