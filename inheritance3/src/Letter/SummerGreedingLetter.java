package Letter;

import Letter.Data.CustomerDTO;
import Letter.Enum.JapaneseEra;
import Letter.Util.JapaneseEraUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SummerGreedingLetter extends BaseLetter{
    private JapaneseEraUtil japaneseEraUtil = new JapaneseEraUtil();

    public void printGreeting(Date sendDate){
        System.out.println("-------あいさつ文-------");
        System.out.println("暑中お見舞い申し上げます。");
        System.out.println(japaneseEraUtil.conversionJPDate(sendDate));
    }

}
