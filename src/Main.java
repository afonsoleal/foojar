public class Main {
    private static App app;

    public static void main(String[] args) {
        app = App.init();
        app.display();
    }

    public static void dummy() {
        System.out.println("Java ipsum.");
    }
}
