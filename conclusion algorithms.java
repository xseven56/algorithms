// def get_float_input():
//     while True:
//         try:
//             float_input = float(input("Введите дробное число: "))
//             return float_input
//         except ValueError:
//             print("Некорректный ввод. Пожалуйста, введите дробное число.")

// 2
// try {
//     int d = 0;
//     double catchedRes1 = intArray[8] / d;
//     System.out.println("catchedRes1 = " + catchedRes1);
//  } catch (ArithmeticException e) {
//     System.out.println("Catching exception: " + e);
//  }


//  3

//  public static void main(String[] args) throws Exception {
//     try {
//         int a = 90;
//         int b = 3;
//         System.out.println(a / b);
//         printSum(23, 234);
//         int[] intArray = { 1, 2 };
//         intArray[3] = 9;
//     } catch (ArithmeticException ex) {
//         System.out.println("Ошибка деления на ноль!");
//     } catch (NullPointerException ex) {
//         System.out.println("Указатель не может указывать на null!");
//     } catch (ArrayIndexOutOfBoundsException ex) {
//         System.out.println("Выход за границы массива!");
//     } catch (Exception ex) {
//         System.out.println("Что-то пошло не так...");
//     }
//  }
//  public static void printSum(Integer a, Integer b) throws FileNotFoundException {
//     System.out.println(a + b);
//  }

// 4
// import java.util.Scanner;

// public class EmptyStringExceptionExample {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Введите строку: ");
//         String input = scanner.nextLine();
//         try {
//             if (input.isEmpty()) {
//                 throw new Exception("Пустые строки вводить нельзя!");
//             }
//             System.out.println("Вы ввели: " + input);
//         } catch (Exception ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }