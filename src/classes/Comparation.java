package classes;

import enumeration.LengthUnit;

public class Comparation {
    public static void main(String[] args) {
        Length length1 = new Length(1, LengthUnit.METER);
        Length length2 = new Length(100, LengthUnit.CENTIMETER);

        Length length1InCentimeter = length1.convertToCentimeter();
        Length length2InCentimeter = length2.convertToCentimeter();

        System.out.println("length1 and length is the same : " + length1InCentimeter.equals(length2InCentimeter));
    }
}
