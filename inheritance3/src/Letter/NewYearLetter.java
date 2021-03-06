package Letter;

import Letter.Data.CustomerDTO;
import Letter.Enum.JapaneseEra;
import Letter.Util.JapaneseEraUtil;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewYearLetter extends BaseLetter{
    private JapaneseEraUtil japaneseEraUtil = new JapaneseEraUtil();

    public void printCelebration(Date sendDate){
        System.out.println("-------お祝い文-------");
        System.out.println("新年あけましておめでとうございます。");
        System.out.println(japaneseEraUtil.conversionJPDate(sendDate));
    }

}
