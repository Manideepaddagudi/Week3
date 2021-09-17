import java.util.Scanner;

public class Tacos4 {
    public void LuckeyTacos()
    {
        Scanner scn=new Scanner(System.in);
        int price4 = 8;
        System.out.println("Enter quantity : ");
        TacoDetails. quantity = scn.nextInt();
        TacoDetails.totalPrice += TacoDetails.quantity * price4;
        TacoDetails.totalAmt[3]++;
    }
}