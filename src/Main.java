public class Main {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 0; x < 11; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 15; x >= 0; x--) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 15; x > -1; x--) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 1; x <= 15; x++) {
            if (x % 2 == 1) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        for (int x = 1; x <= 15; x += 2) {
            System.out.print(x + " ");
        }
    }
}
