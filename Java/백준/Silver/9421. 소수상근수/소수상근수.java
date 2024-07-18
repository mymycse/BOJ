import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxN = sc.nextInt();
        sc.close();

        boolean[] isPrime = new boolean[maxN + 1];
        for (int i = 2; i <= maxN; i++) 
            isPrime[i] = true;

        for (int i = 2; i * i <= maxN; i++)
            if (isPrime[i])
                for (int j = i * i; j <= maxN; j += i)
                    isPrime[j] = false;

        for (int i = 2; i <= maxN; i++)
            if (isPrime[i] && isHappyNumber(i))
                System.out.println(i);
    }

    private static boolean isHappyNumber(int n) {
        Set<Integer> visited = new HashSet<>();
        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }

    private static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}