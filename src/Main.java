public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1\n");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("Ф. И. О. сотрудника — %s\n", fullName);

        System.out.println("\nЗадача 2\n");

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("\nЗадача 3\n");

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.printf("Данные Ф. И. О. сотрудника — %s\n", fullName);
    }
}