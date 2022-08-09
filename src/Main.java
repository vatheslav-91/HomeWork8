import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String lastName = "Ivanov";
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String fullName = lastName + "  " + firstName + "  " + middleName;
        System.out.println("ФИО сотрудника " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения  отчета - " + fullName.toUpperCase());


        fullName = "Иванов Семён Семёнович";

        String replaceFullName = fullName.replace("ё", "е");

        System.out.println("Данные ФИО сотрудника - " + replaceFullName);

    }
}