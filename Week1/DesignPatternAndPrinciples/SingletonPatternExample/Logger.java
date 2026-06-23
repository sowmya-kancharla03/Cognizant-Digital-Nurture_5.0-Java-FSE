public class Logger {
    private static Logger log;
    private Logger() {
        System.out.println("Logger object is created");
    }
    public static Logger getInstance() {
        if (log == null) {
            log = new Logger();
        }
        return log;
    }
    public static void main(String[] args) {
        Logger l = Logger.getInstance();
        Logger l1 = Logger.getInstance();
        System.out.println("The first object is " + l);
        System.out.println("The second object is " + l1);
        System.out.println((l == l1)? "Both are same" : "Both aren't same");
    }
}