package prins.riana.Initlab01;
import org.junit.Test;
import prins.riana.InitLab01.ColorfulThing;

import static org.junit.Assert.*;

/**
 * Created by rianaprins on 1/27/16.
 */
public class ColorfulThingSpec {

    @Test
    public void getColorTest() {
        ColorfulThing color = new ColorfulThing("blue");
        assertEquals("test color ","blue",color.getColor());


    }
}
