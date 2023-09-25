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
        f= f/2;
        System.out.println(f);
    }
}
