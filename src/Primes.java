public class Primes {// создание класса

    public static void main(String[] args) {

        int n = 2;// начальное число
        while (n < 100) {
            if (isPrime(n)) {// используем написанную функцию

                System.out.println(n);// вывод результата

            }

            n++;

        }

    }

    private static boolean isPrime(int n) {// Создание функции проверки числа на простое число

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}