import java.util.Scanner;

public class Screen {
    private Menu menu;
    private String promptPrefix = "> ";

    public Screen(Menu menu) {
        this.menu = menu;
    }

    public void display() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.print();

            System.out.println("[0] Encerrar");
            System.out.print(this.promptPrefix);

            String key = scanner.next();

            // @FIXME
            if (key.equals("0")) {
                System.out.println("Falous!");
                return;
            }

            if ( ! menu.execute(key)) {
                System.out.println("Opção inexistente.\n");
            }
        }
    }
}
