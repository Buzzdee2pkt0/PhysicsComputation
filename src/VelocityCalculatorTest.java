import org.junit.Test;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
        BigDecimal divisionOfFrequencyValues = calculator.calculate(new BigDecimal(40.000003950),new BigDecimal(40.000004000));
        BigDecimal roundedResult = divisionOfFrequencyValues.setScale(10, RoundingMode.DOWN);
        assertEquals(new BigDecimal(0.3897301954),roundedResult);
    }


    @Test
    public void frequencyMapCreation(){
        //
        System.out.println(main.createFrequencyMap(500));
    }
}
