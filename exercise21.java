public class exercise21 {
    public static principal da = new principal();
    public static void exercise21() {
        for (int K = 1; K <= 200; K++) {
                    System.out.println("Ingrese la edad de la persona:");
                    da.decimal3 = da.teclado.nextInt();

                    if (da.decimal3 >= 18) {
                        da.decimal1= da.decimal1 + 1;
                    } else {
                        da.decimal2= da.decimal2 + 1;
                    } }
                    System.out.println("El total de personas mayores de edad es: " + da.decimal1);
                    System.out.println("El total de personas menores de edad es: " + da.decimal2);
    }
}
