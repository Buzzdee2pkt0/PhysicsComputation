import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class main {

    //Business Scenario:
    // GIVEN: A SAR Image
    // WHEN:  I read the Image
    // THEN:  I can calculate real distance between pixels


    private static final String DUMMY_PATH = "C:\\Users\\klang\\OneDrive\\WiSe2122\\Programieren\\Testship.png";


    public static void main(String[] args) throws IOException {

        // Currently hardcoded assumed values TODO should be replaced with valid values
        int imageHeight = 500;
        double frequencyGrowthValue = 0.1;

        // First is y-pixel position, second value is frequency
        Map<Integer, Float> frequencyMap = new HashMap<Integer, Float>();
        float initialfrequencyInMhz = 40;
        for (int i = 1; i <= imageHeight; i++){

            frequencyMap.put(i, initialfrequencyInMhz);
            initialfrequencyInMhz += frequencyGrowthValue;
        }
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


        System.out.println("Frequeny of your first pixel:" + frequencyMap.get(Integer.valueOf(firstYpixel)));
        System.out.println("Frequeny of your second pixel:" + frequencyMap.get(Integer.valueOf(secondYpixel)));

        System.out.println("Starting calculation meter between your pixel.... KRASSer scheiß");
    }

}