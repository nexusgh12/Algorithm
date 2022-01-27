package Algorithm.Algorithm_class.al01_basic.calendar;

import java.util.Scanner;

public class CalendarMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] data = scan.nextLine().split(" ");
        String[] r = new String[n];
        for (int i = 0; i < n; i++) {
            int y = Integer.parseInt(data[i]);
            if (y % 4 == 0 & y % 100 != 0 || y % 400 == 0) {
                r[i] = "À±³â";

            } else {
                r[i] = "Æò³â";

            }
        }
    }
}
