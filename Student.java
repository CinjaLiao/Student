public class Student {
    private String name;
    private int number;

    Student(String aName, int aNumber){
        name = aName;
        number = aNumber;
    }

    public String getName(){
        return name;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int n){
        number = n;
    }
}

class StudentTest{
    public static void main(String[] args){
        Student s = new Student("Cinja", 1234);
        System.out.println("I am " + s.getName() + ". My number is: " + s.getNumber());
        s.setNumber(4567);
        System.out.println("The new number is: " + s.getNumber());
    }

}