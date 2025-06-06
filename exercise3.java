public class exercise3 {
    public static principal da=new principal();
    public static void exercise03() {
       da.decimal4= da.decimal1 * 4;
       da.decimal5 = da.decimal2 * -1; 
       da.decimal6= da.decimal4 + da.decimal5;
       System.out.println("Puntos por respuestas correctas: " + da.decimal4);
       System.out.println("Puntos por respuestas incorrectas: " + da.decimal5); // Mostrar puntos negativos
       System.out.println("Puntos por respuestas en blanco: " + da.decimal6);
       System.out.println("El puntaje final es: " + da.decimal6);
    }
}
