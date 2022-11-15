public class Main3 {
    public static void main(String[] args) {
        int j = 0;
        int sum = 0;
        for (int i = 6; j <= i; i--)
        {
            j++;
            sum += i + j;
        }
        System.out.println(sum);
        System.out.println();
        int num = 100;
        for (int count = 1; count <= num; count++)
        {
            System.out.print(num + " ");
            num = num / 2;
        }


    }
}
