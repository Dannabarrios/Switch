public class exercise27 {
    public static principal da = new principal();
    public static void exercise27() {
       switch (da.caracter) {
                    case "+":
                        da.decimal3 = da.decimal1 + da.decimal2;
                        System.out.println("La suma es: " + da.decimal3);
                        break;
                    case "-":
                        da.decimal3 = da.decimal1 - da.decimal2;
                        System.out.println("La resta es: " + da.decimal3);
                        break;
                    case "*":
                        da.decimal3 = da.decimal1 * da.decimal2;
                        System.out.println("La multiplicación es: " + da.decimal3);
                        break;
                    case "/":
                        da.decimal3 = da.decimal1 / da.decimal2;
                        System.out.println("La división es: " + da.decimal3);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                }
    }
}
