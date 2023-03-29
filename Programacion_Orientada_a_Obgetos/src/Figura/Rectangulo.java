package Figura;

public class Rectangulo extends Figura {

    private float base;
    private float altura;

    //metodo constructor
    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
   
    
    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    public void calculararea() {
        float area=0;
        area=base*altura;
        System.out.println("el area de su rectangulo es: "+area);
    }
    
    
}
 