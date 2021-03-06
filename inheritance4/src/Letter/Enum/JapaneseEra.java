package Letter.Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public enum JapaneseEra {
    HEISEI("平成","1989-01-08"),
    REIWA("令和","2019-05-01");

    final public String name;
    final public String startDateStr;

    JapaneseEra(String name , String startDateStr){
        this.name = name;
        this.startDateStr = startDateStr;
    }

    public Date getStartDate(){
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(startDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }

    public int getStartDateYear(){
        String year = startDateStr.substring(0,4);
        return Integer.parseInt(year);
    }

}
