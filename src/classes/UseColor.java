package classes;

import enumeration.Color;

public class UseColor {
    public static void main(String[] args) {
        for(Color color : Color.values()) {
            System.out.println(color.getColor());
            System.out.println(color);

            if(color.isRed()) {
                System.out.println("I found the red color!");
            }
        }

        Color green = Color.Green;
        System.out.println(green.isRed());
    }
}
