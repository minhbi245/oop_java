public class Main {
    public static void main(String[] args) {
//        System.out.println("3?: " + isPrime(3));
        printPrimeListNumbers();
    }

    public static void printPrimeListNumbers() {
        System.out.println("The list of prime numbers from 1...1000");
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {   // re-use lại hàm isPrime để kiểm tra số phải là 1 số nguyên tố hay ko
                System.out.println(i + " ");
            }
        }
    }

    // if (điều gì đúng - true) thì sẽ làm gì đó mình cần nó đúng
    // Writing a function to check the number is prime
    public static boolean isPrime(int n) {
        // Kiểm tra xem n có chia hết cho đứa nào từ đoạn 2 ... n - 1
        // Số nguyên tố nhỏ nhất là 2

        if(n < 2) {
            return false; // thoát cuộc chơi liền return false
        }
        // CPU chạy đến đây thì n >= 2
        if (n == 2) {
            return true;
        }
        // CPU chạy tiếp đến thì n = 3, 4, 5...

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {   // lỡ tay chia hết 1 cháu, dừng -> return false
                return false;
            }
        }
        return true;
    }

    // Print out the numbers is Prime from 1...1000


}