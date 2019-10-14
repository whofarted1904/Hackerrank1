import java.util.HashMap;

public class LuckyFloor {

    public static void main(String[] args) {
        System.out.println(getLuckyFloor(1344678));
    }

    private static int getLuckyFloor(int realFloor) {

        int luckyFloor = 0;
        for (int i = 1; i <= realFloor; i++) {
            luckyFloor++;
            while (!isLucky(luckyFloor)) {
                luckyFloor++;
            }
        }
        return luckyFloor;
    }


    private static boolean isLucky(int floor) {
        String string = Integer.toString(floor);

        for (int i = 0; i < string.length(); i++) {
            if (string.contains("13") || string.contains("4")) {
                return false;
            }
        }
        return true;
    }

}
