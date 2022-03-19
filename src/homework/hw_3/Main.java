package homework.hw_3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("toyota", 2021, 250);

        Skill skill1 = new Skill("java", 10);

        ArrayList<Skill> skills1 = new ArrayList<>();

        skills1.add(new Skill("java", 10));
        skills1.add(new Skill("js", 5));
        skills1.add(new Skill("c++", 15));

        User userPupkin = new User(1,
                "Vasyl",
                "pupkin",
                "asd@asd.com",
                31,
                "MALE",
                skills1,
                new Car("toyota", 2021, 250)
        );

        userPupkin.getSkills().add(new Skill("node", 10));

        User userKokos = new User(2,
                "Jura",
                "Kokos",
                "asv@asd.com",
                30,
                "MALE",
                skills1,
                new Car("toyota", 2020, 200)
        );

        User userKotov = new User(3,
                "Max",
                "Kotov",
                "afv@asd.com",
                25,
                "MALE",
                skills1,
                new Car("volvo", 2024, 500)
        );

        User userMorozova = new User(4,
                "Olia",
                "Morozova",
                "morozova@asd.com",
                19,
                "FEMALE",
                skills1,
                new Car("Lada", 1995, 10)
        );

        User userKoksova = new User(5,
                "Ira",
                "Koksova",
                "Koksova@asd.com",
                28,
                "FEMALE",
                skills1,
                new Car("Opel", 2012, 300)
        );

        User userSovor = new User(6,
                "Andrey",
                "Sovor",
                "Sovor@asd.com",
                45,
                "MALE",
                skills1,
                new Car("Audi", 2022, 400)
        );

        User userMohov = new User(7,
                "Viktor",
                "Mohov",
                "Mohov@asd.com",
                20,
                "MALE",
                skills1,
                new Car("Vaz", 2000, 200)
        );

        User userBarova = new User(8,
                "Inna",
                "Barova",
                "Barova@asd.com",
                25,
                "FEMALE",
                skills1,
                new Car("Sitroen", 2020, 200)
        );

        User userKrotova = new User(9,
                "Sasha",
                "Krotova",
                "Krotova@asd.com",
                31,
                "FEMALE",
                skills1,
                new Car("reno", 2018, 200)
        );

        User userSmehova = new User(10,
                "Vira",
                "Smehova",
                "Smehova@asd.com",
                45,
                "FEMALE",
                skills1,
                new Car("Peugeot", 2020, 200)
        );

        HashSet<User> usersHashSet = new HashSet<>();
        usersHashSet.add(userPupkin);
        usersHashSet.add(userKokos);
        usersHashSet.add(userKotov);
        usersHashSet.add(userMorozova);
        usersHashSet.add(userKoksova);
        usersHashSet.add(userSovor);
        usersHashSet.add(userMohov);
        usersHashSet.add(userBarova);
        usersHashSet.add(userKrotova);
        usersHashSet.add(userSmehova);


        Iterator<User> userIterator = usersHashSet.iterator();
        while (userIterator.hasNext()){
            User user = userIterator.next();
            if (user.getGender().equals("MALE")){
//                System.out.println(user);
                userIterator.remove();
            }
        }
        System.out.println(usersHashSet);



//        TreeSet<User> usersTreeSet = new TreeSet<>();
//        usersTreeSet.add(userPupkin);
//        usersTreeSet.add(userKokos);
//        usersTreeSet.add(userKotov);
//        usersTreeSet.add(userMorozova);
//        usersTreeSet.add(userKoksova);
//        usersTreeSet.add(userSovor);
//        usersTreeSet.add(userMohov);
//        usersTreeSet.add(userBarova);
//        usersTreeSet.add(userKrotova);
//        usersTreeSet.add(userSmehova);

    }

}
