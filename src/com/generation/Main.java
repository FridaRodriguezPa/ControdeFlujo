package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        // Estructura de control if
//        if(condicion){
//
//        }else if(){
//
//        }else{
//
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa tu edad:");
//        int edad = sc.nextInt();
//        System.out.println("Cual es tu nombre?");
//        sc.nextLine();
//        String nombre = sc.nextLine();
//
//
//        if (edad > 18){
//            System.out.println("Felicidades " + nombre + " puedes votar");
//        }else{
//            System.out.println("Hola"+ nombre + "Aun no puedes votar");
//        }
//        sc.close();

        //EJERCICIO 1
        //Solicitar al usuario 3 lados del triangulo y determinar si el triangulo es valido
//        System.out.println("Ingresa los lados de un triangulo");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa el primer lado:");
//        int lado1 = sc.nextInt();
//        System.out.println("Ingresa el segundo lado:");
//        sc.nextLine();
//        int lado2 = sc.nextInt();
//        System.out.println("Ingresa el tercer lado:");
//        sc.nextLine();
//        int lado3 = sc.nextInt();
//
//        if( (lado1 + lado2) > lado3 && (lado2 + lado3) > lado1 && (lado1 + lado3) > lado2){
//            System.out.println("Los datos corresponden a un triangulo");
//        }else{
//            System.out.println("Los datos no corresponden a un triangulo");
//        }
//        sc.close();



        //Ejercicio 2
        //Pedir un año al usuario y ver si es bisiesto
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa el año:");
//        int an = sc.nextInt();
//        if(((an % 4 == 0) && (an % 100 !=0)) || (an % 400 ==0)){
//            System.out.println("El "+ an + " es bisiesto");
//        }else{
//            System.out.println("El "+ an + "  no es bisiesto");
//        }
//        sc.close();

        //ESTRUCTURA DE FLUJO
//        switch (condicion){
//            case 1:
//                codigo
//                 break;
//        }

//        Scanner sc = new Scanner(System.in);
//
//
//        System.out.println("Ingresa un numero");
//        int num1 = sc.nextInt();
//        System.out.println("Ingresa otro numero");
//        int num2 = sc.nextInt();
//        // \n salto de linea
//        System.out.println("Ingresa la operacion deseada: \n1)Suma \n2)Resta \n3)Multiplicacion \n4)Division ");
//        int operacion = sc.nextInt();
//        sc.nextLine();
//        //Inicializar el valor
//        float resultado = 0;
//        switch (operacion){
//            case 1:
//                resultado = num1 + num2;
//                break;
//            case 2:
//                resultado = num1 - num2;
//                break;
//            case 3:
//                resultado = num1 * num2;
//                break;
//            case 4:
//                resultado = num1 / num2;
//                break;
//            default:
//                System.out.println("La operacion es invalida");
//        }
//        System.out.println(resultado);

        //EJERCICIO 3
        //Pedir un numero al usuario y dependiendo de la respuesta mostrar un dia de la semana.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número y te digo un día de la semana ");
        int operacion = sc.nextInt();
        sc.nextLine();
        switch (operacion){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");
        }

    }
}
