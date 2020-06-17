package Pilas;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo UltimoValorIngresado;
    private int Tam;
    private String Lista="";

    public Pila() {
        this.UltimoValorIngresado = null;
        Tam = 0;
    }
    //Método para saber si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado==null;
    }
    //Método para insertar un nodo en la pila
    public void InsertarNodo(int nodo){
        Nodo NuevoNodo = new Nodo(nodo);
        NuevoNodo.sgte = UltimoValorIngresado;
        UltimoValorIngresado = NuevoNodo;
        Tam++;
    }
    //Método para eliminar nodo de la pila
    public int Eliminar(){
        int auxiliar = UltimoValorIngresado.info;
        UltimoValorIngresado = UltimoValorIngresado.sgte;
        Tam--;
        return auxiliar;
    }
    //Método para eliminar el ultimo elemento agregado
    public int MostrarUltimo(){
        return UltimoValorIngresado.info;
    }
    //Método para saber el tamaño de la pila
    public int Tam(){
        return Tam;
    }
    //Método para vaciar la pila
    public void Vaciar(){
        while(!PilaVacia()){
            Eliminar();
        }
    }
    //Método para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while(recorrido != null){
            Lista += recorrido.info +"\n";
            recorrido = recorrido.sgte;
        }
        JOptionPane.showConfirmDialog(null, Lista);
        Lista="";
    }
}
