package by.epam.learning.programmingWithClass.task8;

public class Customer {
    int id;
    String surname;
    String name;
    String patronymic;
    String adress;
    int numberOfCreditCard;
    int numberOfBankAccount;

    public Customer(int id, String surname, String name, String patronymic, String adress, int numberOfCreditCard, int numberOfBankAccount) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.adress=adress;
        this.numberOfCreditCard = numberOfCreditCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumberOfCreditCard() {
        return numberOfCreditCard;
    }

    public void setNumberOfCreditCard(int numberOfCreditCard) {
        this.numberOfCreditCard = numberOfCreditCard;
    }

    public int getNumberOfBankAccount() {
        return numberOfBankAccount;
    }

    public void setNumberOfBankAccount(int numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }


    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", surname='" + surname + '\'' + ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' + ", adress='" + adress + '\'' +", numberOfCreditCard=" +
                numberOfCreditCard +", numberOfBankAccount=" + numberOfBankAccount +'}';
    }
}
