import java.util.Arrays;
import java.util.HashMap;

public class Menu {
    private Option[] options;
    private HashMap<String, Integer> index;

    public Menu(Option[] options) {
        this.options = options;
        this.index = new HashMap<>();

        for (int i = 0; i < this.options.length; ++ i) {
            this.index.put(options[i].key, i);
        }
    }

    private Option find(String key) {
        return this.options[this.index.get(key)];
    }

    public boolean execute(String key) {

        if ( ! this.index.containsKey(key)) {
            return false;
        }

        return this.find(key).execute();
    }

    public void print() {
        Arrays.stream(this.options).forEach(i -> i.print());
    }
}
