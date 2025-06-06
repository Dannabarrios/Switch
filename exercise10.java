public class exercise10 {
    public static principal da = new principal();
    public static void exercise10() {
        if (da.decimal1 > da.decimal2) {
        da.decimal3 = da.decimal1 - da.decimal2;
        System.out.println("El primer hermano es el mayor por: " + da.decimal3);
        } else {
        da.decimal3 = da.decimal2 - da.decimal1;
        System.out.println("El segundo hermano es el mayor por: " + da.decimal3);
        }
    }
}
