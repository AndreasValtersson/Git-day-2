import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(35);
        intList.add(13);
        intList.add(150);
        intList.add(5);
        intList.add(75);
        System.out.println("Printing the lowest number in the list");
        int lowest = lowestNumber(intList);
        System.out.println(lowest);
        System.out.println("______");
        System.out.println("Printing the highest number in the list");
        int highest = highestNumber(intList);
        System.out.println(highest);

    }

    private static int lowestNumber(ArrayList<Integer> intlist) {
        int lowest = intlist.get(0);
        for (int i = 1; i < intlist.size(); i++) {
            if (lowest > intlist.get(i)) {
                lowest = intlist.get(i);
            }

        }
        return lowest;
    }

    private static int highestNumber(ArrayList<Integer> intlist){

        int highest = intlist.get(0);
        for (int i = 1; i < intlist.size(); i++) {
            if (highest < intlist.get(i)) {
                highest = intlist.get(i);
            }

        }
        return highest;

    }
}
