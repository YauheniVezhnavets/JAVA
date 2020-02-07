package by.epam.learning.programmingWithClass.task7;

public class TriangleLogic {

     Triangle tr;
    public static double setAb (Triangle tr){
        double ab=Math.hypot(tr.getAx() - tr.getBx(), tr.getAy() - tr.getBy());
        return ab;
    }
    public static double setAc (Triangle tr){
        double ab=Math.hypot(tr.getAx() - tr.getCx(), tr.getAy() - tr.getCy());
        return ab;
    }
    public static double setBc (Triangle tr){
        double ab=Math.hypot(tr.getBx() - tr.getCx(), tr.getBy() - tr.getCy());
        return ab;
    }

    public static double calculatePerimetr(Triangle tr) {
      double p =setAb(tr)+setAc(tr)+setBc(tr);
        return p;
    }
    public static double calculateArea(Triangle tr){
        double halfPerimetr=calculatePerimetr(tr)/2;
       double area=Math.sqrt(halfPerimetr*(halfPerimetr-setAb(tr))* (halfPerimetr-setAc(tr))*(halfPerimetr-setBc(tr)));
       return area;
    }
    public static double calculateXMedianCentr (Triangle tr){
        return (tr.getAx()+tr.getBx()+tr.getCx()/3);
    }
    public static double calculateYMedianCentr (Triangle tr){
        return (tr.getAy()+tr.getBy()+tr.getCy()/3);
    }
}

