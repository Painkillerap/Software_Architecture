public class App {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(7, "Окружность_1");
        Circle circle2 = new Circle(3, "Окружность_2");
        Triangle triangle1 = new Triangle(7, 5, 7, "Треугольник_1");
        Triangle triangle2 = new Triangle(3, 3, 3, "Треугольник_2");
        Rectangle rectangle1 = new Rectangle(4, 8, "Прямоугольник_1");
        Rectangle rectangle2 = new Rectangle(3, 3, "Квадрат");
        
        figureBox.add(circle1);
        figureBox.add(circle2);
        figureBox.add(triangle1);
        figureBox.add(triangle2);
        figureBox.add(rectangle1);
        figureBox.add(rectangle2);

        figureBox.getInfo(0);
        figureBox.getInfo(1);
        figureBox.getInfo(2);
        figureBox.getInfo(3);
        figureBox.getInfo(4);
        figureBox.getInfo(5);
        figureBox.getInfo(6);

        figureBox.search(circle2);
        figureBox.search(rectangle1);

        figureBox.remove(6);
        figureBox.remove(5);

        figureBox.search(rectangle2);

    }
}