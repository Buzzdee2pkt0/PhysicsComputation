import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageReader {

    private static final String DUMMY_PATH = "files/Testship.png";

    public BufferedImage readImage(String path) throws IOException {
        File file;
        if(path == null || path.equals("")){
            file = new File(DUMMY_PATH);
        }else {
            file = new File(path);
        }
        System.out.println(file.getAbsolutePath());
        return ImageIO.read(file);
    }
}
