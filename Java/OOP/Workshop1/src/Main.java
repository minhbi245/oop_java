// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean result = isPrime(0);
        System.out.println("0: " + result);
        System.out.println("100: " + isPrime(100));
        System.out.println("101: " + isPrime(101));
        printPrimeList();

    }

    public static void printPrimeList() {
        System.out.println("The list of primes from 1...1000");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
            // else rồi đấy, nếu CPU đến đây, n >= 2
            // Kiểm tra xem trong khoảng từ 2 ... căn (n)
            // Lỡ tay chia hết đứa nào ko, có kl ngay ko nguyên tố
        } else if (n == 2) {
            return true;
        } else {
            // for 2 ... căn n, n ơi, mày có chia hết đứa nào từ 2 ... căn ?
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) { // n mày lỡ tay chia hết trong [2 ... căn]
                    return false;
                }
            }
        }
        return true;
    }
}