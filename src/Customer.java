public class Customer {

    private String name;
    private String contact_number;
    private String license_number;

    public Customer(String name, String contact_number, String license_number) {
        this.name = name;
        this.contact_number = contact_number;
        this.license_number = license_number;
    }

    public String getName() {
        return name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public String getLicense_number() {
        return license_number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contact_number='" + contact_number + '\'' +
                ", license_number='" + license_number + '\'' +
                '}';
    }
}
