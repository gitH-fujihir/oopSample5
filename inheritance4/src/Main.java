import Letter.Data.CustomerDTO;
import Letter.Data.LetterDTO;
import Letter.NewYearLetter;
import Letter.SummerGreedingLetter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        CustomerDTO c1 = new CustomerDTO("東北きりたん","〒123-4567","秋田県きりたん町１２３");
        Date date1 = getSendDate("2020-01-01");
        Date date2 = getSendDate("2020-08-15");

        System.out.println("■■■年賀状■■■");
        NewYearLetter newYearLetter = new NewYearLetter();
        LetterDTO letterDTO1 = new LetterDTO(c1, date1);
        newYearLetter.sendLetter(letterDTO1);

        System.out.println("■■■暑中見舞い■■■");
        SummerGreedingLetter summerGreedingLetter = new SummerGreedingLetter();
        LetterDTO letterDTO2 = new LetterDTO(c1, date2);
        newYearLetter.sendLetter(letterDTO2);

    }

    private static Date getSendDate(String yyyyMMdd){
        Date date = null;
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            date = dateFormat.parse(yyyyMMdd);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;

    }

}
