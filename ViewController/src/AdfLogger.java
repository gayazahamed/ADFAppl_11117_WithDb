import oracle.adf.share.logging.ADFLogger;

public class AdfLogger {
    public AdfLogger() {
    }
    private static ADFLogger LOGGER =
        ADFLogger.createADFLogger(AdfLogger.class);

    public String LogTheMessage() {
        LOGGER.info("Infoooooooooo");
        LOGGER.severe("severe");
        LOGGER.fine("fine");
        LOGGER.finest("finest");
        System.out.println(LOGGER.getLevel());
        return null;
    }
}
