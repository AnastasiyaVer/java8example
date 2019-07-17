package by.gsu.epamlab.beans;

public class LightTrial extends Trial {
    private static final int LEVEL_MARK1 = 60;
    private static final int LEVEL_MARK2 = 40;

    public LightTrial(String name, int mark1, int mark2) {
        super(name, mark1, mark2);

    }

    @Override
    public boolean isPassed() {

        return ((getMark1() >= LEVEL_MARK1) && (getMark2() >= LEVEL_MARK2));
    }

}