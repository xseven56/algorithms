import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество номер_телефона");
        String input = scanner.nextLine();

        String[] data = input.split(" ");
        if (data.length != 4) {
            System.out.println("Ошибка: неверное количество данных");
            return;
        }

        String surname = data[0];
        String name = data[1];
        String patronymic = data[2];
        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(data[3]);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: номер телефона должен быть целым беззнаковым числом");
            return;
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt", true));
            writer.write(surname + name + patronymic + phoneNumber + "\n");
            writer.close();
            System.out.println("Данные успешно записаны в файл " + surname + ".txt");
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл:");
            e.printStackTrace();
        }
    }
}
