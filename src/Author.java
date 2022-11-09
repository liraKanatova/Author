public class Author {
    private String fullName;
    private String email;
    private char gender;


    public Author(String fullName, String email, char gender) {
        this.fullName = fullName;
        this.email = email;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void getGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public void getInfo(){
        System.out.println("FullName: "+fullName);
        System.out.println("Email: "+email);
        System.out.println("Gender: "+gender);

    }


}
