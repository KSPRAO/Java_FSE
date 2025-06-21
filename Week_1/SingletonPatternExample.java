public class SingletonPatternExample {
    public static void main(String[] args) {
        // Verify Singleton Logger
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();
        
        System.out.println("Is single instance? " + (firstLogger == secondLogger));
        firstLogger.logMessage("Application launched");
        secondLogger.logMessage("User action recorded");
    }
}

class Logger {
    private static Logger singleInstance;
    
    private Logger() {
        System.out.println("Logger instance initialized");
    }
    
    public static Logger getInstance() {
        if (singleInstance == null) {
            synchronized (Logger.class) {
                if (singleInstance == null) {
                    singleInstance = new Logger();
                }
            }
        }
        return singleInstance;
    }
    
    public void logMessage(String msg) {
        System.out.println("LOG ENTRY: " + msg);
    }
}
