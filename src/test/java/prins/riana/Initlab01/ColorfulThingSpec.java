package prins.riana.Initlab01;
import org.junit.Test;
import prins.riana.InitLab01.ColorfulThing;
import static org.junit.Assert.*;

public class ColorfulThingSpec {

    @Test
    public void getColorTest() {
        ColorfulThing color = new ColorfulThing(ColorfulThing.Color.WHITE);
        assertEquals("test color ","WHITE",color.getColor());
    }
}