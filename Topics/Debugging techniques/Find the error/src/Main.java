import java.util.Scanner;

class Util {
    public static void swapInts(int[] ints) {
        int temp = ints[0];
        ints[0] = ints[1];
        ints[1] = temp;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[2];
        ints[0] = Integer.parseInt(scanner.nextLine());
        ints[1] = Integer.parseInt(scanner.nextLine());



        Util.swapInts(ints);

        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
}

class Animal {
    private String name;

    Animal(String name) {
        assert (name != null) : "Name must not be null";
        this.name = name;
    }
}