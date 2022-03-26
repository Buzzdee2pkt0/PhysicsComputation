import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static javax.imageio.ImageIO.read;


//Business Scenario:
// GIVEN: A SAR Image
// WHEN:  I read the Image
// THEN:  I can calculate real distance between pixels


public class main {
    public static final double FREQUENCY_GROWTH_VALUE = 0.00000005;
    private static final String DUMMY_PATH = "C:\\Users\\klang\\IdeaProjects\\PhyCom\\files\\Testship.png";


    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File(DUMMY_PATH));
        double imageHeight = image.getHeight();

        // First is y-pixel position, second value is frequency
        Map<Integer, BigDecimal> frequencyMap = createFrequencyMap(imageHeight);
        System.out.println("Your Pixel/Frequency Map:");
        for (int i = 1; i <= imageHeight; i++) {
            System.out.println(i + " " +frequencyMap.get(i));
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Please give first y pixel:");
        String firstYpixel = reader.readLine();
        System.out.println("Your types value:" + firstYpixel);

        System.out.println("Please give second y pixel:");
        String secondYpixel = reader.readLine();


        BigDecimal firstfrequency = frequencyMap.get(Integer.valueOf(firstYpixel));
        System.out.println("Frequeny of your first pixel:" + firstfrequency);
        BigDecimal secondfrequency = frequencyMap.get(Integer.valueOf(secondYpixel));
        System.out.println("Frequeny of your second pixel:" + secondfrequency);

        VelocityCalculator calculator = new VelocityCalculator();
        System.out.println("Geschwindigkeitsberechnung zwischen meinen zwei erkannten Pixeln in Meter pro Sekunde");
        System.out.println(calculator.calculate(firstfrequency, secondfrequency));
        // Todo noch die richtigen Frequenzvariablen einsetzten und über VelocotyCalculagor ausgeben lassen
        //   System.out.println("FrequencyCoefficient:" + frequencyMap.get(BigDecimal.valueOf(firstYpixel)) / frequencyMap.get(Integer.valueOf(secondYpixel)));
    }

    /**
     * Due to missing testdata a dummy map is created for our calculations.
     * Math.random is used to reflect the realistic uneven surface.
     *
     * @param imageHeight The pixel height of the image
     * @return Returns a map, where every pixel has a frequency.
     */
    public static Map<Integer, BigDecimal> createFrequencyMap(double imageHeight) {
        Map<Integer, BigDecimal> frequencyMap = new HashMap<Integer, BigDecimal>();
        BigDecimal initialfrequencyInGhz =  new BigDecimal(40);
        for (int i = 1; i <= imageHeight; i++){

            frequencyMap.put(i, initialfrequencyInGhz);
            double randomGrowth = FREQUENCY_GROWTH_VALUE + Math.random() * FREQUENCY_GROWTH_VALUE * 0.01;
            initialfrequencyInGhz =  initialfrequencyInGhz.add(BigDecimal.valueOf(FREQUENCY_GROWTH_VALUE));
        }
        return frequencyMap;
    }

}