package guru.qa;

public class Main {
    public static void main(String[] args) {

        Car kia_Rio = new Car("Kia", "Rio", 2018, "white", 170, 60000, 1, false);
        Car bmw_x5 = new Car("BMW", "X5", 2019, "black", 270, 20000,1, false);
        Car audi_a4 = new Car("Audi", "A4", 2016, "blue", 250, 167000, 2, true);
        Car mazda_cx5 = new Car("Mazda", "CX5", 2021, "grey", 220, 0, 0, false);
        Car ford_Focus = new Car("Ford", "Focus", 2015, "white", 170, 150000, 3, true);

        Car[] cars = new Car[5];
        cars[0] = kia_Rio;
        cars[1] = bmw_x5;
        cars[2] = audi_a4;
        cars[3] = mazda_cx5;
        cars[4] = ford_Focus;

        //выводим всю информацию о машинах
        for (Car car : cars) {
            car.showCarsInfo();
        }

        //сравниваем скорость машин
        kia_Rio.compareSpeed(ford_Focus);
        bmw_x5.compareSpeed(audi_a4);
        mazda_cx5.compareSpeed(bmw_x5);

        //меняем пробег
        bmw_x5.changeMileage(1000);
        audi_a4.changeMileage(-500);
        mazda_cx5.changeMileage(-100);
    }
}
