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
        setDob(dob);
        setAge(age);
        setId(id);
        setUsername();
        setCourses(courses);
        setModules(modules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            if (name.length() >= 1)
                this.name = name;
        }
        else this.name = "UNDEFINED";
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        if (age >= 0)
            this.age = age;
        else this.age = 0;
    }

    public DateTime getDob() {
        return dob;
    }

    public void setDob(DateTime dob) {
        if (dob != null) {
            if (dob.isBeforeNow())
                this.dob = dob;
            else
                this.dob = DateTime.now();
        }
        else
            this.dob = DateTime.now();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id != null) {
            if (id.length() >= 1)
                this.id = id;
            else
                this.id = "UNDEFINED";
        }
        else
            this.id = "UNDEFINED";
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
        if (courses != null)
            this.courses = courses;
        else
            this.courses = new Course[0];
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        if (modules != null)
            this.modules = modules;
        else
            this.modules = new Module[0];
    }
}
