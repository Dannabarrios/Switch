public class exercise26 {
    public static principal da = new principal();
    public static void exercise26() {
        while (da.decimal3<1000){
                    System.out.println(da.decimal3);
                    da.decimal1=da.decimal2;
                    da.decimal2=da.decimal3;
                    da.decimal3=da.decimal1+da.decimal2;
                }
    }
}
