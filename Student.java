public class Student {
    private int id;
    private int age;
    private double gpa;
    private int creditHours;
    private String name;

    public String getName(){
        return name;
    }
    public int getId(int id){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public double getGpa(double gpa){
        return gpa;


    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
    }


    }

    public Student(double gpa, int creditHours, int age){
        this.gpa = gpa;
        this.age =age;
        this.creditHours = creditHours;
    }

    public boolean equals(Object obj){
        if (obj instanceof Student){
            return name.equals((Student)obj.getName();
        } else{
            return false;
        }
    }
    public String toString(){
        System.out.println(name + " " + id);
        return name + " " + id;


    }
    public static void main (String [] args){
        Student student1 = new Student(24, 20, 2.9, 55);

        Student student2 = new Student(55, 19, 3.0 ,24);
    }

