import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> noteBook = new ArrayList<>();

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1.Добавить задачу");
            System.out.println("2.Вывести список задач");
            System.out.println("3.Удалить задачу");
            System.out.println("0.Выход");

            String input = scanner.nextLine();
            int taskNumber = Integer.parseInt(input);

            if (taskNumber == 0) {
                System.out.println("Работа завершена");
                break;
            } else {
                switch (taskNumber) {

                    case 1:
                        while (true) {
                            System.out.println("Введите название задачи (для завершения введите end)");
                            String taskName = scanner.nextLine();
                            if (taskName.equals("end")) {
                                outputOnDisplay(noteBook);
                                break;
                            } else {
                                noteBook.add(taskName);
                            }
                        }
                        break;


                    case 2:
                        if (noteBook.size() == 0) {
                            System.out.println("Задач нет");
                            System.out.println();
                        } else {
                            outputOnDisplay(noteBook);
                        }
                        break;


                    case 3:
                        while (true) {
                            System.out.println("Введите номер удаляемой задачи ('finish' для завершения)");
                            String removeTask = scanner.nextLine();
                            if (removeTask.equals("finish")) {
                                outputOnDisplay(noteBook);
                                break;
                            } else {
                                int numberRemoveTask = Integer.parseInt(removeTask);
                                noteBook.remove(numberRemoveTask - 1);
                                outputOnDisplay(noteBook);
                            }
                        }
                }

            }
        }

    }

    public static void outputOnDisplay(List<?> list) {
        System.out.println();
        System.out.println("Список задач:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + 1 + ". " + list.get(i));
        }
        System.out.println();
    }

}