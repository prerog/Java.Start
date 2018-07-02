public class Contact {
    private String surname;
    private String name;
    private String phoneNumber;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void main(String[] args) {

        Contact contact1 = new Contact();

        contact1.setSurname("Ivanov");
        contact1.setName("Ivan");
        contact1.setPhoneNumber("1234567");

        System.out.println("Фамилия: " + contact1.getSurname());
        System.out.println("Имя: " + contact1.getName());
        System.out.println("Тел: " + contact1.getPhoneNumber());
    }
}
