import java.util.Scanner;

public class Tacos3 {
    public void PincheTacos()
    {
        Scanner scn=new Scanner(System.in);
        int price3 = 7;
        System.out.println("Enter quantity : ");
        TacoDetails.quantity = scn.nextInt();
        TacoDetails.totalPrice += TacoDetails.quantity * price3;
        TacoDetails.totalAmt[2]++;
    }
}
