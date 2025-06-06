public class exercise11 {
    public static principal da = new principal();
    public static void exercise11() {
        da.decimal7 = da.decimal1 + da.decimal2 + da.decimal3 + da.decimal4 + da.decimal5 + da.decimal6;
        da.decimal8 = da.decimal7 / 6;
        if(da.decimal8 > 1000){
        System.out.println("Recibira incentivos.");
        }else{
        System.out.println("No recibira incentivos.");
        }
    }
}
