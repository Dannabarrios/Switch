public class exercise25 {
    public static principal da = new principal();

    public static void exercise25() {
        da.estado = "V";
                System.out.println(da.estado);
        switch (da.letra.toUpperCase()) {
                    case "A":
                        da.estado = "R";
                        System.out.println(da.estado);
                        break;
                    case "E":
                        System.out.println("R");
                        da.estado = "R";
                        break;
                    case "I":
                        System.out.println("R");
                        da.estado = "R";
                        break;
                    case "O":
                        System.out.println("R");
                        da.estado = "R";
                        break;
                    case "U":
                        System.out.println("R");
                        da.estado = "R";
                        break;
                    default:
                        System.out.println("V");
        }
    }
}
    
        

