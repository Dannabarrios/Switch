public class exercise20 {
    public static principal da = new principal();
    public static void exercise20() {
        for (int K = 1; K <= da.var1; K++) {
            System.out.println("Ingrese sueldo del empleado " + K + ":");
            double sueldo = da.teclado.nextDouble();
            da.var3 = da.var3 + sueldo;
        }
        da.var4 = da.var3 / da.var1;
        System.out.println("El promedio de sueldos es: " + da.var4);
    }
}
