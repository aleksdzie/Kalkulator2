import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Witaj w kalkulatorze!\n Podaj pierwszą cyfrę");
        int cyfra1=scanner.nextInt();
        System.out.println("Podaj drugą cyfrę");
        int cyfra2=scanner.nextInt();
        System.out.println("Wybierz operację:\n 1 - Dodawanie\n 2 - Odejmowanie\n 3 - Mnożenie\n 4 - Dzielenie");
        int opcja=scanner.nextInt();
        switch(opcja){
            case 1:
            System.out.println(cyfra1+cyfra2);
            break;
            case 2:
                System.out.println(cyfra1-cyfra2);
                break;
            case 3:
                System.out.println(cyfra1*cyfra2);
                break;
                case 4:
                System.out.println(cyfra1/cyfra2);
                break;

        }



    }
}