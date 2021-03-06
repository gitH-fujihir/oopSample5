package Letter;

import Letter.Data.CustomerDTO;

import java.util.Date;

public class BaseLetter {
    public void printDestination(CustomerDTO customerDTO){
        System.out.println(customerDTO.getPostalCode());
        System.out.println(customerDTO.getAddress());
        System.out.println(customerDTO.getName() + "　様");
    }

}
