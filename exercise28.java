public class exercise28 {
    public static principal da = new principal();

    public static void exercise28() {
       for (int K = 1; K <= 10; K++) {
                    System.out.println("Ingrese letra:");
                    String decimal = da.teclado.next();
                    switch (decimal.toUpperCase()) {
                        case "A":
                        case "a":
                            da.decimal1 = da.decimal1 + 1;
                            break;
                        case "E":
                        case "e":
                            da.decimal2 = da.decimal2 + 1;
                            break;
                        case "I":
                        case "i":
                            da.decimal1 = da.decimal1 + 1;
                            break;
                        case "O":
                        case "o":
                            da.decimal2 = da.decimal2 + 1;
                            break;
                        case "U":
                        case "u":
                            da.decimal1 = da.decimal1 + 1;
                            break;
                        default:
                            System.out.println("Letra no válida.");
                    }
                }
            }
        }
    
    

    

