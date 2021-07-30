import view.Startup;

public class App {
    public static void main(String[] args) throws Exception {
        // Número de posições
        Startup.batch(1000);
        Startup.batch(10000);
        Startup.batch(100000);
    }
}
