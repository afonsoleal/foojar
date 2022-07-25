public class App {
    private Screen[] screens;

    public static App init() {
        App self = new App();

        // @FIXME
        self.screens = new Screen[]{
                new Screen(new Menu(new Option[]{
                        new Option("a", "A de amor", Main::dummy),
                        new Option("b", "B de baixinho", Main::dummy),
                        new Option("c", "C de coração", Main::dummy),
                        new Option("d", "D de docinho", Main::dummy),
                        new Option("e", "E de escola", null),
                })),
        };

        return self;
    }

    public void display() {
        this.screens[0].display();
    }
}
