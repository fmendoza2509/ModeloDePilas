package Pilas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int op =0, nodo = 0;
        Pila pila = new Pila();
        do{
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(null, 
                        "Menú de opciones\n\n"+"1. Para insertar un nodo\n"+
                        "2. Eliminar un nodo\n"+"3. ¿La pila esta vacia?\n"+
                        "4. ¿Cuál es el último valor ingresado a la pila?\n"+
                        "5. ¿cuantos nodos tiene la pila?\n"+"6. Vaciar la pila\n"+
                        "7. Mostrar contenido de la pila\n"+
                        "8. Salir\n\n"));
                switch(op){
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Ingrese el valor del nodo"));
                        pila.InsertarNodo(nodo);
                        break;
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showConfirmDialog(null, "Se ha eliminado un nodo con el valor: "
                            + pila.Eliminar());
                        }else{
                            JOptionPane.showConfirmDialog(null, "La pila está vacia");
                        }
                        break;
                    case 3:
                        if(!pila.PilaVacia()){
                            JOptionPane.showConfirmDialog(null, "La pila contiene elementos");
                        }else{
                            JOptionPane.showConfirmDialog(null, "La pila está vacia");
                        }
                        break;
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showConfirmDialog(null, "El último valor ingresado de la pila es: "
                            + pila.MostrarUltimo());
                        }else{
                            JOptionPane.showConfirmDialog(null, "La pila está vacia");
                        }
                        break;
                    case 5:
                        JOptionPane.showConfirmDialog(null, "La pila contiene: "+pila.Tam()+" nodos.");
                        break;
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.Vaciar();
                            JOptionPane.showConfirmDialog(null, "Se ha vaciado completamente la pila");
                        }else{
                            JOptionPane.showConfirmDialog(null, "La pila está vacia");
                        }
                        break;
                    case 7:
                        pila.MostrarValores();
                        break;
                    case 8:
                        op=8;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Esta opcion es incorrecta vuelva a intentarlo");
                        break;
                }          
            } catch (NumberFormatException e) {
            }
    
        }while(op !=8);
    }
}
