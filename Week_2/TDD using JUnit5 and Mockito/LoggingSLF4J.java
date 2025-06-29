import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogExample {
    static Logger logger = LoggerFactory.getLogger(LogExample.class);

    public static void main(String[] args) {
        logger.info("Info");
        logger.warn("Warning");
        logger.error("Error");
    }
}
