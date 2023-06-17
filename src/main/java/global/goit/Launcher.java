package global.goit;

import org.apache.log4j.BasicConfigurator;
import global.goit.gto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Launcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Launcher.class);
    public static void main(String[] args) {
        BasicConfigurator.configure();
        String gson = "{\"name\": \"Yan\","
                + "\"lastName\": \"Kurhuzov\"}";
        LOGGER.info(new User().parser(gson).toString());
        LOGGER.info("The end!");
    }
}
