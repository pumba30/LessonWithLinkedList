import java.util.Comparator;

/**
 * Created by pumba30 on 16.01.2015.
 */
public class NameCompare implements Comparator<Mountain> {
    @Override
    public int compare(Mountain one, Mountain two) {
        return one.getName().compareTo(two.getName());
    }
}
