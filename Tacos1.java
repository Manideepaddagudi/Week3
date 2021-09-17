import java.util.Scanner;

public class Tacos1
{
    public void Tacodeli()
    {
        Scanner scn=new Scanner(System.in);
        int price1 = 5;
        System.out.println("Enter quantity : ");
        TacoDetails. quantity = scn.nextInt();
        TacoDetails.totalPrice += TacoDetails.quantity * price1;
        TacoDetails.totalAmt[0]++;
    }
}
