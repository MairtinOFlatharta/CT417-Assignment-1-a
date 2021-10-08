import org.joda.time.DateTime;

public class Student {
    private String name;
    private short age;
    private DateTime dob;
    private String id;
    private String username;
    private Course[] courses;
    private Module[] modules;

    public Student(String name, short age, DateTime dob, String id, Course[] courses, Module[] modules) {
        setName(name);
        setAge(age);
        setDob(dob);
        setId(id);
        setUsername();
        setCourses(courses);
        setModules(modules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        this.dob = dob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername() {
        this.username = this.name + this.age;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }
}
