package homework.hw_3;

import java.util.Arrays;

public class SkillsList {
    private Skill [] skills;

    public SkillsList() {
    }

    public SkillsList(Skill[] skills) {
        this.skills = skills;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "SkillsList{" +
                "skills=" + Arrays.toString(skills) +
                '}';
    }
}
