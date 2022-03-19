import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;

import static org.junit.Assert.*;

public class VelocityCalculatorTest {

    @Test
    public  void imageRead() throws IOException {
        ImageReader reader = new ImageReader();
        BufferedImage image = reader.readImage(null);
        assertEquals(343, image.getHeight());
    }
    @Test
    public  void frequenciesCalculator(){
        //Calculate frequencies to each pixel line
    }
    @Test
    public  void velocityCalculator(){
        //Calculate the velocity
        VelocityCalculator calculator = new VelocityCalculator();
        double divisionOfFrequencyValues = calculator.calculate(80,80.1);
        assertEquals(374740.57249999046,divisionOfFrequencyValues,0);
    }

}
