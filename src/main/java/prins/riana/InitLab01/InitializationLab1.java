package prins.riana.InitLab01;


public class InitializationLab1 {

    public static void main (String[] args) {
        BoringThing boring1 = new BoringThing();
        BoringThing boring2 = new BoringThing();
        BoringThing boring3 = new BoringThing();
        BoringThing boring4 = new BoringThing();
        BoringThing boring5 = new BoringThing();

        ColorfulThing color1 = new ColorfulThing("red");
        ColorfulThing color2 = new ColorfulThing("blue");
        ColorfulThing color3 = new ColorfulThing("green");
        ColorfulThing color4 = new ColorfulThing("pink");
        ColorfulThing color5 = new ColorfulThing("purple");
       // ColorfulThing color6 = new ColorfulThing();

        System.out.println(color1.getColor());
        System.out.println(color2.getColor());
        System.out.println(color3.getColor());
        System.out.println(color4.getColor());
        System.out.println(color5.getColor());


    }
}
