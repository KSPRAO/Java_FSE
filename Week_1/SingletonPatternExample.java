public class SingletonPatternExample {
    public static void main(String[] args) {
        // Testing Singleton Logger
        SystemLogger systemLogger1 = SystemLogger.getSystemLogger();
        SystemLogger systemLogger2 = SystemLogger.getSystemLogger();
        
        System.out.println("Same logger instance? " + (systemLogger1 == systemLogger2));
        systemLogger1.record("System initialization completed");
        systemLogger2.record("Processing user request");
    }
}

class SystemLogger {
    // Static instance for Singleton
    private static SystemLogger singletonLogger;
    
    // Private constructor
    private SystemLogger() {
        System.out.println("SystemLogger created");
    }
    
    // Static method to access the singleton instance
    public static SystemLogger getSystemLogger() {
        if (singletonLogger == null) {
            synchronized (SystemLogger.class) {
                if (singletonLogger == null) {
                    singletonLogger = new SystemLogger();
                }
            }
        }
        return singletonLogger;
    }
    
    // Method to record log messages
    public void record(String message) {
        System.out.println("SYSTEM LOG: " + message);
    }
}