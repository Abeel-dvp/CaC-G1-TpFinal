import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;


public class CloudinaryConfig {
    private static final String PROPERTIES_FILE = "/cloudinary.properties";
    private Properties properties = new Properties();

    public CloudinaryConfig() {
        try (InputStream input = getClass().getResourceAsStream(PROPERTIES_FILE)) {
            if (input != null) {
                properties.load(input);
            } else {
                throw new RuntimeException("Could not find " + PROPERTIES_FILE);
            }
        } catch (IOException e) {
            throw new RuntimeException("Error loading " + PROPERTIES_FILE, e);
        }
    }

    public Cloudinary getCloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", properties.getProperty("cloudinary.cloud_name"),
                "api_key", properties.getProperty("cloudinary.api_key"),
                "api_secret", properties.getProperty("cloudinary.api_secret")
        ));
    }
}
