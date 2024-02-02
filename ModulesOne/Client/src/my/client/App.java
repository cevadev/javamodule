package my.client;

import my.service.spi.AreaService;
import my.shapes.Square;

public class App {
    public static void main(String[] args) {
        System.out.println("The area square is " + AreaService.getArea(new Square()));
    }
}
