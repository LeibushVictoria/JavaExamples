package guru.qa;

public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private int maxSpeed;
    private int mileage;
    private int owner;
    private boolean dtp;

    public Car(String brand, String model, int year, String color, int maxSpeed, int mileage, int owner, boolean dtp) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.mileage = mileage;
        this.owner = owner;
        this.dtp = dtp;
    }

    //выводим всю информацию о машинах
    public void showCarsInfo() {
        System.out.println("brand and model : " + brand + " " + model + "\n"
                + "year: " + year + "\n"
                + "color: " + color + "\n"
                + "maxSpeed: " + maxSpeed + "\n"
                + "mileage: " + mileage + "\n"
                + "owner: " + owner + "\n"
                + "dtp: " + dtp + "\n");
    }

    //сравниваем скорость машин
    public void compareSpeed(Car car) {
        int kmh;
        if (this.maxSpeed > car.maxSpeed) {
            kmh = this.maxSpeed - car.maxSpeed;
            System.out.println(this.brand + " " + this.model + " быстрее, чем " + car.brand + " " + car.model + " на " + kmh + " км/ч\n");
        } else if (this.maxSpeed < car.maxSpeed) {
            kmh = car.maxSpeed - this.maxSpeed;
            System.out.println(this.brand + " " + this.model + " медленнее, чем " + car.brand + " " + car.model + " на " + kmh + " км/ч\n");
        } else
            System.out.println("У машин " + this.brand + " " + this.model + " и " + car.brand + " " + car.model + " одинаковая скорость\n");
    }

    //меняем пробег
    public void changeMileage (int km) {
        if (km > 0) {
            mileage += km;
            System.out.println("У машины " + brand + " " + model + " увеличился пробег на " + km + " км.");
            System.out.println("Новый пробег: " + mileage + ".\n");
        } else if (km < 0) {
            int new_mileage = mileage + km;
            if (new_mileage >= 0) {
                mileage += km;
                System.out.println("У машины " + brand + " " + model + " уменьшился пробег на " + Math.abs(km) + " км.");
                System.out.println("Новый пробег: " + mileage + ".\n");
            } else System.out.println("У машины " + brand + " " + model + " невозможно уменьшить пробег.\n");
        }
    }
}
