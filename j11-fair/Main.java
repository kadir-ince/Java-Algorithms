/******************************************************************************
Çarşamba sabah 8 Java Dersi
Kadir INCE

lunaparkda üyelik sistemi mevcut
GOLDEN üyelik -> 50 TL
SILVER üyelik -> 40 TL
BRONZ üyelik -> 20 TL

lunaparkdaki oyunların ücreti:
roller coaster -> 2-4-5 tl (üyelik tipi sırasıyla)
scale house --> 3-5-7 tl 

main -> select your membership type: 1 2 3 
enter your payment: 200 tl verilmiş olsun 
wallet = girilen para - üyelik tipi 
200-50
wallet = 150;


do-while içinde kullanıcıdan neye binecek (2 oyun) 
seçtikce kullanıcıdan o tutarı düş 
wallet en düşük oyunun ücreti 
seçilen oyun --> 1
wallet = 150 - 2
wallet = 148 TL
para yetmediyse kalan tutar otomatik sıfırla
*******************************************************************************/

import java.util.Scanner;

public class Main 
{
    enum Membership 
    {
        GOLDEN, 
        SILVER, 
        BRONZ, 
        None
    }

    static Scanner input = new Scanner(System.in);
    static int wallet = 0;
    static Membership memberType = Membership.None;

    public static void main(String[] args) 
    {
        // enterwallet() = Kullanıcıdan para girişi alır
        // selectMembership() = kullanıcıdan istediği üyelik tipini seçmesini ister
        // choiceGame() = kullanıcıdan oyun seçip oyun oynamasını sağlar
        wallet = enterwallet();
        if (wallet >= 20) 
        {
            memberType = selectMembership();
            if (memberType != Membership.None) 
            {
                choiceGame();
            } 
        } 
        else 
        {
            System.out.println("not enough money! your money giving to you\nPlease try again");
        }
        input.close();
    }

    public static int enterwallet() 
    {
        System.out.println("Enter Money:");
        int wallet = input.nextInt();
        if (wallet >= 20) {
            return wallet;
        } 
        else 
        {
            return 0;
        }
    }

    public static Membership selectMembership() 
    {
        membershipMenu();

        int choiceMembership = input.nextInt();

        switch (choiceMembership) 
        {
        case 1:
            if (wallet >= 50) 
            {
                memberType = Membership.GOLDEN;
                atNowMembershipType();
                wallet -= 50;
            } 
            else 
            {
                notEnoughMoneyMember();
            }
            break;
        case 2:
            if (wallet >= 40) 
            {
                memberType = Membership.SILVER;
                atNowMembershipType();
                wallet -= 40;
            } 
            else 
            {
                notEnoughMoneyMember();
            }
            break;
        case 3:
            if (wallet >= 20) 
            {
                memberType = Membership.BRONZ;
                atNowMembershipType();
                wallet -= 20;
            } 
            else 
            {
                notEnoughMoneyMember();
            }
            break;
        }
        return memberType;
    }

    public static void choiceGame() 
    {
        atNowWallet();
        int choiceGameType;
        do 
        {
            gameMenu();
            choiceGameType = input.nextInt();
            if (memberType == Membership.GOLDEN) 
            {
                switch (choiceGameType) 
                {
                case 1:
                    if (wallet >= 2) 
                    {
                        wallet -= 2;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;

                case 2:
                    if (wallet >= 3) 
                    {
                        wallet -= 3;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;
                }
            }

            else if (memberType == Membership.SILVER) 
            {
                switch (choiceGameType) 
                {
                case 1:
                    if (wallet >= 4) 
                    {
                        wallet -= 4;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;

                case 2:
                    if (wallet >= 5) 
                    {
                        wallet -= 5;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;
                }
            }

            else if (memberType == Membership.BRONZ) 
            {
                switch (choiceGameType) 
                {
                case 1:
                    if (wallet >= 5) 
                    {
                        wallet -= 5;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;

                case 2:
                    if (wallet >= 7) 
                    {
                        wallet -= 7;
                        atNowWallet();
                    } 
                    else 
                    {
                        wallet = 0;
                        notEnoughMoneyGame();
                    }
                    break;
                }
            }
        } while (wallet > 0);
    }
    public static void membershipMenu()
    {
        System.out.println("Select membership type:");
        System.out.println("1- GOLDEN = 50 TL");
        System.out.println("2- SILVER = 40 TL");
        System.out.println("3- BRONZ = 20 TL");
    }
    
    public static void gameMenu()
    {
        System.out.println("\nSelect game:");
        System.out.println("1- Roller coaster");
        System.out.println("2- scare house");
    }
    public static void notEnoughMoneyGame() 
    {
        System.out.println("not enough money for this game");
        System.out.println("your wallet is reset");

    }

    public static void notEnoughMoneyMember() 
    {
        System.out.println("not enough money for this membership type! your money giving to you\nPlease try again");
    }

    public static void atNowMembershipType()
    {
        System.out.println("You have " + memberType  + " membership type");
    }
    public static void atNowWallet()
    {
        System.out.println("Your wallet = " + wallet);
    }
}

