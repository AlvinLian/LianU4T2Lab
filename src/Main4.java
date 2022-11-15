import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        String print = "Print Me!";

        for(int i = 0; i <= print.length(); i++)
        {
            System.out.println(print.substring(i, i + 1));
        }

    }
}
