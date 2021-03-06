package Letter.Data;

import java.util.Date;

public class LetterDTO {
    private CustomerDTO customerDTO;
    private Date sendDate;

    public LetterDTO(CustomerDTO customerDTO, Date sendDate){
        setCustomerDTO(customerDTO);
        setSendDate(sendDate);
    }


    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    private void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    public Date getSendDate() {
        return sendDate;
    }

    private void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
