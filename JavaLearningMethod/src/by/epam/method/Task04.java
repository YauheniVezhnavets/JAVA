package by.epam.method;
//4. На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
//решена
public class Task04 {
    public static void main(String[] args) {
        double [][] mas={{3,1,4,5},{6,2,8,9}};
        System.out.println("Наибольшее расстояние между двумя точками="+getDistance(mas));
    }
    public static double getDistance(double [] ... array){
        double maxDistance=0;
        for (int i = 0; i < array[0].length ; i++) {
            for(int j = i+1; j < array[0].length ; j++) {
                double t = Math.hypot(array[0][i] - array[0][j], array[1][i] - array[1][j]);
                if (t > maxDistance) {
                    maxDistance = t;
                }
            }
        }

        return maxDistance;
    }
 }

