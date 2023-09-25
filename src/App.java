import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int [] fält1 = {8,4,6,3,9};
        int lang = fält1.length;
        double d = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];
        d = d/5;
        System.out.println(d);

        int [] fält2 = {18,14,16,13,19};
        int sum = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4]+fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        System.out.println(sum);
        double f = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];
        f= f/5;
        System.out.println(f);

        int [] summa = new int [5];
        summa[0] = fält1[0]+fält2[0];
        summa[1] = fält1[1]+fält2[1];
        summa[2] = fält1[2]+fält2[2];
        summa[3] = fält1[3]+fält2[3];
        summa[4] = fält1[4]+fält2[4];

        Scanner tb = new Scanner (System.in);
        int [] fält3 = new int [4];
        System.out.println("Droppa några tal brush");
        fält3[0] = tb.nextInt();
        fält3[1] = tb.nextInt();
        fält3[2] = tb.nextInt();
        fält3[3] = tb.nextInt();
        System.out.println(fält3[0]+fält3[1]+fält3[2]+fält3[3]);
    }
}
