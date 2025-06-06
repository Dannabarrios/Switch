public class exercise23 {
    public static principal da = new principal();
    public static void exercise23() {
        for (int K = 1; K <= 10; K++) {
                da.decimal1 = K * 2;
                da.decimal2= K -(da.decimal1*2);

                if (da.decimal2 == 0) {
                    System.out.println(K);
                    continue;
                } else {
                    System.out.println("El numero es impar.");
                }
              }
    }
}
