

public class Main {
    public static void main(String[] args) {

        //exercise 1

        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);


        //exercise 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());


        //exercise 3

        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName.replace(" ", "; "));

        //exercise 4

        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));

        //exercise 5

        String firstNameTwo = fullName.substring(fullName.indexOf(" ") + 1, fullName.lastIndexOf(" "));
        String middleNameTwo = fullName.substring(fullName.lastIndexOf(" ") + 1);
        String lastNameTwo = fullName.substring(0, fullName.indexOf(" ") + 1);
        ;
        System.out.println("Имя сотрудника — " + firstNameTwo + "\n" + "Фамилия сотрудника — " + lastNameTwo + " \n" + "Отчество сотрудника — " + middleNameTwo);


        //exercise 6
        String fullNameDown = "ivanov ivan ivanovich";
        char[] arrayName = fullNameDown.toCharArray();
        for (int i = 0; i < arrayName.length; i++) {
            String fullNameUp = new String(arrayName);
            if (i == 0) {
                arrayName[i] = Character.toUpperCase(arrayName[i]);

            } else if (arrayName[i] == ' ') {
                arrayName[i + 1] = Character.toUpperCase(arrayName[i + 1]);
            }
        }

        String fullNameUp = new String(arrayName);
        System.out.println(fullNameUp);


        //exercise 7
        String number1 = "135";
        String number2 = "246";
        StringBuilder fullNumbers = new StringBuilder(number1);
        char[] numberTwo = number2.toCharArray();
        fullNumbers.insert(1, numberTwo[0]);
        fullNumbers.insert(3, numberTwo[1]);
        fullNumbers.insert(5, numberTwo[2]);
        System.out.println(fullNumbers);


        //exercise 8

        String letter = "aabccddefgghiijjkk";
        char[] letters = letter.toCharArray();
        StringBuilder correctLetters = new StringBuilder();
        for (int i = 0; i < letters.length - 1; i++) {

            if (letters[i] == letters[i + 1]) {
                correctLetters.append(letters[i]);

            }

        }

        System.out.println(correctLetters);


    }
}
