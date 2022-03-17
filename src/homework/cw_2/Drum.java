package homework.cw_2;

public class Drum implements Instrument {

    int size;

    public Drum() {
    }

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Drum drum = (Drum) o;

        return size == drum.size;
    }

    @Override
    public int hashCode() {
        return size;
    }

    @Override
    public String toString() {
        return "Играет инструмент Drum с характеристиками: {" +
                "size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println("Бам-Бам");
    }
}
