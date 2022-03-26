import java.math.BigDecimal;
import java.math.RoundingMode;

public class VelocityCalculator {

    //Speed of light in meter per second
    private static final BigDecimal C = new BigDecimal(299792458);

    public BigDecimal calculate(BigDecimal frequencyA , BigDecimal frequencyB){
        BigDecimal scattererVelocity;

        BigDecimal frequencyCoefficient = frequencyB.divide(frequencyA,10, RoundingMode.CEILING);
        scattererVelocity = frequencyCoefficient.multiply(C).subtract(C);
        return scattererVelocity;
    }
}
