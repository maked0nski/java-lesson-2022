package homework.hw_3;


public class Skill {
    String title;
    int exp;

    public Skill() {
    }

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (exp != skill.exp) return false;
        return title.equals(skill.title);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + exp;
        return result;
    }

    @Override
    public String toString() {
        return "Skill: {" +
                "title: '" + title + '\'' +
                ", exp: " + exp +
                '}';
    }
}
