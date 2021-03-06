package Letter;

import Letter.Data.LetterDTO;
import Letter.Util.LetterUtil;

public class SummerGreedingLetter extends BaseLetter{
    private LetterUtil letterUtil = new LetterUtil();

    @Override
    void printDestination(LetterDTO letterDTO) {
        letterUtil.printDestination(letterDTO.getCustomerDTO());
    }

    @Override
    void printText(LetterDTO letterDTO) {
        System.out.println("-------あいさつ文-------");
        System.out.println("暑中お見舞い申し上げます。");
        System.out.println(letterUtil.conversionJPDate(letterDTO.getSendDate()));
    }
}
