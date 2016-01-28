package prins.riana.InitLab01;


public class ColorfulThing {
    String color;

    public enum Color {
        WHITE, BLACK, SILVER
    }


    public ColorfulThing(Color ecolor)  {
       color = String.valueOf(ecolor);
    }


    public String getColor() {
        return color;

    }
}
