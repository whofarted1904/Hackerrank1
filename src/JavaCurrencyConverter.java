import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyConverter {

    public static void main(String[] args) {
        currencyConverter(12324.134);
    }
    public static void currencyConverter(double sum){
        double num = Math.round(sum*100)/100.00;

        Locale india = new Locale("en","IN");

        NumberFormat numberFormatUS = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat numberFormatIndia = NumberFormat.getCurrencyInstance(india);
        NumberFormat numberFormatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat numberFormatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + numberFormatUS.format(sum));
        System.out.println("India: " + numberFormatIndia.format(sum));
        System.out.println("China: " + numberFormatChina.format(sum));
        System.out.println("France: " + numberFormatFrance.format(sum));



    }
}
