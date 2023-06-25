package chapter03_procedure_control;

/*
2023年6月30日达到77公斤，后续每周减1公斤，一直到2023年9月30日
* */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_14_Lose_Weight {
    public static void main(String[] args) throws ParseException {
        /*Date now = new Date();
        long nowLong = now.getTime();
        System.out.println(nowLong);

         */

        DateFormat df = DateFormat.getDateInstance();
        //String s = df.format(now);
        //System.out.println(s);


        //calendar.setTime(now);
        //System.out.println(calendar.getTime());

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2023-06-30");
        String dt = df.format(date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i = calendar.get(calendar.DAY_OF_WEEK);
        System.out.println(i);

        System.out.println(dt);

        while (!(dt.equals("2023-9-30"))){
            calendar.add(calendar.DATE,7);
        }

    }
}
