package org.example;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5.0);
        Circle circle3 = new Circle(3.5, "blue", true);

        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(4.0, 6.0);
        Rectangle rectangle3 = new Rectangle(2.5, 3.5, "green", false);

        System.out.println("=== Объекты Круга ===");
        System.out.println("Круг 1: " + circle1);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circle1.getArea(), circle1.getPerimeter(), circle1.getDiameter());

        System.out.println("Круг 2: " + circle2);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circle2.getArea(), circle2.getPerimeter(), circle2.getDiameter());

        System.out.println("Круг 3: " + circle3);
        System.out.printf("Площадь: %.2f, Периметр: %.2f, Диаметр: %.2f\n\n",
                circle3.getArea(), circle3.getPerimeter(), circle3.getDiameter());

        System.out.println("=== Объекты Прямоугольника ===");
        System.out.println("Прямоугольник 1: " + rectangle1);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rectangle1.getArea(), rectangle1.getPerimeter());

        System.out.println("Прямоугольник 2: " + rectangle2);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rectangle2.getArea(), rectangle2.getPerimeter());

        System.out.println("Прямоугольник 3: " + rectangle3);
        System.out.printf("Площадь: %.2f, Периметр: %.2f\n\n",
                rectangle3.getArea(), rectangle3.getPerimeter());

        System.out.println("=== Тестирование Setter методов ===");
        circle1.setRadius(2.0);
        circle1.setColor("красный");
        circle1.setFilled(true);

        rectangle1.setWidth(3.0);
        rectangle1.setHeight(5.0);
        rectangle1.setColor("желтый");
        rectangle1.setFilled(true);

        System.out.println("Измененный Круг 1: " + circle1);
        System.out.println("Измененный Прямоугольник 1: " + rectangle1);

        System.out.println("\n=== Тестирование метода printCircle ===");
        circle2.printCircle();
    }
}