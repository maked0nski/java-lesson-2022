package homework.cw_2;

public class Trumpet implements Instrument {
    int diameter;

    public Trumpet() {
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {

        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trumpet trumpet = (Trumpet) o;

        return diameter == trumpet.diameter;
    }

    @Override
    public String toString() {
        return "Играет инструмент Trumpet с характеристиками: {" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public int hashCode() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Ду-Ду-Ду");
    }
}
