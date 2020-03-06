package Procesos;

import java.util.*;
//esta puede ser la manufactura definitiva
public class Manufactura {

 public static int Azucar = 600;
 public static int Colorante = 600;
 public static int Almidon = 600;

 public static ArrayList<Dulce> Deposito_caramelos = new ArrayList<Dulce>();
 public static ArrayList<Dulce> Deposito_chocolate = new ArrayList<Dulce>();
 public static ArrayList<Dulce> Deposito_gomitas = new ArrayList<Dulce>();

 public static void CrearDulce(String tipo) {

     if (Azucar < 30 || Almidon < 30 || Colorante < 30) {
         Secretaria.llamarProveedor();
         if (tipo.equals("chocolate")) {
             for (int i = 0; i < 50; i++) {
                 Deposito_chocolate.add(new Dulce("chocolate"));
                 Azucar = -6;
                 Almidon = -4;
             }
         }
         if (tipo.equals("caramelo")) {
             for (int i = 0; i < 50; i++) {
                 Deposito_caramelos.add(new Dulce("caramelo"));
                 Colorante = -5;
                 Azucar = -7;
                 Almidon = -3;
             }
         }
         if (tipo.equals("gomitas")) {
             for (int i = 0; i < 50; i++) {
                 Deposito_gomitas.add(new Dulce("gomitas"));
                 Colorante = -4;
                 Azucar = -7;
                 Almidon = -3;
             }
         }

     } else {
         if (tipo.equals("chocolate")) {
             for (int i = 0; i < 50; i++) {
                 if (Azucar > 6 && Almidon > 4) {
                     Deposito_chocolate.add(new Dulce("chocolate"));
                     Azucar = -6;
                     Almidon = -4;
                 } else {
                     Secretaria.llamarProveedor();
                     Deposito_chocolate.add(new Dulce("chocolate"));
                     Azucar = -6;
                     Almidon = -4;
                 }
             }
         }
         if (tipo.equals("caramelo")) {
             for (int i = 0; i < 50; i++) {
                 if (Colorante > 5 && Azucar > 7 && Almidon > 3) {
                     Deposito_caramelos.add(new Dulce("caramelo"));
                     Colorante = -5;
                     Azucar = -7;
                     Almidon = -3;
                 } 
                 else {
                     Secretaria.llamarProveedor();
                     Deposito_caramelos.add(new Dulce("caramelo"));
                     Colorante = -5;
                     Azucar = -7;
                     Almidon = -3;
                 }
             }
         }
         if (tipo.equals("gomitas")) {
             for (int i = 0; i < 50; i++) {
                 if (Colorante > 4 && Azucar > 7 && Almidon > 3) {
                     Deposito_gomitas.add(new Dulce("gomitas"));
                     Colorante = -4;
                     Azucar = -7;
                     Almidon = -3;
                 } else {
                     Secretaria.llamarProveedor();
                     Deposito_gomitas.add(new Dulce("gomitas"));
                     Colorante = -4;
                     Azucar = -7;
                     Almidon = -3;
                 }
             }
         }
     }
 }
}
