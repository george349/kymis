import java.io.IOException;
import java.util.Scanner;

public class main {
    public static <java> void main(String[] args) throws IOException {
        name();
        Game(name(), name());
        newGame();
    }
    public static String name (){
    Scanner in = new Scanner(System.in);
            System.out.println("Приветствуем вас в Камень\uD83D\uDC8E,Ножницы ✄,Бумага\uD83D\uDCC3");
            System.out.println("Игрок 1 введите имя");
    String name1 = in.nextLine();
            System.out.println("Игрок 2 введите имя");
    String name2 = in.nextLine();

        return name2;
    }
        public static int Game (String name1, String name2) {
            int kw1 = 0;
            int kw2 = 0;
            // System.out.println();
            //for ( kw1 = 1; kw1 < 10; kw1++);
            String k = "камень";
            String n = "ножницы";
            String b = "бумага";
//            Scanner in = new Scanner(System.in);
//            System.out.println("Приветствуем вас в Камень\uD83D\uDC8E,Ножницы ✄,Бумага\uD83D\uDCC3");
//            System.out.println("Игрок 1 введите имя");
//            String name1 = in.nextLine();
//            System.out.println("Игрок 2 введите имя");
//            String name2 = in.nextLine();


            System.out.println(name1 + " выбери значение\n" +
                    "k - камень\n b-бумага \n n-ножницы");

            Scanner scanner = new Scanner(System.in);
            String p1 = scanner.nextLine();


            System.out.println(name2 + " выбери значение\n" +
                    "k - камень\n b-бумага \n n-ножницы");
            String p2 = scanner.nextLine();


//
//        if (p1.equals("k")){
//            if (p2.equals("k")){
//                System.out.println("ничья");
//            }
//            if (p2.equals("n")){
//                System.out.println("выигр");
//            }
//            if (p2.equals("b")){
//                System.out.println("проигр");
//            }
//        }

            if (p1.equals("k")) {
                if (p2.equals("k")) {
                    System.out.println("ничья");
                }
                if (p2.equals("n")) {
                    System.out.println("выиграл " + name1);
                    kw1 = +1;
                    return kw1;
                }
                if (p2.equals("b")) {
                    System.out.println("выиграл " + name2);
                    kw2 = +1;
                    return kw2;

                }
            }
            if (p1.equals("b")) {
                if (p2.equals("b")) {
                    System.out.println("ничья");
                }
                if (p2.equals("k")) {
                    System.out.println("выиграл " + name1);
                    kw1 = +1;
                    return kw1;
                }
                if (p2.equals("n")) {
                    System.out.println("выиграл " + name2);
                    kw2 = +1;
                    return kw2;
                }
            }
            if (p1.equals("n")) {
                if (p2.equals("n")) {
                    System.out.println("ничья");
                }
                if (p2.equals("b")) {
                    System.out.println("выиграл " + name1);
                    kw1 = +1;
                    return kw1;
                }
                if (p2.equals("k")) {
                    System.out.println("выиграл " + name2);
                    kw2 = +1;
                    return kw2;

                }
            }
            // return kw1;

            return kw1;
        }
public static void res(int kw1, int kw2){

            System.out.println("Результаты:");
            System.out.println(kw1);
            System.out.println(kw2);
            if (kw1 > kw2) {
                System.out.println(" Игрок 1-победа");
            }
            if (kw2 > kw1) {
                System.out.println( "Игрок2 -победа");
            }
            if (kw1 == kw2) {
                System.out.println("ничья");
            }
        }
        public static void newGame (){
            String yes = "да";
            String no = "нет";
            System.out.println("Хотите сыграть ещё? да \n нет");
            Scanner scanner = new Scanner(System.in);
            String p = scanner.nextLine();
            if (p.equals(yes)) {
                Game(name(), name());
            }
            if (p.equals(no)){
                res(1,2);
            }
        }
    }







