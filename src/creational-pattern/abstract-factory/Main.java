public class Main {
    private static App configureApp() {
        App app;
        GUIFactory factory;
        String osName = "mac";
        if (osName.equalsIgnoreCase("windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApp();
        app.paint();
    }
}
