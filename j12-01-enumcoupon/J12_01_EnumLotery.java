
/*
enum COUPON  tam yarım çeyrek
int array aç 5 elemanlı içine 0 -9 arasında random sayı ata 
kullanıcıdan 10 unit parası olsun her bilet aldığında 1 unit (tl) düşecek  tam 4 yarım 2 çeyrek 1
numarayı sor girdiği numara randomlardan birini tutuyorsa bilet parası + kendisi (4 ise 8 lira)
20 lira veya 0 lira olduğunda bitecek
dosyaya byte oku stream ile 
scanner ile oku
*/
import java.util.Scanner;

public class J12_01_EnumLotery {

    enum TICKET {
        TAM, YARIM, CEYREK, NONE
    }

    // ticket.name --> ismi string olarak veriyor
    // ordianl --> indexi döndürüyor
    public static void main(String[] args) {
        int[] randomNumbers = new int[5];
        int unit = 10;
        System.out.println("You have " + unit + "TL");

        System.out.println("\nSelect ticket type");
        System.out.println("1-TAM\n2-YARIM\n3-ÇEYREK");
        TICKET ticketType = TICKET.NONE;
        Scanner input = new Scanner(System.in);
        int choiceTicket = input.nextInt();
        switch (choiceTicket) {
        case 1:
            ticketType = TICKET.TAM;
            unit -= 4;
            break;
        case 2:
            ticketType = TICKET.YARIM;
            unit -= 2;
            break;
        case 3:
            ticketType = TICKET.CEYREK;
            unit -= 1;
            break;
        default:
            System.out.println("incorrect input");
            break;
        }
        System.out.println("\nYou have " + ticketType.name() + " ticket");

        while (unit > 0 && unit < 20) {
            System.out.println("\n\n\n\n");
            System.out.println("Random numbers:");

            for (int i = 0; i < 5; i++) {
                int rnd = (int) (Math.random() * 10);
                randomNumbers[i] = rnd;
                System.out.print(randomNumbers[i] + " ");
            }

            System.out.println("\nYou have " + ticketType.name() + " ticket");
            System.out.println("You have " + unit + " TL");
            System.out.print("Enter number => ");
            int inputNumber = input.nextInt();
            int ticketTypeInt = ticketType.ordinal();
            boolean flag = false;
            for (int i = 0; i < randomNumbers.length; i++) {
                if (inputNumber == randomNumbers[i]) {
                    flag = true;
                    break;
                }
            }
            switch (ticketTypeInt) {
            case 0:
                if (flag) {
                    unit += 4;
                    break;
                } else {
                    unit -= 4;
                    break;
                }

            case 1:
                if (flag) {
                    unit += 2;
                    break;
                } else {
                    unit -= 2;
                    break;
                }

            case 2:
                if (flag) {
                    unit += 1;
                    break;
                } else {
                    unit -= 1;
                    break;
                }

            }

            if (flag) {
                System.out.println("correct number");
            } else {
                System.out.print("incorrect number");
            }
        }
        input.close();
    }
}