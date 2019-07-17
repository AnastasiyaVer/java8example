package by.gsu.epamlab.beans;

public class StrongTrial extends Trial {

    public StrongTrial(String name, int mark1, int mark2) {
        super(name, mark1, mark2);
    }

    @Override
    public boolean isPassed() {

        return (((double) getMark1() / 2) + getMark2()) >= getLevel();
    }
}
