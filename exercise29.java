public class exercise29 {
    public static principal da = new principal();

    public static void exercise29() {
        int daDecimal1 = 0, daDecimal2 = 0, daDecimal3 = 0, daDecimal4 = 0, daDecimal5;
        java.util.Scanner daScanner = new java.util.Scanner(System.in);
        for (int daK = 1; daK <= 160; daK++) {
            System.out.println("Ingrese voto.");
            daDecimal5 = daScanner.nextInt();
            switch (daDecimal5) {
                case 1:
                    daDecimal1 = daDecimal1 + 1;
                    break;
                case 2:
                    daDecimal2 = daDecimal2 + 1;
                    break;
                case 3:
                    daDecimal3 = daDecimal3 + 1;
                    break;
                case 4:
                    daDecimal4 = daDecimal4 + 1;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
        if (daDecimal1 > daDecimal2 && daDecimal1 > daDecimal3 && daDecimal1 > daDecimal4) {
            daDecimal5 = daDecimal1;
        } else if (daDecimal2 > daDecimal3 && daDecimal2 > daDecimal4) {
            daDecimal5 = daDecimal2;
        } else if (daDecimal3 > daDecimal4) {
            daDecimal5 = daDecimal3;
        } else {
            daDecimal5 = daDecimal4;
        }
        System.out.println("El candidato con más votos es: " + daDecimal5);
    }
}
    
