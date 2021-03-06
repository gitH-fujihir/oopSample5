package Letter.Data;

public class CustomerDTO {
    private String name;
    private String postalCode;
    private String address;

    public CustomerDTO(String name, String postalCode, String address){
        setName(name);
        setPostalCode(postalCode);
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    private void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }
}
