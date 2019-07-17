package by.gsu.epamlab.beans;

public class Trial {
    private static final int LEVEL = 110;
    private String name;
    private int mark1;
    private int mark2;

    public Trial(String name, int mark1, int mark2) {
        this.name = name;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public static int getLevel() {
        return LEVEL;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int calculateSum() {
        return mark1 + mark2;
    }

    public boolean isPassed() {
        return mark1 + mark2 >= LEVEL;
    }

    @Override
    public String toString() {
        return String.format("%s;%d;%d", name, mark1, mark2) + isPassed(); // Delete
        // method
        // isPassed
    }

}