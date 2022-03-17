package homework.cw_2;

public class Guitar implements Instrument {

    int string;

    public Guitar() {
    }

    public Guitar(int string) {
        this.string = string;
    }

    public int getString() {
        return string;
    }

    public void setString(int string) {
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return string == guitar.string;
    }

    @Override
    public int hashCode() {
        return string;
    }

    @Override
    public String toString() {
        return "Играет инструмент Guitar с характеристиками: {" +
                "string=" + string +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Бринь-Бринь");
    }
}
