import java.util.Scanner;

class TacoDetails {

    public static int totalPrice;
    String type;
    public static int quantity=0;
    static int totalAmt[]=new int[4];
    static int price[]={5,6,7,8};
    static String name[]={"Tacodeli","Chicago: Tio Luis Tacos","Denver: Pinche Tacos","Lucky Taco"};

    public  void details()
    {
        Scanner scn=new Scanner(System.in);
        int choice=0;

        do {
            System.out.println("press 1 for : Tacodeli");
            System.out.println("press 2 for : Chicago: Tio Luis Tacos");
            System.out.println("press 3 for : Denver: Pinche Tacos");
            System.out.println("press 4 for : Lucky Taco");
            System.out.println("press 5 for : total");
            System.out.println("press 6 to exit");
            System.out.println("Please Enter your choice : ");
            choice=scn.nextInt();
            switch (choice) {
                case 1:
                    Tacos1 obj=new Tacos1();
                    obj.Tacodeli();
                    break;

                case 2:
                    Tacos2 obj1=new Tacos2();
                    obj1.Tio_Luis_Tacos();
                    break;
                case 3:
                    Tacos3 obj2=new Tacos3();
                    obj2.PincheTacos();
                    break;
                case 4:
                    Tacos4 obj3=new Tacos4();
                    obj3.LuckeyTacos();
                    break;
                case 5:
                    /*calculate amount*/
                    calcAmt obj4=new calcAmt();
                    obj4.totalAmt();
                    break;
            }
        }while(choice!=6);
    }
}