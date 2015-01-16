import java.util.Comparator;

/**
 * Created by pumba30 on 16.01.2015.
 */
public class HeightCompare implements Comparator<Mountain> {
    @Override
    public int compare(Mountain one, Mountain two) {
        String oneHeight = String.valueOf(one.getHeight());
        String twoHeight = String.valueOf(two.getHeight());
        return twoHeight.compareTo(oneHeight);
    }
}
