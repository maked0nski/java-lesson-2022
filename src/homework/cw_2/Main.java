package homework.cw_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guitar guitar1 = new Guitar();
        guitar1.string= 6;

        Guitar guitar2 = new Guitar();
        guitar2.string= 7;

        Drum drum1 = new Drum();
        drum1.size = 50;

        Drum drum2 = new Drum();
        drum2.size = 80;

        Trumpet trumpet1 = new Trumpet();
        trumpet1.diameter = 40;

        Trumpet trumpet2 = new Trumpet();
        trumpet2.diameter = 65;



        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar1);
        instruments.add(guitar2);
        instruments.add(drum1);
        instruments.add(drum2);
        instruments.add(trumpet1);
        instruments.add(trumpet2);


        instruments.forEach(instrument -> {
            instrument.play();
            System.out.println(instrument);

        });
    }
}
