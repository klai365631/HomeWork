public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 0;
        while (a < 10) {
            System.out.print(++a + " ");

        }
        System.out.println();

        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        //Задача 2
        int friday = 5;
        for (; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет ");
        }

        //Задание 3
        int yearNew2 = 2020 - 200;
        int yearNew = 2020 + 100;

        for (int year = 0; year <= 2020 + 100; year = year + 79) {
            if (year >= yearNew2 && year <= yearNew) {

                System.out.print(year + " ");
            }
        }
        System.out.println();

        //Задание 4 Это задание очень любят давать на собеседованиях в разных вариациях, потому мы предлагаем его вам,
        // чтобы вы оценили свои силы.
        //Необходимо пройти циклом по числам от 1 до 30 включительно и, если число делится на 3 без остатка,
        // вывести ping, а если число делится на 5 без остатка, вывести pong.
        //Если число делится без остатка и на 3, и на 5, необходимо вывести ping pong.
        //Допускается наличие пустых строк в выводе.4 за


        int pong = 5;
        int ping = 3;
        for (int number = 1; number <= 30; number++) {
            ping=number%ping;
            System.out.println(+number + ":"+ping);
            }



        }
    }