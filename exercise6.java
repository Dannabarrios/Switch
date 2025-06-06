public class exercise6 {
    public static principal da = new principal();
    public static void exercise06() {
       da.decimal4=(da.decimal1+da.decimal2+da.decimal3)/2;
        da.decimal5=(da.decimal4*(da.decimal4-da.decimal1)*(da.decimal4-da.decimal2)*(da.decimal4-da.decimal3));
        System.out.println("El area del triangulo es: " + da.decimal5);
    }
}
