package classes;

import enumeration.LengthUnit;

public class Length {
    private double value;
    private LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public LengthUnit getLengthUnit() {
        return unit;
    }

    @Override
    public boolean equals(Object obj) {
        Length lengthObj = (Length) obj;
        return (this.getValue() == lengthObj.getValue() && this.getLengthUnit().equals(lengthObj.getLengthUnit()));
    }

    public Length convertToCentimeter() {
        this.value *= unit.getCentimeterFactor();
        this.unit = LengthUnit.CENTIMETER;
        return new Length(value, unit);
    }
}
