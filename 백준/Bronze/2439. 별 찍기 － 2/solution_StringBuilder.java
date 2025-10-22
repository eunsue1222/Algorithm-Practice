import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            sb.append(" ".repeat(N - i));
            sb.append("*".repeat(i));
            sb.append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}