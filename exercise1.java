
import java.util.Scanner;

public class exercise1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal1 = 0, decimal2 = 0, decimal3 = 0, decimal4 = 0 ,decimal5 = 0, decimal6 = 0, decimal7 = 0,decimal8 = 0;
        double var1=0, var2=0,  var3=0, var4=0, var5=0, var6=0;

        System.out.print("Digite un numero de (1 al 30): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
            {
                System.out.print("Ingrese la velocidad (m/s): ");
                decimal1 = scanner.nextInt();
    
                System.out.print("Ingrese el tiempo (s): ");
                decimal2 = scanner.nextInt();
    
                decimal3 = decimal1 * decimal2;
                System.out.println("La distancia es: " + decimal3 + " metros.");
                break;
            }
    
            case 2:
            {
                    
                System.out.print("Ingrese la primera nota parcial (N1): ");
                decimal1 = scanner.nextInt();

                System.out.print("Ingrese la segunda nota parcial (N2): ");
                 decimal2= scanner.nextInt();

                System.out.print("Ingrese la tercera nota parcial (N3): ");
                decimal3= scanner.nextInt();

                decimal4= (decimal1 + decimal2 + decimal3) / 3;
                System.out.println("El promedio simple es: " + decimal4);
                break;
            }

            case 3:
            {
                System.out.println("Ingrese el número de respuestas correctas:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese el número de respuestas incorrectas:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese el número de respuestas en blanco:");
                decimal3= scanner.nextInt();

                 decimal4= decimal1 * 4;
                 decimal5 = decimal2 * -1; 
                 decimal6= decimal4 + decimal5;
                

                System.out.println("Puntos por respuestas correctas: " + decimal4);
                System.out.println("Puntos por respuestas incorrectas: " + decimal5); // Mostrar puntos negativos
                System.out.println("Puntos por respuestas en blanco: " + decimal6);
                System.out.println("El puntaje final es: " + decimal6);
                break;
            }
            case 4:
            {
                System.out.println("Ingrese los partidos ganados:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese los partidos empatados:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese los partidos perdidos:");
                decimal3 = scanner.nextInt();

                decimal4=decimal1*3;
                decimal5=decimal2*1;
                decimal6=decimal4+decimal5;
                System.out.println("Puntaje final: " + decimal6);
                break;
            }
            case 5:
            {
                System.out.println("Ingrese el numero de horas laboradas en el mes:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese la tarifa por hora:");
                decimal2 = scanner.nextInt();

                decimal3=decimal1*decimal2;
                System.out.println("La planilla es: " + decimal3);
                break;
            }
            case 6:
            {
                System.out.println("Ingrese longitud del lado A:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese longitud del lado B:"); 
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese longitud del lado C:");
                decimal3 = scanner.nextInt();

                decimal4=(decimal1+decimal2+decimal3)/2;
                decimal5=(decimal4*(decimal4-decimal1)*(decimal4-decimal2)*(decimal4-decimal3));
                System.out.println("El area del triangulo es: " + decimal5);
                break;
            }
            case 7:
            {
                System.out.println("Ingrese el numero de Gygabyte del disco duro :");
                decimal1 = scanner.nextInt();

                decimal2=decimal1*1024;
                decimal3 = (int)(((double)decimal2 / 700) + 1);
                System.out.println("El numero de CD que caben en el disco duro es: " + decimal3);
                break;
            }
            case 8:
            {
                System.out.println("Ingrese abcisa A :");
                var1 = scanner.nextInt();

                System.out.println("Ingrese abcisa B :");
                var2 = scanner.nextInt();

                System.out.println("Ingrese ordenada A:");
                var3 = scanner.nextInt();

                System.out.println("Ingrese ordenada B:");
                var4 = scanner.nextInt();

                var5 = Math.sqrt(Math.pow(var2 - var1, 2) + Math.pow(decimal4 - decimal3, 2));
                System.out.println("La distancia entre los puntos A y B es: " + var5);
                break;
            }
            case 9:
            {
                System.out.println("Ingrese año de nacimiento:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese año actual:");
                decimal2 = scanner.nextInt();

                decimal3 = decimal2 - decimal1;
                if (decimal3 >17) {
                    System.out.println("Debe solicitar su CUIL.");
                } else {
                    System.out.println("No debe solicitar su CUIL aun.");
                }
                break;
            }
            case 10:
            {
                System.out.println("Ingrese la edad del primer hermano:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese la edad del segundo hermano:");
                decimal2 = scanner.nextInt();

                if (decimal1 > decimal2) {
                    decimal3 = decimal1 - decimal2;
                    System.out.println("El primer hermano es el mayor por: " + decimal3);
                } else {
                    decimal3 = decimal2 - decimal1;
                    System.out.println("El segundo hermano es el mayor por: " + decimal3);
                }
                break;
            }
            case 11:
            {
                System.out.println("Ingrese produccion del dia lunes:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese produccion del dia martes:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese produccion del dia miercoles:");
                decimal3 = scanner.nextInt();

                System.out.println("Ingrese produccion del dia jueves:");
                decimal4 = scanner.nextInt();

                System.out.println("Ingrese produccion del dia viernes:");
                decimal5 = scanner.nextInt();

                System.out.println("Ingrese produccion del dia sabado:");
                decimal6 = scanner.nextInt();

                decimal7 = decimal1 + decimal2 + decimal3 + decimal4 + decimal5 + decimal6;
                decimal8 = decimal7 / 6;

                if(decimal8 > 1000){
                    System.out.println("Recibira incentivos.");
                }else{
                    System.out.println("No recibira incentivos.");
                }
                break;
            }
            case 12:
            {
                System.out.println("Ingrese primer numero entero:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese segundo numero entero:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese tercer numero entero:");
                decimal3 = scanner.nextInt();

                if (decimal1 > decimal2 && decimal1 > decimal3) {
                    System.out.println("El mayor es: " + decimal1);
                } else if (decimal2 > decimal3) {
                    System.out.println("El mayor es: " + decimal2);
                } else {
                    System.out.println("El mayor es: " + decimal3);
                }
                break;
            }
            case 13:
            {
                System.out.println("Ingrese primer lado:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese segundo lado:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese tercer lado:");
                decimal3 = scanner.nextInt();

                if (decimal1 == decimal2 && decimal2 == decimal3) {
                    System.out.println("Equilátero.");
                } else if (decimal1 != decimal2 && decimal2 != decimal3 && decimal1 != decimal3) {
                    System.out.println("Escaleno.");
                } else {
                    System.out.println("Isósceles.");
                }
                break;
            }
            case 14:
            {
                System.out.println("Ingrese un numero entero del (1 al 10):");
                decimal1 = scanner.nextInt();

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
                break;
            }
            case 15:
            {
                System.out.println("Ingrese monto de venta:");
                decimal1 = scanner.nextInt();

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
                break;
            }
            case 16:
            {
                System.out.println("Ingrese un numero entero del (1 al 5):");
                decimal1 = scanner.nextInt();

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
                        System.out.println("0");
                        break;
                    case 5:
                        System.out.println("U");
                        break;
                    default:
                        System.out.println("Número fuera de rango.");
                }
                break;
            }
            case 17:
            {
                System.out.println("Ingrese un numero entero de dos digitos:");
                decimal1 = scanner.nextInt();

                decimal2= decimal1 / 10;
                decimal3=decimal1-(decimal2*10);
                decimal4=decimal2;
                decimal5=decimal3;

                System.out.println("numero de decenas"+decimal4);
                System.out.println("numero de unidades"+decimal5);
                break;
            }
            case 18:
            {
                System.out.println("Ingrese un numero entero:");
                decimal1 = scanner.nextInt();

                decimal2=decimal1/2;
                decimal3=decimal1-(decimal2*2);

                if (decimal3== 0) {
                    System.out.println("El numero es par.");
                } else {
                    System.out.println("El numero es impar.");
                }
                break;
            }
            case 19:
            {
                decimal1=2;
                System.out.println("Ingrse un numero:");

            for (int i = 1; i <= 4; i++) {
                decimal1 = decimal1 + 2;
                System.out.println(decimal1);
            }
            break;
            }
            case 20:
            {
                System.out.println("Ingrese numero de empleados:");
                var1 = scanner.nextInt();
                var2 = 0;
                for (int K = 1; K <= decimal1; K++) {
                    System.out.println("Ingrese sueldo del empleado " + K + ":");
                    var1 = scanner.nextInt();
                    var3 = var3 + var1;
                }
                var4 =decimal3 / decimal1;
                System.out.println("El promedio de notas es: " + var4);
                break;
            }
            case 21:
            {
                decimal1 = 0;
                decimal2 = 0;

                for (int K = 1; K <= 200; K++) {
                    System.out.println("Ingrese la edad de la persona:");
                    decimal3 = scanner.nextInt();

                    if (decimal3 >= 18) {
                        decimal1= decimal1 + 1;
                    } else {
                        decimal2= decimal2 + 1;
                    } }
                    System.out.println("El total de personas mayores de edad es: " + decimal1);
                    System.out.println("El total de personas menores de edad es: " + decimal2);
                    break;
            }
            case 22:
            {
                System.out.println("Ingrese primer numero:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese segundo numero:");
                decimal2 = scanner.nextInt();

                decimal3=0;
                for (int K = 1; K <= decimal2; K++) {
                    decimal4 = scanner.nextInt();
                    decimal3 = decimal3 + decimal4;
                }
                System.out.println("La suma es: " + decimal3);
                break;
            }
            case 23:
            {
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
                break;
            }
            case 24:
            {
                while (decimal1<1000){
                    System.out.println("decimal1");
                    decimal1=(decimal1^2)+1;
                }
                break;
            }
            case 25:
            {
               String estado = "V";
               String letra;
               while(estado.equals("V")){
                System.out.println("Ingrese una letra");
                letra = scanner.next();

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
               break;
            }
            case 26:
            {
                decimal1 = 0;
                decimal2=2;
                decimal3=decimal1+decimal2;
                while (decimal3<1000){
                    System.out.println(decimal3);
                    decimal1=decimal2;
                    decimal2=decimal3;
                    decimal3=decimal1+decimal2;
                }
                break;
            }
            case 27:
            {
                System.out.println("Ingrese primer numero:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese segundo numero:");
                decimal2 = scanner.nextInt();

                System.out.println("Ingrese caracter:");
                String caracter = scanner.next();

                switch (caracter) {
                    case "+":
                        decimal3 = decimal1 + decimal2;
                        System.out.println("La suma es: " + decimal3);
                        break;
                    case "-":
                        decimal3 = decimal1 - decimal2;
                        System.out.println("La resta es: " + decimal3);
                        break;
                    case "*":
                        decimal3 = decimal1 * decimal2;
                        System.out.println("La multiplicación es: " + decimal3);
                        break;
                    case "/":
                        decimal3 = decimal1 / decimal2;
                        System.out.println("La división es: " + decimal3);
                        break;
                    default:
                        System.out.println("Operación no válida.");
                }
                break;
            }
            case 28:
            {
                decimal1 = 0;
                decimal2 = 0;

                for (int K = 1; K <= 10; K++) {
                    System.out.println("Ingrese letra:");
                    String decimal = scanner.next();
                    switch (decimal.toUpperCase()) {
                        case "A":
                        case "a":
                            decimal1 = decimal1 + 1;
                            break;
                        case "E":
                        case "e":
                            decimal2 = decimal2 + 1;
                            break;
                        case "I":
                        case "i":
                            decimal1 = decimal1 + 1;
                            break;
                        case "O":
                        case "o":
                            decimal2 = decimal2 + 1;
                            break;
                        case "U":
                        case "u":
                            decimal1 = decimal1 + 1;
                            break;
                        default:
                            System.out.println("Letra no válida.");
                    }

                }
                
            }
            case 29:
            {
                decimal1 = 0;
                decimal2 = 0;
                decimal3 = 0;
                decimal4 = 0;

                for (int K = 1; K <= 160; K++) {
                    System.out.println("Ingrese voto");
                    decimal5 = scanner.nextInt();
                    switch (decimal5) {
                        case 1:
                            decimal1 = decimal1 + 1;
                            break;
                        case 2:
                            decimal2 = decimal2 + 1;
                            break;
                        case 3:
                            decimal3 = decimal3 + 1;
                            break;
                        case 4:
                            decimal4 = decimal4 + 1;
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                }
                if (decimal1 > decimal2 && decimal1 > decimal3 && decimal1 > decimal4) {
                    decimal5 = decimal1;
                } else if (decimal2 > decimal3 && decimal2 > decimal4) {
                    decimal5 = decimal2;
                } else if (decimal3 > decimal4) {
                    decimal5 = decimal3;
                } else {
                    decimal5 = decimal4;
                }
                System.out.println("El candidato con más votos es: " + decimal5);
            }
            case 30:
            {
                System.out.println("Ingrese el primer numero:");
                decimal1 = scanner.nextInt();

                System.out.println("Ingrese el segundo numero:");   
                decimal2 = scanner.nextInt();

                decimal3=(decimal1+decimal2)/2;
                System.out.println("El promedio es: " + decimal3);
                break;
            }
            case 31:
            {
                System.out.println("Ingrese un número del 1 al 12:");
                decimal1= scanner.nextInt();
                String nombreMes;
                switch (decimal1) {
                    case 1:
                        nombreMes = "Enero";
                        break;
                    case 2:
                        nombreMes = "Febrero";
                        break;
                    case 3:
                        nombreMes = "Marzo";
                        break;
                    case 4:
                        nombreMes = "Abril";
                        break;
                    case 5:
                        nombreMes = "Mayo";
                        break;
                    case 6:
                        nombreMes = "Junio";
                        break;
                    case 7:
                        nombreMes = "Julio";
                        break;
                    case 8:
                        nombreMes = "Agosto";
                        break;
                    case 9:
                        nombreMes = "Septiembre";
                        break;
                    case 10:
                        nombreMes = "Octubre";
                        break;
                    case 11:
                        nombreMes = "Noviembre";
                        break;
                    case 12:
                        nombreMes = "Diciembre";
                        break;
                    default:
                        nombreMes = "Número de mes inválido";
                        break;
                }
                System.out.println("El mes es: " + nombreMes);
                break;
            }
            case 32:
            {
                System.out.println("Ingrese un número entero diferente de cero:");
                decimal1 = scanner.nextInt();

                if (decimal1 == 0) {
                    System.out.println("El número no puede ser cero.");
                } else {
                    System.out.println("Los divisores de " + decimal1 + " son:");
                    for (int i = 1; i <= Math.abs(decimal1); i++) {
                        if (decimal1 % i == 0) {
                            System.out.println(i);
                        }
                    }
                }
                break;
            }
         default:
                System.out.println("Opción incorrecta.");
                break;
        }
        scanner.close();
    }        
}   

        

