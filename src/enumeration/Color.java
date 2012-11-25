package enumeration;

public enum Color {
    Red("this is red color"),
    Blue("this is blue color"),
    Green("this is green color"),
    White("this is white color");
    private final String color;

    Color(String str) {
        this.color = str;
    }

    public String getColor() {
        return color;
    }

    public boolean isRed() {
        return this.equals(Red);
    }
}
