import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by pumba30 on 16.01.2015.
 */
public class DemoSortMont {
    LinkedList<Mountain> mountains = new LinkedList<Mountain>();

    public static void main(String[] args) {
        new DemoSortMont().go();

    }

    public void go() {
        mountains.add(new Mountain("Лонг-Рейндж", 14255));
        mountains.add(new Mountain("Эльберт", 14433));
        mountains.add(new Mountain("Марун", 14156));
        mountains.add(new Mountain("Касл", 14265));
        System.out.println("В порядке добавления:\n" + mountains.toString());

        NameCompare nameCompare = new NameCompare();
        Collections.sort(mountains, nameCompare);
        System.out.println("Сортироввка по названию: \n" + mountains.toString());

        HeightCompare heightCompare = new HeightCompare();
        Collections.sort(mountains, heightCompare);
        System.out.println("Сортировка по высоте: \n" + mountains.toString());
    }

}