package Letter;

import Letter.Data.CustomerDTO;
import Letter.Data.LetterDTO;

import java.util.Date;

public abstract class BaseLetter {
    public void sendLetter(LetterDTO letterDTO){
        printDestination(letterDTO);
        printText(letterDTO);
    }

    abstract void printDestination(LetterDTO letterDTO);

    abstract void printText(LetterDTO letterDTO);



}
