package ru.javacode;

import ru.javacode.figures.Circle;
import ru.javacode.figures.Figure;
import ru.javacode.figures.Square;
import ru.javacode.figures.Triangle;
import ru.javacode.printer.FigureCharacteristicPrinter;
import ru.javacode.printer.FigureCharacteristicPrinterImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FigureCharacteristicPrinter printer = new FigureCharacteristicPrinterImpl();

        Triangle triangle = new Triangle(4, 5, 6);
        Square square = new Square(5);
        Circle circle = new Circle(5);

        List<Figure> figures = new ArrayList<>();
        figures.add(triangle);
        figures.add(square);
        figures.add(circle);
        figures.forEach(f -> {
            printer.printArea(f.getArea(), f.getClass());
            printer.printArea(f.getPerimeter(), f.getClass());
        });
    }
}