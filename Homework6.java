public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println (course1);
        System.out.println (course2);
    }
}


class CourseHW6 {
    String code;
    String name;

    public CourseHW6(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {return code;}
    public String getName() {return name;}
}


class OnlineCourse extends CourseHW6 {
    public OnlineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}


class OfflineCourse extends CourseHW6 {
    public OfflineCourse(String code, String name) {
        super(code, name);
    }
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}