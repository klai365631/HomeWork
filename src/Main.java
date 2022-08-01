public class Main {
    public static void main(String[] args) {
        //Задача 1
       int a=0;
        while (a<10){
            System.out.print(++a+ " ");

            }
        System.out.println();

        for (;a>0;a--){
            System.out.print(a +" ");
        }
        System.out.println();
        //Задача 2
        int friday=5;
        for (;friday<=31;friday=friday+7)
        {System.out.println("Сегодня пятница, "+ friday+ "-е число. Необходимо подготовить отчет ");}

        //Задание 3
        int yearNew2=2020-200;
        int yearNew=2020+100;

        for (int year=0;year<=2020+100;year=year+79){
            if(year>=yearNew2&&year<=yearNew){

            System.out.print(year+" ");}
                }







    }
}