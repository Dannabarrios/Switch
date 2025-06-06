public class exercise17 {
    public static principal da = new principal();
    public static void exercise17() {
         da.decimal2= da.decimal1 / 10;
        da.decimal3=da.decimal1-(da.decimal2*10);
        da.decimal4=da.decimal2;
        da.decimal5=da.decimal3;
        System.out.println("numero de decenas"+da.decimal4);
        System.out.println("numero de unidades"+da.decimal5);
    }
}
