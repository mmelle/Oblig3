
interface Permanent {
    void setFirstName(String fName);
    String getFirstName();

    void setLastName(String lName);
    String getLastName();

    void setFullName(String fName, String lName);
    String getFullName();

    double calculateCredit();
    double calculateBonus();
}
