public class Main2 {
    public static void main(String[] args) {
        for (int count = 5; count < 10; count++) {
            System.out.print(count + " ");
        }
        // 1a
        System.out.println();
        for (int i = 20; i >= 0; i = i - 3) {
            System.out.print(i + " ");
        }
        //1b
        System.out.println();
        int sum = 0;
        int x = 5;
        for (int i = 0; i < 10 + x; i += 2) {
            sum += i;
        }
        System.out.println(sum);
        //1c
        int j = 40;
        for (int i = 10; i < j + 10; i += 5) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 100 ; i += 6) {
            System.out.print(i + " ");
        }



    }
}
