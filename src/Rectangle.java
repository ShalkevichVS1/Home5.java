import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    private double x;
    private double y;


        public Rectangle(double x, double y){
            this.x = x;
            this.y = y;
        }

        public Rectangle(double x){
            this.x = x;
            this.y = x;
        }

        public static double printConsol(){
        Scanner reader = new Scanner(System.in);

        double readerX = reader.nextDouble();
        return readerX;
    }

            public double calculaterArea(){
                double S = x*y;
                return S;
            }

            public void printArea(){
                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                String result = decimalFormat.format(calculaterArea());
                System.out.println("Площядь S = " + result);
            }

            public void printRectangleKind(){
            if(x == y){
                System.out.println("Это квадрат");
            }else {
                System.out.println("Это прямоугольник");
            }
            }

            public boolean isTheSameRectangle (Rectangle rectangle1){
            if (this.x == rectangle1.x && this.y == rectangle1.y){
                return true;
            }else
                return false;
            }


}
