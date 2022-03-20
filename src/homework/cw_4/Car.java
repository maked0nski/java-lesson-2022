package homework.cw_4;

public class Car {
    private String model;
    private double power;
    private int price;
    private int year;
    private Owner owner;

    public Car(String model, int power, int price, int year, Owner owner) {
        this.model = model;
        this.power = power;
        this.price = price;
        this.year = year;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPower() {
        return power;
    }

    public void setPower() {
        this.power = power + power * 0.1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (Double.compare(car.power, power) != 0) return false;
        if (price != car.price) return false;
        if (year != car.year) return false;
        if (!model.equals(car.model)) return false;
        return owner.equals(car.owner);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = model.hashCode();
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + price;
        result = 31 * result + year;
        result = 31 * result + owner.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", price=" + price +
                ", year=" + year +
                ", owner=" + owner +
                '}';
    }

    public void checkExperience() {
        if (this.owner.getDrivingExperience() < 5 & this.owner.getAge() > 25) {
            System.out.println("До підвищення кваліфікації - Car{" +
                    "model='" + model + '\'' +
                    ", owner=" + owner +
                    '}');
            this.owner.setDrivingExperience(1);
            System.out.println("Після підвищення кваліфікації - Car{" +
                    "model='" + model + '\'' +
                    ", owner=" + owner +
                    '}');
        }


    }
}
