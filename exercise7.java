public class exercise7 {
    public static principal da = new principal();
    public static void exercise07() {
        da.decimal2=da.decimal1*1024;
        da.decimal3 = (int)(((double)da.decimal2 / 700) + 1);
        System.out.println("El numero de CD que caben en el disco duro es: " + da.decimal3);
    }
}
