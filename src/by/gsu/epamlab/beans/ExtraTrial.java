package by.gsu.epamlab.beans;

public class ExtraTrial extends Trial {
    private static final int LEVEL = 50;
    private int mark3;

    public ExtraTrial(String name, int mark1, int mark2, int mark3) {
        super(name, mark1, mark2);
        this.mark3 = mark3;

    }

    public int getMark3() {
        return mark3;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    @Override
    public boolean isPassed() {
        return super.isPassed() && mark3 >= LEVEL;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + mark3;
    }

    @Override
    public boolean mark1IsPass() {
        return super.mark1IsPass();
    }

    @Override
    public boolean mark2IsPass() {
        return super.mark2IsPass();
    }

    public boolean mark3IsPass() {
        return mark3 >= LEVEL;
    }

}
