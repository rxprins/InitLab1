package prins.riana.InitLab01;

/**
 * Created by rianaprins on 1/27/16.
 */
public class InitializationLab1 {

    public static void main (String[] args) {

        ColorfulThing color1 = new ColorfulThing(ColorfulThing.Color.BLACK);
        ColorfulThing color2 = new ColorfulThing(ColorfulThing.Color.WHITE);
        ColorfulThing color3 = new ColorfulThing(ColorfulThing.Color.SILVER);

        System.out.println(color1.getColor());
        System.out.println(color2.getColor());
        System.out.println(color3.getColor());



    }
}
