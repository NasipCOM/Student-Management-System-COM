public class Student extends User{
private String address;
private int gpa;

public Student(String name, String surname, int id, String phone, String email, String password, String login, String address, int gpa) {
       super(name, surname, id, phone, email, password, login);
       this.address = address;
       this.gpa = gpa;
   }

   public String getAddress() {
       return address;
   }

   public void setAddress(String address) {
       this.address = address;
   }

   public int getGpa() {
       return gpa;
   }

   public void setGpa(int gpa) {
       this.gpa = gpa;
   }

   @Override
   public String toString() {
       return "Student{" +
               "address='" + address + '\'' +
               ", gpa=" + gpa +
               '}';
   }
}
