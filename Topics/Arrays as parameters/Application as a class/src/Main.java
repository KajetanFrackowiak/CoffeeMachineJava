import java.util.Arrays;

class Application {
    public static void main(String[] args) {
        run(new String[]{"allez", "allez", "allez"});
    }

    public static void run(String[] args) {
        for (String element : args) {
            System.out.println(element);
        }
    }
}
