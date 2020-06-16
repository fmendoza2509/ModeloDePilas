package Pilas;
public class Pila {
    int[] VectorPila;
    int cima;
    //Constructor con parametros
    public Pila(int tam) {
        VectorPila = new int[tam];
        setCima(0);
    }
    //Método setter
    public void setCima(int cima) {
        this.cima = cima;
    }
    //Método getter
    public int getCima() {
        return cima;
    }
    //Método para insertar
    public void Insertar(int dato){
        VectorPila[cima]=dato;
        setCima(cima++);
    }
    //Método para eliminar
    public int Eliminar(){
        int eliminar = 0;
        if(getCima()==0){
            System.out.println("La pila esta vacia");
        }else{
            eliminar = VectorPila[cima];
            setCima(cima--);
        }
        return eliminar;
    }
    //Método para saber si esta vacia la pila
    public boolean Vacia(){
        if(getCima()==0){
            return true;
        }else{
            return false;
        }
    }
    //Método para retornar el tamaño
    public int Tamano(){
        return VectorPila.length;
    }
}
