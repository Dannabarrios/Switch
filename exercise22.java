public class exercise22 {
    public static principal da = new principal();

    public static void exercise22() {
         da.decimal3=0;
                for (int K = 1; K <= da.decimal2; K++) {
                    da.decimal4 = da.teclado.nextInt();
                    da.decimal3 = da.decimal3 + da.decimal4;
                }
                System.out.println("La suma es: " + da.decimal3);
    }
}
