import java.text.DecimalFormat;
import java.util.Scanner;

public class Rectangle {
    private double x;
    private double y;
    private static int createdRectangles = 0;
    private final static String RUSSIAN_CLASS_NAME  = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME  = "Rectangle";


        public Rectangle(double x, double y){
            this.x = x;
            this.y = y;
            createdRectangles++;
        }

        public Rectangle(double x){
            this.x = x;
            this.y = x;
            createdRectangles++;
        }


        public static double printConsol(){
        Scanner reader = new Scanner(System.in);

        double readerX = reader.nextDouble();
        return readerX;

    }
    public static boolean printConsol2(){
        Scanner reader = new Scanner(System.in);

        boolean readerB = reader.nextBoolean();
        return readerB;
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
            if (this.x == rectangle1.x && this.y == rectangle1.y || this.x == rectangle1.y && this.y == rectangle1.x){
                return true;
            }else
                return false;
            }

            public static void printRectanglesCount(){
                System.out.println("Всего было создано [" + createdRectangles + "] прямоугольников");

            }

            public static void printClassName(boolean printInRussian ){
            if(printInRussian){
                System.out.println(RUSSIAN_CLASS_NAME);
            }else
                System.out.println(ENGLISH_CLASS_NAME);
            }



}
