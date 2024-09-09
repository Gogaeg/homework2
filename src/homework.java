import java.util.Scanner;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//задача1
//public class homework {
//
//
//    public static int findMax(int num1, int num2) throws Exception {
//        if (num1 == num2) {
//            throw new Exception("числа равны");
//        }
//        return Math.max(num1, num2);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//
//            System.out.print("первое число: ");
//            int num1 = scanner.nextInt();
//
//            System.out.print("второе число: ");
//            int num2 = scanner.nextInt();
//
//
//            int max = findMax(num1, num2);
//            System.out.println("максимум: " + max);
//        } catch (Exception e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА2
//class delim {
//
//    // Функция для деления двух чисел
//    public static double divide(double dividend, double divisor) throws Exception {
//        if (divisor == 0) {
//            throw new Exception("на ноль делить нельзя");
//        }
//        return dividend / divisor;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("делимое: ");
//            double dividend = scanner.nextDouble();
//
//            System.out.print("делитель: ");
//            double divisor = scanner.nextDouble();
//
//            double result = divide(dividend, divisor);
//            System.out.println("результат: " + result);
//        } catch (Exception e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            // Закрытие Scanner
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА3
//class nomer3 {
//
//    public static int convertToInt(String str) throws NumberFormatException {
//        try {
//            return Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            throw new NumberFormatException("невозможно конвертировать строку: " + str);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//
//            System.out.print("введите строку для конвертации в целое число: ");
//            String input = scanner.nextLine();
//
//            int result = convertToInt(input);
//            System.out.println("конвертированное число: " + result);
//        } catch (NumberFormatException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА4
//class nomer4 {
//    public static void validateAge(int age) throws IllegalArgumentException {
//        if (age < 0 || age > 150) {
//            throw new IllegalArgumentException("возраст должен быть от 0 до 150 лет. Получено: " + age);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите возраст: ");
//            int age = scanner.nextInt();
//
//            validateAge(age);
//            System.out.println("возраст принят: " + age);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 5
//class nomer5 {
//    public static double calculateSquareRoot(double number) throws IllegalArgumentException {
//        if (number < 0) {
//            throw new IllegalArgumentException("число не положительное. Получено: " + number);
//        }
//        return Math.sqrt(number);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите число для вычисления квадратного корня: ");
//            double number = scanner.nextDouble();
//
//            double result = calculateSquareRoot(number);
//            System.out.println("квадратный корень: " + result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 6
//class nomer6 {
//    public static BigInteger calculateFactorial(int number) throws IllegalArgumentException {
//        if (number < 0) {
//            throw new IllegalArgumentException("число не положительное. Получено: " + number);
//        }
//        BigInteger factorial = BigInteger.ONE;
//        for (int i = 1; i <= number; i++) {
//            factorial = factorial.multiply(BigInteger.valueOf(i));
//        }
//        return factorial;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите число для вычисления факториала: ");
//            int number = scanner.nextInt();
//
//            BigInteger result = calculateFactorial(number);
//            System.out.println("факториал: " + result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 7
//class nomer7 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите количество элементов в массиве: ");
//            int size = scanner.nextInt();
//            int[] array = new int[size];
//
//            System.out.println("введите элементы массива:");
//            for (int i = 0; i < size; i++) {
//                array[i] = scanner.nextInt();
//            }
//
//            check0(array);
//            System.out.println("массив не содержит нулей.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//    public static void check0(int[] array) throws IllegalArgumentException {
//        for (int value : array) {
//            if (value == 0) {
//                throw new IllegalArgumentException("массив содержит нули");
//            }
//        }
//    }
//}
//ЗАДАЧА8
//class nomer8 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите основание: ");
//            double base = scanner.nextDouble();
//
//            System.out.print("введите степень: ");
//            int exponent = scanner.nextInt();
//
//            double result = a(base, exponent);
//            System.out.println("результат возведения в степень: " + result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//    public static double a(double base, int exponent) throws IllegalArgumentException {
//        if (exponent < 0) {
//            throw new IllegalArgumentException("степень не может быть отрицательной. Получено: " + exponent);
//        }
//        return Math.pow(base, exponent);
//    }
//}
//ЗАДАЧА 9
//class nomer9 {
//    public static String trimString(String str, int length) throws IllegalArgumentException {
//        if (length > str.length()) {
//            throw new IllegalArgumentException("число символов для обрезки больше длины строки.");
//        }
//        return str.substring(0, length);
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите строку: ");
//            String input = scanner.nextLine();
//
//            System.out.print("введите количество символов для обрезки: ");
//            int length = scanner.nextInt();
//
//            String result = trimString(input, length);
//            System.out.println("обрезанная строка: " + result);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 10
//class nomer10 {
//    public static int findElement(int[] array, int element) throws IllegalArgumentException {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == element) {
//                return i;
//            }
//        }
//        throw new IllegalArgumentException("элемент " + element + " не найден в массиве.");
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите количество элементов в массиве: ");
//            int size = scanner.nextInt();
//            int[] array = new int[size];
//
//            System.out.println("введите элементы массива:");
//            for (int i = 0; i < size; i++) {
//                array[i] = scanner.nextInt();
//            }
//
//            System.out.print("введите элемент для поиска: ");
//            int element = scanner.nextInt();
//
//            int index = findElement(array, element);
//            System.out.println("элемент найден на позиции: " + index);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА11
//class nomer11 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите целое число: ");
//            int number = scanner.nextInt();
//
//            String binaryString = con(number);
//            System.out.println("число в двоичной системе: " + binaryString);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//    public static String con(int number) throws IllegalArgumentException {
//        if (number < 0) {
//            throw new IllegalArgumentException("число не может быть отрицательным. Получено: " + number);
//        }
//        return Integer.toBinaryString(number);
//    }
//}
//ЗАДАЧА 12
//class nomer12 {
//    public static boolean isDivisible(int dividend, int divisor) throws ArithmeticException {
//        if (divisor == 0) {
//            throw new ArithmeticException("на ноль делить нельзя.");
//        }
//        return dividend % divisor == 0;
//    }
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите делимое: ");
//            int dividend = scanner.nextInt();
//
//            System.out.print("введите делитель: ");
//            int divisor = scanner.nextInt();
//
//            boolean result = isDivisible(dividend, divisor);
//            if (result) {
//                System.out.println(dividend + " делится на " + divisor + " без остатка.");
//            } else {
//                System.out.println(dividend + " не делится на " + divisor + " без остатка.");
//            }
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 13
//class nomer13 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите количество элементов в списке: ");
//            int size = scanner.nextInt();
//            scanner.nextLine(); // Очистка буфера после nextInt()
//
//            List<String> list = new ArrayList<>();
//            System.out.println("введите элементы списка:");
//            for (int i = 0; i < size; i++) {
//                list.add(scanner.nextLine());
//            }
//
//            System.out.print("введите индекс элемента для получения: ");
//            int index = scanner.nextInt();
//
//            String element = gE(list, index);
//            System.out.println("элемент на позиции " + index + ": " + element);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//    public static <T> T gE(List<T> list, int index) throws IndexOutOfBoundsException {
//        if (index < 0 || index >= list.size()) {
//            throw new IndexOutOfBoundsException("индекс " + index + " выходит за пределы списка.");
//        }
//        return list.get(index);
//    }
//}
//ЗАДАЧА 14
//class nomer14 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите пароль: ");
//            String password = scanner.nextLine();
//
//            check(password);
//            System.out.println("пароль принят.");
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//    public static void check(String password) throws IllegalArgumentException {
//        if (password.length() < 8) {
//            throw new IllegalArgumentException("пароль должен содержать не менее 8 символов.");
//        }
//    }
//}
//ЗАДАЧА 15
//class nomer15 {
//    public static void validateDate(String dateString) throws DateTimeParseException {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate date = LocalDate.parse(dateString, formatter);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите дату в формате dd.MM.yyyy: ");
//            String dateString = scanner.nextLine();
//
//            validateDate(dateString);
//            System.out.println("дата корректна.");
//        } catch (DateTimeParseException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 16
//class nomer16 {
//    public static String concatenateStrings(String str1, String str2) throws NullPointerException {
//        if (str1 == null || str2 == null) {
//            throw new NullPointerException("одна или обе строки равны null");
//        }
//        return str1 + str2;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите первую строку: ");
//            String str1 = scanner.nextLine();
//
//            System.out.print("введите вторую строку: ");
//            String str2 = scanner.nextLine();
//
//            String result = concatenateStrings(str1, str2);
//            System.out.println("результат конкатенации: " + result);
//        } catch (NullPointerException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 17
//class nomer17 {
//    public static int zxc(int dividend, int divisor) throws ArithmeticException {
//        if (divisor == 0) {
//            throw new ArithmeticException("деление на ноль невозможно.");
//        }
//        return dividend % divisor;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите делимое: ");
//            int dividend = scanner.nextInt();
//
//            System.out.print("введите делитель: ");
//            int divisor = scanner.nextInt();
//
//            int remainder = zxc(dividend, divisor);
//            System.out.println("остаток от деления: " + remainder);
//        } catch (ArithmeticException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 18
//class nomer18 {
//    public static double cxz(double number) throws IllegalArgumentException {
//        if (number < 0) {
//            throw new IllegalArgumentException("нельзя вычислять квадратный корень из отрицательного числа.");
//        }
//        return Math.sqrt(number);
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите число: ");
//            double number = scanner.nextDouble();
//
//            double squareRoot = cxz(number);
//            System.out.println("квадратный корень числа: " + squareRoot);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА 19
//class nomer19 {
//    public static double tempo(double cel) throws IllegalArgumentException {
//        final double ZERO = -273.15;
//        if (cel < ZERO) {
//            throw new IllegalArgumentException("температура ниже абсолютного нуля");
//        }
//        return (cel * 9/5) + 32;
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("введите температуру в Цельсиях: ");
//            double cel = scanner.nextDouble();
//
//            double farengate = tempo(cel);
//            System.out.println("температура в Фаренгейтах: " + farengate);
//        } catch (IllegalArgumentException e) {
//            System.out.println("ошибка: " + e.getMessage());
//        } finally {
//            scanner.close();
//        }
//    }
//}
//ЗАДАЧА20
class nomer20 {
    public static void check(String str) throws IllegalArgumentException {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("строка пустая/равна null.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("введите строку: ");
            String input = scanner.nextLine();

            check(input);
            System.out.println("строка корректна.");
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}