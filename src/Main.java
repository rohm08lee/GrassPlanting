import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("planting.in"));
        PrintWriter pw = new PrintWriter("planting.out");

        int N = sc.nextInt();
        int[] chain = new int[N];
        for (int i = 0; i < N-1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            chain[a-1]++;
            chain[b-1]++;
        }
        int max = 0;
        for (int i = 0; i < N; i++) {
            if (chain[i]>max) {
                max = chain[i];
            }
        }
        pw.println(max+1);
        pw.close();
    }
}