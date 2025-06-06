public class exercise12 {
    public static principal da = new principal();
    public static void exercise12() {
         if (da.decimal1 > da.decimal2 && da.decimal1 > da.decimal3) {
        System.out.println("El mayor es: " + da.decimal1);
        } else if (da.decimal2 > da.decimal3) {
        System.out.println("El mayor es: " + da.decimal2);
        } else {
        System.out.println("El mayor es: " + da.decimal3);
        }
    }
}
