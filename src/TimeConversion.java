public class TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }

    private static String timeConversion(String s)  {
//        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
//        SimpleDateFormat parseFormat = new SimpleDateFormat("HH:mm:ssaa");
//        Date date = null;
//        String output = null;
//        try {
//            date = parseFormat.parse(s);
//            output = displayFormat.format(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        return output;
        int h1 = (int)s.charAt(1) - '0';
        int h2 = (int)s.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);
        StringBuilder str = new StringBuilder();
        if (s.charAt(8) == 'A')
        {
            if (hh == 12)
            {
              str.append("00");
                for (int i = 2; i <= 7; i++)
                    str.append(s.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    str.append(s.charAt(i));
            }
        }
        else
        {
            if (hh == 12)
            {
                str.append("12");
                for (int i = 2; i <= 7; i++)
                    str.append(s.charAt(i));
            }
            else
            {
                hh = hh + 12;
                str.append(hh);
                for (int i = 2; i <= 7; i++)
                   str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
