public class exercise13 {
    public static principal da = new principal();
    public static void exercise13() {
        
     if (da.decimal1 == da.decimal2 && da.decimal2 == da.decimal3) {
        System.out.println("Equilátero.");
        } else if (da.decimal1 != da.decimal2 && da.decimal2 != da.decimal3 && da.decimal1 != da.decimal3) {
        System.out.println("Escaleno.");
        } else {
        System.out.println("Isósceles.");
        }
    }
}

