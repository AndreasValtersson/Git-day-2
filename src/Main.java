import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(35);
        intList.add(13);
        intList.add(150);
        intList.add(5);
        intList.add(75);
        int lowest = lowestNumber(intList);
        System.out.println(lowest);

    }

    private static int lowestNumber(ArrayList<Integer> intlist) {
        int lowest = intlist.indexOf(0);
        for (int i = 1; i < intlist.size(); i++) {
            if (lowest > intlist.indexOf(i)) {
                lowest = intlist.indexOf(i);
            }

        }
        return lowest;
    }

}
