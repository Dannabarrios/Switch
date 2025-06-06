public class exercise9 {
    public static principal da = new principal();
    public static void exercise09() {
        da.decimal3 = da.decimal2 - da.decimal1;
        if (da.decimal3 >17) {
        System.out.println("Debe solicitar su CUIL.");
        } else {
        System.out.println("No debe solicitar su CUIL aun.");
        }
    }
}
