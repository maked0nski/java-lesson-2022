package homework.hw_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("toyota", 2021, 250);

        ArrayList<Object> skillsList1 = new ArrayList<>();
        skillsList1.add(new Skill("java", 10));
        skillsList1.add(new Skill("js", 5));
        skillsList1.add(new Skill("c++", 15));

        ArrayList<Object> skillsList2 = new ArrayList<>();
        skillsList2.add(new Skill("java", 10));
        skillsList2.add(new Skill("js", 5));
        skillsList2.add(new Skill("c++", 15));
        skillsList2.add(new Skill("python", 15));

        ArrayList<Object> skillsList3 = new ArrayList<>();
        skillsList3.add(new Skill("java", 10));
        skillsList3.add(new Skill("js", 5));
        skillsList3.add(new Skill("c++", 15));

        ArrayList<Object> skillsList4 = new ArrayList<>();
        skillsList4.add(new Skill("java", 10));
        skillsList4.add(new Skill("js", 5));
        skillsList4.add(new Skill("c++", 15));
        skillsList4.add(new Skill("python", 15));
        skillsList4.add(new Skill("node", 9));

        ArrayList<Object> skillsList5 = new ArrayList<>();
        skillsList5.add(new Skill("java", 10));
        skillsList5.add(new Skill("js", 5));
        skillsList5.add(new Skill("c++", 15));

        ArrayList<Object> skillsList6 = new ArrayList<>();
        skillsList6.add(new Skill("java", 10));
        skillsList6.add(new Skill("js", 5));
        skillsList6.add(new Skill("c++", 15));
        skillsList6.add(new Skill("python", 15));
        skillsList6.add(new Skill("node", 9));

        ArrayList<Object> skillsList7 = new ArrayList<>();
        skillsList7.add(new Skill("java", 10));
        skillsList7.add(new Skill("js", 5));
        skillsList7.add(new Skill("c++", 15));
        skillsList7.add(new Skill("python", 15));
        skillsList7.add(new Skill("node", 9));
        skillsList7.add(new Skill("SQL", 7));


        ArrayList<Object> skillsList8 = new ArrayList<>();
        skillsList8.add(new Skill("java", 10));
        skillsList8.add(new Skill("js", 5));
        skillsList8.add(new Skill("c++", 15));
        skillsList8.add(new Skill("python", 15));
        skillsList8.add(new Skill("node", 9));
        skillsList8.add(new Skill("SQL", 7));


        ArrayList<Object> skillsList9 = new ArrayList<>();
        skillsList9.add(new Skill("java", 10));
        skillsList9.add(new Skill("c++", 15));
        skillsList9.add(new Skill("node", 9));
        skillsList9.add(new Skill("SQL", 7));


        ArrayList<Object> skillsList10 = new ArrayList<>();
        skillsList10.add(new Skill("java", 10));
        skillsList10.add(new Skill("js", 5));
        skillsList10.add(new Skill("c++", 15));
        skillsList10.add(new Skill("python", 15));
        skillsList10.add(new Skill("SQL", 7));


//        Skill[] skillsList1 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList2 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15), new Skill("python", 15)};
//        Skill[] skillsList3 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList4 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15), new Skill("python", 15), new Skill("node", 9)};
//        Skill[] skillsList5 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList6 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList7 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15), new Skill("python", 15), new Skill("node", 9), new Skill("SQL", 9)};
//        Skill[] skillsList8 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList9 = new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15)};
//        Skill[] skillsList10 =new Skill[]{new Skill("java", 10), new Skill("js", 5), new Skill("c++", 15), new Skill("python", 15), new Skill("node", 9)};



        User userPupkin = new User(1,
                "Vasyl",
                "pupkin",
                "asd@asd.com",
                31,
                "MALE",
                skillsList1,
                new Car("toyota", 2021, 250)
        );

        User userKokos = new User(2,
                "Jura",
                "Kokos",
                "asv@asd.com",
                30,
                "MALE",
                skillsList2,
                new Car("toyota", 2020, 200)
        );

        User userKotov = new User(3,
                "Max",
                "Kotov",
                "afv@asd.com",
                25,
                "MALE",
                skillsList3,
                new Car("volvo", 2024, 500)
        );

        User userMorozova = new User(4,
                "Olia",
                "Morozova",
                "morozova@asd.com",
                19,
                "FEMALE",
                skillsList4,
                new Car("Lada", 1995, 10)
        );

        User userKoksova = new User(5,
                "Ira",
                "Koksova",
                "Koksova@asd.com",
                28,
                "FEMALE",
                skillsList5,
                new Car("Opel", 2012, 300)
        );

        User userSovor = new User(6,
                "Andrey",
                "Sovor",
                "Sovor@asd.com",
                45,
                "MALE",
                skillsList6,
                new Car("Audi", 2022, 400)
        );

        User userMohov = new User(7,
                "Viktor",
                "Mohov",
                "Mohov@asd.com",
                20,
                "MALE",
                skillsList7,
                new Car("Vaz", 2000, 200)
        );

        User userBarova = new User(8,
                "Inna",
                "Barova",
                "Barova@asd.com",
                25,
                "FEMALE",
                skillsList8,
                new Car("Sitroen", 2020, 200)
        );

        User userKrotova = new User(9,
                "Sasha",
                "Krotova",
                "Krotova@asd.com",
                31,
                "FEMALE",
                skillsList9,
                new Car("reno", 2018, 200)
        );

        User userSmehova = new User(10,
                "Vira",
                "Smehova",
                "Smehova@asd.com",
                45,
                "FEMALE",
                skillsList10,
                new Car("Peugeot", 2020, 200)
        );

        LinkedHashSet<User> usersHashSet = new LinkedHashSet<>();
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
            if (user.getGender().equals("FEMALE")){
                System.out.println(user);
                userIterator.remove();
            }
        }
        System.out.println(usersHashSet);



        TreeSet<User> usersTreeSet = new TreeSet<>();
        usersTreeSet.add(userPupkin);
        usersTreeSet.add(userKokos);
        usersTreeSet.add(userKotov);
        usersTreeSet.add(userMorozova);
        usersTreeSet.add(userKoksova);
        usersTreeSet.add(userSovor);
        usersTreeSet.add(userMohov);
        usersTreeSet.add(userBarova);
        usersTreeSet.add(userKrotova);
        usersTreeSet.add(userSmehova);
        System.out.println("--------------------");
        System.out.println(usersTreeSet);
    }

}
