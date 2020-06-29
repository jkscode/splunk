import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SplunkLogback {

    private static final Logger LOGGER = LoggerFactory.getLogger("splunkLogger");

    public static void main(String[] args) {
        LOGGER.info("Hello from SplunkLogback");
    }
}
