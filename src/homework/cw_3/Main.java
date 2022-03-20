package homework.cw_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
        zooClub.getClub().put(new Person("Sasha"), new ArrayList<Pet>());

        System.out.println(zooClub.getClub());


    }
}
