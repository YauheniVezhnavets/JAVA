package by.epam.learning.programmingWithClass.task7;

public class Triangle {
    private double ax;
    private double ay;
    private double bx;
    private double by;
    private double cx;
    private double cy;



    public Triangle (double ax, double ay, double bx, double by, double cx, double cy){
        super();
        this.ax=ax;
        this.ay=ay;
        this.bx=bx;
        this.by=by;
        this.cx=cx;
        this.cy=cy;
    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }
    public double getAy (){
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public double getBx() {
        return bx;
    }
    public void setBx (double bx){
        this.bx=bx;
    }

    public double getBy() {
        return by;
    }

    public void setBy(double by) {
        this.by = by;
    }
    public double getCx(){
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }
}
