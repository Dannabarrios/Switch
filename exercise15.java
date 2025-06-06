public class exercise15 {
    public static principal da = new principal();
    public static void exercise15() {
        if (da.decimal1 >= 0 && da.decimal1 < 1000) {
                    da.decimal2 = (0 * da.decimal1) / 100;
                } else if (da.decimal1 >= 1000 && da.decimal1 < 5000) {
                    da.decimal2 = (3 * da.decimal1) / 100;
                } else if (da.decimal1 >= 5000 && da.decimal1 < 20000) {
                    da.decimal2 = (5 * da.decimal1) / 100;
                } else if (da.decimal1 >= 20000) {
                    da.decimal2 = (8 * da.decimal1) / 100;
                } else {
                    da.decimal2 = 0;
                }
                System.out.println("Total de bonificacion: " + da.decimal2);
    }
}
