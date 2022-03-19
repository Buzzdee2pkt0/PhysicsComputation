
public class VelocityCalculator {

    //Speed of light in meter per second
    private static final double C = 299792458;

    public double calculate(double frequencyA ,double frequencyB){
        double scattererVelocity;

        double frequencyCoefficient = frequencyB / frequencyA;
        scattererVelocity = frequencyCoefficient * C - C;
        return scattererVelocity;
    }
}
