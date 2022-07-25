public class Option {
    public final String key;
    public final String description;
    public final Runnable action;

    public Option(String key, String description, Runnable action) {
        this.key = key;
        this.description = description;
        this.action = action;
    }

    public void print() {
        System.out.println("[" + key + "]" + " " + description);
    }

    public boolean execute() {
        if (null != action) {
            action.run();
        }

        return true;
    }
}
