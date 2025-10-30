package StateDesignPattern;

public class MainMethod {
    public static void main(String[] args) {
        TrafficStateContext context = new TrafficStateContext();
        context.next();
        context.next();
    }
}
