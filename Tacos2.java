import java.util.Scanner;

public class Tacos2 {
    public void Tio_Luis_Tacos()
    {
        Scanner scn=new Scanner(System.in);
        int price2 = 6;
        System.out.println("Enter quantity : ");
        TacoDetails .quantity = scn.nextInt();
        TacoDetails .totalPrice += TacoDetails .quantity * price2;
        TacoDetails .totalAmt[1]++;
    }
}
