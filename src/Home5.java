public class Home5 {
    public static void main(String[] args) {
        System.out.println("Введите стороны прямоугольника x и y");
    Rectangle rectangle1 = new Rectangle(Rectangle.printConsol(), Rectangle.printConsol());
    rectangle1.printArea();
    rectangle1.printRectangleKind();
        System.out.println("Для сравнения двух прямоугольников введите стороны другого");
        Rectangle rectangle2 = new Rectangle(Rectangle.printConsol(), Rectangle.printConsol());
        System.out.println(rectangle2.isTheSameRectangle(rectangle1));
        rectangle2.printArea();
        rectangle2.printRectangleKind();
        System.out.println("Теперь введите сторону квадрата");
        Rectangle square = new Rectangle(Rectangle.printConsol());
        square.printArea();
        square.printRectangleKind();
        System.out.println("Сравнения квадрата с прямоугольником");
        System.out.println(square.isTheSameRectangle(rectangle2));

    }


}
