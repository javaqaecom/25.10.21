import java.util.Scanner;

public class javaBasics {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        /*//variables
        /*
        int number = 8;
        int number2 = -950000;
        String name= "hodi" ;
        String sen;
        sen = name +" is my name "+number; //"8"
        System.out.println(sen);
        //hodi is my name
        char ch= 't';
        char ch2= '1';
        ch='@';
        double d1 = 8.8d;
        float f1 = 0.05f;
        long l1= 4789648185354735737L;
        short sh1= 124;
        byte b1= 19;
        boolean bool = true;
        bool =false;
        bool= (1<8);
        System.out.println(bool);
        int x= 13;
        int y= -88;
        double x1=x;
        double d2= 8.9;
        int d3=(int)d2;
        System.out.println(d2);
        System.out.println(d3);
        String s="87";
        d3=Integer.parseInt(s);
        System.out.println(d3);*/
        // if ,else
       /* if (1>1){
            System.out.println("inside the if block");
        }
        else
        {
            System.out.println("on the else");
        }

        int speed;

        speed=scanner.nextInt();
        if (speed>=90 && speed<120){
            System.out.println("warning");
        }
        else if (speed>=120 && speed<=160){
            System.out.println("ticket");
        }
        else if (speed>160){
            System.out.println("say good bye to your car ");
        }
        else {
            System.out.println("yo are a good driver");
        }*/
        //switch
        /*System.out.println("press 1 to print *   3 times");
        System.out.println("press 2 to print @   3 times");
        System.out.println("press 3 to print #   3 times");
        System.out.println("press 4 to print %   3 times");
        System.out.println("press 5 to print !   3 times");
        int input = scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("***");
                break;
            case 2:
                System.out.println("@@@");
                break;
            case 3:
                System.out.println("###");
                break;
            case 4:
                System.out.println("%%%");
                break;
            case 5:
                System.out.println("!!!");
                break;
            default:
                System.out.println("choose wisely");*/

        //loops  for and while
       /* int number=1;
        int x;
        x = scanner.nextInt();

        /*for(int i=1;i<=10;i++){
            System.out.println("please enter a number !!!!!!!");
            number= scanner.nextInt();
            System.out.println((number%2==0?"even":"odd"));
            // if in the old way
            if (number%2==0){
                System.out.println("even");
            }
            else System.out.println("odd");*/
        // תכתוב תוכנית שתקבל מהמשתמש ערך שרם ותדפיס את ה! שלו עי מכפלה של כל המסרים מהקלט עד 1
        //3!=3*2*1
        //120!=120*119*118*117------3*2*1
        /*
        while(x >= 1){
            number = number*(x);
            System.out.println(number);
            x--;
        }

        while(true){
            x= scanner.nextInt();
        }*/

        System.out.println("Capital of Italy is ?");
        System.out.println("1.rome");
        System.out.println("2.london");
        System.out.println("2.new york");
        int answer = scanner.nextInt();
        while (answer!=1){
            System.out.println("Capital of Italy is ?");
            System.out.println("1.rome");
            System.out.println("2.london");
            System.out.println("2.new york");
            answer = scanner.nextInt();
        }
        System.out.println("WOW");




    }

}
