package Pilas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenidos a la Pila");
        System.out.println("Ingrese el tamaño de la pila");
        int Tamano = leer.nextInt();
        int dato,op;
        dato = op = 0;
        Pila a = new Pila(Tamano);
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("Escoja una de las siguientes opciones");
            System.out.println("(1) Para ingresar dato");
            System.out.println("(2) Para eliminar el dato");
            System.out.println("(3) Para Saber si está vacia");
            System.out.println("(4) Tamaño de pila");
            System.out.println("(5) Para salir\n");
            op = leer.nextInt();
            switch(op){
                case 1:
                    System.out.println("Inserte el dato");
                    a.Insertar(dato=leer.nextInt());
                    System.out.println("Dato insertado");
                    break;
                case 2:
                    a.Eliminar();
                    break;
                case 3:
                    if(a.Vacia()==true){
                        System.out.println("La pila esta vacia");
                    }else{
                        System.out.println("La pila esta llena");
                    }
                    break;
                case 4:
                    System.out.println(a.Tamano());
                    break;
            }
        } while (true);
        
    }
}
