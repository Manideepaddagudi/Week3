public class calcAmt {
    public void totalAmt()
    {
        System.out.println("YOUR TOTAL BILL");
        System.out.println("-----------------------");
        System.out.println("TYPE"+"    "+"PRICE PER UNIT");
        System.out.println("----------------------");
        for(int i=0;i<TacoDetails.totalAmt.length;i++)
        {
            if(TacoDetails.totalAmt[i]>0)
            {
                System.out.println(TacoDetails.name[i]+"    "+TacoDetails.price[i]+"    ");
            }
        }
        System.out.println("GRAND TOTAL"+TacoDetails.totalPrice);
    }
}
