package Figura;

public class Circulo extends Figura {

    private float radio;

    public Circulo (float radio ){
        this.radio=radio;
    }
   
    public float getradio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }
   

    public void calculararea( float radio) {
        float pi= (float) 3.1416;
        float area=0;
        area=(pi*(radio*radio));
        System.out.println("El radio es"+radio+"\n, pi es"+pi+"\n, el area es"+area);

    }

    @Override
    public void calculararea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculararea'");
    }

    }


 