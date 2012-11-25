package enumeration;

public enum LengthUnit {
    METER(100),
    CENTIMETER(1);
    public double TOCENTIMETERFACTOR;

    LengthUnit(int convertFactor) {
        this.TOCENTIMETERFACTOR = convertFactor;
    }

    public double getCentimeterFactor() {
        return TOCENTIMETERFACTOR;
    }
}
