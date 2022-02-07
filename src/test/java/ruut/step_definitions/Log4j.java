package ruut.step_definitions;


import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4j {
    static Logger logger = Logger.getLogger(Log4j.class);

    public Log4j(){

        DOMConfigurator.configure("log4j.xml");
    }

    public void info(String message){

        logger.info(message);
    }

}
