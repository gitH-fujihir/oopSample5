package Letter;

import Letter.Data.CustomerDTO;
import Letter.Enum.JapaneseEra;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SummerGreedingLetter extends BaseLetter{
    public void printGreeting(Date sendDate){
        System.out.println("-------あいさつ文-------");
        System.out.println("暑中お見舞い申し上げます。");
        System.out.println(conversionJPDate(sendDate));
    }

    private String conversionJPDate(Date sendDate){
        JapaneseEra era;

        if(sendDate == null) return "";
        if(sendDate.after(JapaneseEra.REIWA.getStartDate())){
            era = JapaneseEra.REIWA;
        }else{
            era = JapaneseEra.HEISEI;
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        String strDate = dateFormat.format(sendDate);
        int sendYear = Integer.parseInt(strDate);
        int eraStartYear = era.getStartDateYear();
        int sendEraYear = sendYear - eraStartYear + 1;
        String sendY = era.name + " " + sendEraYear + "年";

        dateFormat = new SimpleDateFormat("M月d日");
        String sendMD = dateFormat.format(sendDate);

        return sendY + sendMD;
    }

}
