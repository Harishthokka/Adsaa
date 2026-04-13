import java.util.*;

public class Main {

    static int n;
    static int board[];

    static boolean safe(int r, int c) {
        for (int i = 0; i < r; i++) {
            if (board[i] == c || Math.abs(board[i] - c) == Math.abs(i - r)) {
                return false;
            }
        }
        return true;
    }

    static void solve(int r) {
        if (r == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(board[i] + " ");
            }
            System.out.println();
            return;
        }

        for (int c = 0; c < n; c++) {
            if (safe(r, c)) {
                board[r] = c;
                solve(r + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n];
        solve(0);
        sc.close();
    }
}
