package herenciafigura;

public class Rectangulo extends  Figura{
    private double baseRec;
    private double alturaRec;
    private double areaRec;

    public Rectangulo (String nombre, double baseRec, double alturaRec){
        this.nombre = nombre;
        this.baseRec = baseRec;
        this.alturaRec =alturaRec;
    }

    public double getBaseRec() {
        return baseRec;
    }

    public void setBaseRec(double baseRec) {
        this.baseRec = baseRec;
    }

    public double getAlturaRec() {
        return alturaRec;
    }

    public void setAlturaRec(double alturaRec) {
        this.alturaRec = alturaRec;
    }

    public double getAreaRec() {
        return areaRec;
    }

    public void setAreaRec(double areaRec) {
        this.areaRec = areaRec;
    }
    public  double calculaAreaRec (){
        areaRec = baseRec *alturaRec;
        return areaRec;
    }
}
