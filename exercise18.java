public class exercise18 {
    public static principal da = new principal();
    public static void exercise18() {
         da.decimal2=da.decimal1/2;
        da.decimal3=da.decimal1-(da.decimal2*2);

        if (da.decimal3== 0) {
        System.out.println("El numero es par.");
        } else {
        System.out.println("El numero es impar.");
        }
    }
}
