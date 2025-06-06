import java.util.Scanner;

public class principal {

    static Scanner teclado = new Scanner(System.in);
     

    public static int decimal1 = 0, decimal2 = 0, decimal3 = 0, decimal4 = 0,
                      decimal5 = 0, decimal6 = 0, decimal7 = 0, decimal8 = 0;
    public static double var1 = 0, var2 = 0, var3 = 0, var4 = 0, var5 = 0, var6 = 0;
    public static String estado, letra,caracter;

    public static void main(String[] args) {
        principal da = new principal();

        
        System.out.print("Digite un numero de (1 al 30): ");
        int opcion = teclado.nextInt(); 

        switch (opcion) {
            case 1: {
                Datos.Uno();
                exercise1.exercise01();
                break;
            }

            case 2: {
                Datos.Dos();
                exercise2.exercise02();
                break;
            }

            case 3: {
                Datos.Tres();
                exercise3.exercise03();
                break;
            }

            case 4: {
                Datos.Cuatro();
                exercise4.exercise04();
                break;
            }

            case 5: {
                Datos.Cinco();
                exercise5.exercise05();
                break;
            }

            case 6: {
                 Datos.Seis();
                exercise6.exercise06();
                break;
            }

            case 7: {
                Datos.Siete();
                exercise7.exercise07();
                break;
            }

            case 8: {
                Datos.Ocho();
                exercise8.exercise08();
                break;
            }

            case 9:{
               Datos.Nueve();
               exercise9.exercise09();
                break;
            }

            case 10:{
                Datos.Diez();
                exercise10.exercise10();
                break;
            }

            case 11:{
                Datos.Once();
                exercise11.exercise11();
                break;
            }

            case 12:{
                Datos.Doce();
                exercise12.exercise12();
                break;
            }

            case 13:{
                Datos.Trece();
                exercise13.exercise13();
                break;
            }

            case 14:{
               Datos.Catorce();
                exercise14.exercise14();
                break;
            }

            case 15:{
                Datos.Quince();
                exercise15.exercise15();
                break;
            }

            case 16:{
                Datos.Dieciseis();
                exercise16.exercise16();
                break;
            }

            case 17:{
                Datos.Diecisiete();
                exercise17.exercise17();
                break;
            }
                
            case 18:{
                Datos.Dieciseis();
                exercise18.exercise18();
                break;
            }

            case 19:{
                Datos.Diecinueve();
                exercise19.exercise19();
                break;
            }

            case 20:{
                Datos.Veinte();
                exercise20.exercise20();
                break;
            }

            case 21:{
                Datos.Veintiuno();
                exercise21.exercise21();
                break;
            }

            case 22:{
                Datos.Veintidos();
                exercise22.exercise22();
                break;
            }

            case 23:{
               Datos.Veintitres();
                exercise23.exercise23();
                break;
            }

            case 24:{
                Datos.Veinticuatro();
                exercise24.exercise24();
                break;
            }

            case 25:{
               Datos.Veinticinco();
                exercise25.exercise25();
                break;
            }
            
            case 26:{
                Datos.Veintiseis();
                exercise26.exercise26();
                break;
            }

            case 27:{
                Datos.Veintisiete();
                exercise27.exercise27();
                break;
            }

            case 28:{
                Datos.Veintiocho();
                exercise28.exercise28();
                break;
            }

            case 29:{
                Datos.Veintinueve();
                exercise29.exercise29();
                break;
            }

            case 30:{
                Datos.Treinta();
                exercise30.exercise30();
                break;
            }

            default:
                System.out.println("Número no válido.");
                break;
        }

        teclado.close();
    }

    public static void ejercicio1(int decimal1, int decimal2, int decimal3) {
        decimal3 = decimal1 * decimal2;
        System.out.println("La distancia recorrida es: " + decimal3 + " metros");
    }

    public static void ejercicio2(int decimal1, int decimal2, int decimal3, int decimal4) {
        decimal4 = (decimal1 + decimal2 + decimal3) / 3;
        System.out.println("El promedio simple es: " + decimal4);
    }

    public static void ejercicio3 (int decimal1, int decimal2, int decimal3, int decimal4, int decimal5, int decimal6) {
       decimal4= decimal1 * 4;
       decimal5 = decimal2 * -1; 
       decimal6= decimal4 + decimal5;
       System.out.println("Puntos por respuestas correctas: " + decimal4);
       System.out.println("Puntos por respuestas incorrectas: " + decimal5); // Mostrar puntos negativos
       System.out.println("Puntos por respuestas en blanco: " + decimal6);
       System.out.println("El puntaje final es: " + decimal6);
    }

    public static void ejercicio4(int decimal1, int decimal2, int decimal3, int decimal4, int decimal5, int decimal6) {
        decimal4=decimal1*3;
        decimal5=decimal2*1;
        decimal6=decimal4+decimal5;
        System.out.println("Puntaje final: " + decimal6);
    }

    public static void ejercicio5(int decimal1, int decimal2, int decimal3) {
        decimal3=decimal1*decimal2;
        System.out.println("La planilla es: " + decimal3);
    }
    

    public static void ejercicio6(int decimal1,int decimal2,int decimal3,int decimal4,int decimal5){
        decimal4=(decimal1+decimal2+decimal3)/2;
        decimal5=(decimal4*(decimal4-decimal1)*(decimal4-decimal2)*(decimal4-decimal3));
        System.out.println("El area del triangulo es: " + decimal5);
    }

    public static void ejercicio7(int decimal1, int decimal2, int decimal3) {
        decimal2=decimal1*1024;
        decimal3 = (int)(((double)decimal2 / 700) + 1);
        System.out.println("El numero de CD que caben en el disco duro es: " + decimal3);
    }

    public static void ejercicio8(double var1,double var2,double var3,double var4,double var5) {
        var5 = Math.sqrt(Math.pow(var2 - var1, 2) + Math.pow(decimal4 - decimal3, 2));
        System.out.println("La distancia entre los puntos A y B es: " + var5);
    }

    public static void ejercicio9(int decimal1,int decimal2,int decimal3){
         decimal3 = decimal2 - decimal1;
        if (decimal3 >17) {
        System.out.println("Debe solicitar su CUIL.");
        } else {
        System.out.println("No debe solicitar su CUIL aun.");
        }
    }

    public static void ejercicio10(int decimal1,int decimal2,int decimal3){
        if (decimal1 > decimal2) {
        decimal3 = decimal1 - decimal2;
        System.out.println("El primer hermano es el mayor por: " + decimal3);
        } else {
        decimal3 = decimal2 - decimal1;
        System.out.println("El segundo hermano es el mayor por: " + decimal3);
        }
    }

    public static void ejercicio11 (int decimal1,int decimal2,int decimal3,int decimal4,int decimal5,int decimal6,int decimal7,int decimal8){
        decimal7 = decimal1 + decimal2 + decimal3 + decimal4 + decimal5 + decimal6;
        decimal8 = decimal7 / 6;
        if(decimal8 > 1000){
        System.out.println("Recibira incentivos.");
        }else{
        System.out.println("No recibira incentivos.");
        }
    }

    public static void ejercicio12 (int decimal1,int decimal2,int decimal3){
        if (decimal1 > decimal2 && decimal1 > decimal3) {
        System.out.println("El mayor es: " + decimal1);
        } else if (decimal2 > decimal3) {
        System.out.println("El mayor es: " + decimal2);
        } else {
        System.out.println("El mayor es: " + decimal3);
        }
    }

    public static void ejercicio13(int decimal1,int deciaml2,int decimal3){
        if (decimal1 == decimal2 && decimal2 == decimal3) {
        System.out.println("Equilátero.");
        } else if (decimal1 != decimal2 && decimal2 != decimal3 && decimal1 != decimal3) {
        System.out.println("Escaleno.");
        } else {
        System.out.println("Isósceles.");
        }
    }

    public static void ejercicio14(int decimal1){
        switch (decimal1) {
                    case 1:
                        System.out.println("II");
                        break;
                    case 2:
                        System.out.println("II");
                        break;
                    case 3:
                        System.out.println("III");
                        break;
                    case 4:
                        System.out.println("IV");
                        break;
                    case 5:
                        System.out.println("V");
                        break;
                    case 6:
                        System.out.println("VI");
                        break;
                    case 7:
                        System.out.println("VII");
                        break;
                    case 8:
                        System.out.println("VIII");
                        break;
                    case 9:
                        System.out.println("IX");
                        break;
                    case 10:
                        System.out.println("X");
                        break;
                    default:
                        System.out.println("Número fuera de rango.");
        }

    }

    public static void ejercicio15(int decimal1,int decimal2){
        if (decimal1 >= 0 && decimal1 < 1000) {
                    decimal2 = (0 * decimal1) / 100;
                } else if (decimal1 >= 1000 && decimal1 < 5000) {
                    decimal2 = (3 * decimal1) / 100;
                } else if (decimal1 >= 5000 && decimal1 < 20000) {
                    decimal2 = (5 * decimal1) / 100;
                } else if (decimal1 >= 20000) {
                    decimal2 = (8 * decimal1) / 100;
                } else {
                    decimal2 = 0;
                }
                System.out.println("Total de bonificacion: " + decimal2);
    }

    public static void ejercicio16(int decimal1){
        switch (decimal1) {
                    case 1:
                        System.out.println("A");
                        break;
                    case 2:
                        System.out.println("E");
                        break;
                    case 3:
                        System.out.println("I");
                        break;
                    case 4:
                        System.out.println("O");
                        break;
                    case 5:
                        System.out.println("U");
                        break;
                    default:
                        System.out.println("Número fuera de rango.");
                }
                
            }
    public static void ejercicio17(int decimal1,int decimal2,int decimal3,int decimal4,int decimal5){
        decimal2= decimal1 / 10;
        decimal3=decimal1-(decimal2*10);
        decimal4=decimal2;
        decimal5=decimal3;
        System.out.println("numero de decenas"+decimal4);
        System.out.println("numero de unidades"+decimal5);
    }

    public static void ejercicio18(int decimal1,int decimal2,int decimal3){
        decimal2=decimal1/2;
        decimal3=decimal1-(decimal2*2);

        if (decimal3== 0) {
        System.out.println("El numero es par.");
        } else {
        System.out.println("El numero es impar.");
        }
    }

    public static void ejercicio19(int decimal1){
        for (int i = 1; i <= 4; i++) {
                decimal1 = decimal1 + 2;
                System.out.println(decimal1);
            }
    }

    public static void ejercicio20(double var1, double var2, double var3, double var4, Scanner teclado) {
        for (int K = 1; K <= var1; K++) {
            System.out.println("Ingrese sueldo del empleado " + K + ":");
            double sueldo = teclado.nextDouble();
            var3 = var3 + sueldo;
        }
        var4 = var3 / var1;
        System.out.println("El promedio de sueldos es: " + var4);
    }

    public static void ejercicio21(int decimal1, int decimal2, int decimal3, Scanner teclado) {
         for (int K = 1; K <= 200; K++) {
                    System.out.println("Ingrese la edad de la persona:");
                    decimal3 = teclado.nextInt();

                    if (decimal3 >= 18) {
                        decimal1= decimal1 + 1;
                    } else {
                        decimal2= decimal2 + 1;
                    } }
                    System.out.println("El total de personas mayores de edad es: " + decimal1);
                    System.out.println("El total de personas menores de edad es: " + decimal2);
    }

    public static void ejercicio22(int decimal1, int decimal2, int decimal3, int decimal4,Scanner teclado) {
                decimal3=0;
                for (int K = 1; K <= decimal2; K++) {
                    decimal4 = teclado.nextInt();
                    decimal3 = decimal3 + decimal4;
                }
                System.out.println("La suma es: " + decimal3);
    }

    public static void ejercicio23(int decimal1, int decimal2) {
         for (int K = 1; K <= 10; K++) {
                decimal1 = K * 2;
                decimal2= K -(decimal1*2);

                if (decimal2 == 0) {
                    System.out.println(K);
                    continue;
                } else {
                    System.out.println("El numero es impar.");
                }
              }
    }

    public static void ejercicio24(int decimal1){
        while (decimal1<1000){
                    System.out.println("decimal1");
                    decimal1=(decimal1^2)+1;
                }
    }

    public static void ejercicio25(String estado, String letra) {
                estado = "V";
                System.out.println(estado);
        switch (letra.toUpperCase()) {
                    case "A":
                        estado = "R";
                        System.out.println(estado);
                        break;
                    case "E":
                        System.out.println("R");
                        estado = "R";
                        break;
                    case "I":
                        System.out.println("R");
                        estado = "R";
                        break;
                    case "O":
                        System.out.println("R");
                        estado = "R";
                        break;
                    case "U":
                        System.out.println("R");
                        estado = "R";
                        break;
                    default:
                        System.out.println("V");
                        break;
                }
    }

    public static void ejercicio26(){

    }

    public static void ejercicio27(){

    }

    public static void ejercicio28(){

    }

    public static void ejercicio29(){

    }

    public static void ejercicio30(){

    }
}


