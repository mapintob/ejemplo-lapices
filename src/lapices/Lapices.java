
package lapices;

public class Lapices {

    public static void main(String[] args) {
        Lapiz lapiz_rojo = new Lapiz("rojo",10,"cuadrado","HB");
        Lapiz lapiz_azul = new Lapiz("azul",10,"redondo","2B");
        
        System.out.println("imprimir los datos del lapiz - color: "+lapiz_rojo.getColor()+ " ,tamaño: "+lapiz_rojo.getLargo());
        lapiz_rojo.pintar();
        lapiz_azul.rayar();
    }    
}

class Lapiz {
    private String color;
    private int largo;
    private String forma;
    private String trazo;

//constructor
    public Lapiz(String color, int largo, String forma, String trazo) {
        this.color = color;
        this.largo = largo;
        this.forma = forma;
        this.trazo = trazo;
    }    
// getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getTrazo() {
        return trazo;
    }

    public void setTrazo(String trazo) {
        this.trazo = trazo;
    }
    
//funciones del lapiz
    
    void rayar(){
        System.out.println("Rayar con el trazo: "+this.trazo+" y color: "+this.color);
    }
    
    void pintar(){
        System.out.println("Pintar con el color: "+this.color);
    }
}
