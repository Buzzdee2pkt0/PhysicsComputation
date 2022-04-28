import java.math.BigDecimal;
import java.math.RoundingMode;

public class VelocityCalculator {

    //Speed of light in meter per second
    private static final BigDecimal C = new BigDecimal(299792458);
    //Speed of the Sensor in meter per second
    private static final BigDecimal V = new BigDecimal(35);

    public BigDecimal calculate(BigDecimal firstfrequency , BigDecimal secondfrequency){
        BigDecimal scattererVelocity;

        BigDecimal frequencyCoefficient = secondfrequency.divide(firstfrequency,10, RoundingMode.CEILING);
        scattererVelocity = ((C.subtract(V)).multiply(frequencyCoefficient)).subtract(C);
        return scattererVelocity;
    }
}
