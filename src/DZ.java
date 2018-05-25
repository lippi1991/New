public class DZ {
    public static void main (String [] args){
        System.out.println("Task #1");
    int a1 =2;
    int b1=5;
    int c1=10;
        System.out.println(a1+b1*c1/2);
        System.out.println("Task #2");
    int a2=1;
    int b2=3;
    int c2=2;
        System.out.println((Math.pow(a2,c2)+Math.pow(b2,c2))/2);
        System.out.println("Task #3");
    double a3=7;
    double b3=6;
    double c3=8;
        System.out.println((a3+b3)/12*c3%4+b3);
        System.out.println("Task #4");
    double a4=12;
    double b4=9;
    double c4=11;
        System.out.println((a4-b4*c4)/(a4+b4)%c4);
        System.out.println("Task 5");
    int a5=2,b5=3,c5=4;
        System.out.println(Math.abs(a5-b5)/Math.pow((a5+b5),3)-Math.cos(c5));
        System.out.println ("Task 6");
    double a6=12,b6=15;
        System.out.println(("Гипотенуза=")+Math.sqrt(Math.pow(a6,2)+Math.pow(b6,2)));
    double c6=19.209372712298546;
        System.out.println(("Sтреугольника=")+((a6*b6)/2));
        System.out.println(("Pтреугольника=")+(a6+b6+c6));
        System.out.println("Task 7");
    int x1=3,y1=1;
    int x2=-3,y2=-1;
        System.out.println(("ширина прямоугольника=")+(Math.abs(y1)+Math.abs(y2)));
        System.out.println(("длина прямоугольника=")+(Math.abs(x1)+Math.abs(x2)));
        System.out.println(("Pпрямоугольника=")+(Math.abs(y1)+Math.abs(y2)+Math.abs(x1)+Math.abs(x2))*2);
        System.out.println(("Sпрямоугольника=")+ (Math.abs(y1)+Math.abs(y2))*(Math.abs(x1)+Math.abs(x2)));
        System.out.println ("Task 8");
    double a8=5,b8=6;
    double a8Lb8=30;
        System.out.println(("a8Lb8Radians=")+(Math.toRadians(a8Lb8)));
        System.out.println(Math.cos(Math.toRadians(a8Lb8)));
        System.out.println(("с8=")+Math.sqrt(Math.pow(a8,2)+Math.pow(b8,2)-2*a8*b8*Math.cos(Math.toRadians(a8Lb8))));
    double c8=3.0064057897984564;
        System.out.println(("PТреугольника=")+(a8+b8+c8));
    double P=14.006405789798457;
        System.out.println(("Sтреугольника по формуле Герона=")+((P/2*(P/2-a8)*(P/2-b8)*(P/2-c8))/2));
        System.out.println ("Task 10  результат1=" + Task1(a1,b1,c1));
        System.out.println ("Task 10  результат2=" +Task2(a2, b2, c2));
        System.out.println ("Task 10  результат3=" +Task3(a3, b3, c3));
        System.out.println ("Task 10  результат4=" +Task4(a4, b4, c4));
        System.out.println ("Task 10  результат5=" +Task5(a5, b5, c5));
        System.out.println ("Task 11  результат6S=" +Task6(a6, b6, c6));
        System.out.println ("Task 11  результат6P=" +Task6_1(a6, b6, c6));
        System.out.println ("Task 11  результат7P=" +Task7(x1, x2, y2,y1));
        System.out.println ("Task 11  результат7S=" +Task7_1(x1, x2, y2,y1));
        System.out.println ("Task 11  результатc8=" +Task8(a8,b8,a8Lb8));
        System.out.println ("Task 11  результатP=" +Task8_1(a8,b8,c8));
        System.out.println ("Task 11  результатS=" +Task8_2(a8,b8,c8,P));
        System.out.println ("Task 12");
        double UAH=1000;
        double USD=50;
        double kurs1=27.3;
        double kurs2=26.5;
        System.out.println ("Task 12  USD за 1000 UAH="+Task12(UAH, kurs1));
        System.out.println ("Task 12  UAH за 50 USD="+Task12_1(USD, kurs2));
        System.out.println ("Task 13");
        int day=11;
        int month =9;
        int year =24;
        System.out.println ("Task 13 количество дней="+Task13(day,month,year));
        System.out.println ("Task 14");
        int kill=527;
        System.out.println ("Task 14 всего километров="+Task14(kill));







}
    public static int Task1(int a1, int b1, int c1) {
        int IO = a1 + b1 * c1 / 2;
        return IO;

    }
    public static double Task2(double a2,double b2,double c2){
     double I02=(Math.pow(a2,c2)+Math.pow(b2,c2))/2;
     return I02;

    }
public static double Task3 (double a3, double b3, double c3){
        double IO3=(a3+b3)/12*c3%4+b3;
        return IO3;

}
public static double Task4 (double a4, double b4, double c4){
        double IO4=(a4-b4*c4)/(a4+b4)%c4;
        return IO4;

}
public static double Task5 (double a5, double b5, double c5){
        double IO5=(Math.abs(a5-b5)/Math.pow((a5+b5),3)-Math.cos(c5));
        return IO5;

}
public static double Task6 (double a6, double b6, double c6){
        double IO6=(a6*b6)/2;
        return  IO6;

}
    public static double Task6_1 (double a6, double b6, double c6){
        double IO6_1=a6+b6+c6;
        return IO6_1;
    }
    public static double Task7 (int x1, int x2, int y2, int y1){
        int IO7=(Math.abs(y1)+Math.abs(y2)+Math.abs(x1)+Math.abs(x2))*2;
        return IO7;

    }
    public static double Task7_1 (int x1, int x2, int y2, int y1){
        int IO7_1=(Math.abs(y1)+Math.abs(y2))*(Math.abs(x1)+Math.abs(x2));
        return IO7_1;

    }
    public static double Task8 (double a8, double b8, double a8Lb8){
        double IO8=Math.sqrt(Math.pow(a8,2)+Math.pow(b8,2)-2*a8*b8*Math.cos(Math.toRadians(a8Lb8)));
        return IO8;
    }
    public static double Task8_1(double a8, double b8, double c8){
        double IO8_1=a8+b8+c8;
        return IO8_1;
    }
    public static double Task8_2(double a8, double b8, double c8, double P){
        double IO8_2=((P/2*(P/2-a8)*(P/2-b8)*(P/2-c8))/2);
        return IO8_2;
    }
public static double Task12(double UAH, double kurs1){
        double Obmen_USD=UAH/kurs1;
        return Obmen_USD;
}
public static double Task12_1(double USD, double kurs2){
        double Obmen_UAH=USD*kurs2;
        return Obmen_UAH;

}
public static int Task13 (int day, int month, int year){
        int koldney=(year-1)*420+(month-1)*42+day;
        return koldney;
}
public static int Task14 (int kill){
       int first =kill/100;
       int second =kill/10;
       int second2=second - first*10;
       int third= kill%10;
       int vsego = first+second2+third;
       return vsego;
}
}

