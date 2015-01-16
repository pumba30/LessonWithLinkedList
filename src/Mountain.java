/**
 * Created by pumba30 on 16.01.2015.
 */
public class Mountain {

    private String name;
    private int height;

    public Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return  name + " " + height + ", ";
    }
}
