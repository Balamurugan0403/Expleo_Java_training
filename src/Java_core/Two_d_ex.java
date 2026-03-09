package Java_core;
import java.util.Scanner;

public class Two_d_ex {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] arr = {
                {"A","B","A","A","B"},
                {"A","A","B","A","A"},
                {"A","A","B","B","A"},
                {"A","B","B","A","A"}
        };

        int vip = 0, premium = 0, regular = 0;
        int vipB = 0, premiumB = 0, regularB = 0;

        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr[i].length; j++) {

                if(arr[i][j].equalsIgnoreCase("A")) {

                    if(i == 0)
                        vip++;
                    else if(i == 1 || i == 2)
                        premium++;
                    else if(i == 3)
                        regular++;

                } else {

                    if(i == 0)
                        vipB++;
                    else if(i == 1 || i == 2)
                        premiumB++;
                    else if(i == 3)
                        regularB++;
                }
            }
        }

        System.out.println("VIP seats Total:" + (vip+vipB) +
                " Available:" + vip + " Booked:" + vipB);

        System.out.println("Premium seats Total:" + (premium+premiumB) +
                " Available:" + premium + " Booked:" + premiumB);

        System.out.println("Regular seats Total:" + (regular+regularB) +
                " Available:" + regular + " Booked:" + regularB);

    }
}