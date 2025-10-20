import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static void main(String[]args) throws Exception {
        System.out.print("Введите фамилию: ");
        String newSurname = sc.nextLine();
        System.out.print("Введите имя: ");
        String newName = sc.nextLine();
        System.out.print("Введите дату рождения: ");
        String newBirthday = sc.nextLine();
        LocalDate newBirthdayDate = LocalDate.parse(newBirthday, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.print("Введите ваш пол: ");
        char newSex = sc.next().charAt(0);
        Person chelik = new Person(newSurname, newName, newBirthdayDate, newSex);
        System.out.println(chelik);
        System.out.println("Полных лет: " + chelik.yearsNow());
    }
}

class Person {
    private String surname;
    private String name;
    private LocalDate birthday;
    private char sex;

    public int yearsNow(){
        return Period.between(birthday, LocalDate.now()).getYears();
    }
    public Person(String surname, String name, LocalDate birthday, char sex) throws Exception {
        this.setSurname(surname);
        this.setName(name);
        this.setBirthday(birthday);
        this.setSex(sex);
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String Surname){
        this.surname = Surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }
    public char getSex() {
        return sex;
    }
    public  int setSex(char sex) throws Exception {
        if (sex == 'М' || sex == 'Ж') {
            this.sex = sex;
            return 0;
        }
        throw new Exception("Укажите корректный пол (М/Ж)");

    }

    @Override
    public String toString() {
        return "Фамилия: " + getSurname() +
               "\nИмя: " + getName() +
               "\nДень рождения: " + getBirthday() +
               "\nПол: " + getSex() ;
    }
}

