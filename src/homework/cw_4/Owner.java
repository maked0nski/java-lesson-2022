package homework.cw_4;

public class Owner {
    private String name;
    private int age;
    private int drivingExperience;

    public Owner(String name, int age, int drivingExperience) {
        this.name = name;
        this.age = age;
        this.drivingExperience = drivingExperience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int x) {
        this.drivingExperience += x ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Owner owner = (Owner) o;

        if (age != owner.age) return false;
        if (drivingExperience != owner.drivingExperience) return false;
        return name.equals(owner.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + drivingExperience;
        return result;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", drivingExperience=" + drivingExperience +
                '}';
    }
}
