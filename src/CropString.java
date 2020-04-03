import javax.naming.PartialResultException;
import javax.print.attribute.standard.PresentationDirection;
import java.sql.PreparedStatement;

public class CropString {
    public static void main(String[] args) {
        System.out.println(cropString("why not", 100));
    }

    public static String cropString(String message, int k) {
        if(message.length()<=k){
            return message;
        }
        String[] arr = message.split(" ");

        StringBuilder stringBuilder = new StringBuilder(arr[0]);
        if (stringBuilder.length() > k) {
            return "";
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() + stringBuilder.length() < k ) {
                stringBuilder.append(" ");
                stringBuilder.append(arr[i]);
            } else
                return stringBuilder.toString();
        }
        return "";
    }

}
