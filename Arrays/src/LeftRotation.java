import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        if (d == a.length) {
            return a;
        }
        for (int i = 0; i < d; i++) {
            int j, temp;
            temp = a[0];
            for (j = 0; j < a.length - 1; j++) {
                a[j] = a[j + 1];
            }
            a[j] = temp;
        }
        return a;
    }

}
