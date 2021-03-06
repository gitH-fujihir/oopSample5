package Letter;

import Letter.Data.LetterDTO;
import Letter.Util.LetterUtil;

public class NewYearLetter extends BaseLetter{
    private LetterUtil letterUtil = new LetterUtil();

    @Override
    void printDestination(LetterDTO letterDTO) {
        letterUtil.printDestination(letterDTO.getCustomerDTO());
    }

    @Override
    void printText(LetterDTO letterDTO) {
        System.out.println("-------お祝い文-------");
        System.out.println("新年あけましておめでとうございます。");
        System.out.println(letterUtil.conversionJPDate(letterDTO.getSendDate()));
    }
}
