import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {
    private String name;
    private short age;
    private DateTime dob;
    private String id;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name, short age, DateTime dob, String id, ArrayList<Course> courses, ArrayList<Module> modules) {
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        if (courses != null)
            this.courses = courses;
        else
            this.courses = new ArrayList<Course>();
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        if (modules != null)
            this.modules = modules;
        else
            this.modules = new ArrayList<Module>();
    }

    public void addCourse(Course newCourse){
        if (newCourse != null && !courses.contains(newCourse)){
            courses.add(newCourse);
            newCourse.addStudent(this);
        }
    }

    public void removeCourse(Course courseToDelete){
        if (courseToDelete != null && courses.contains(courseToDelete)){
            courses.remove(courseToDelete);
            courseToDelete.removeStudent(this);
        }
    }

    public void addModule(Module newModule){
        if (newModule != null && !modules.contains(newModule)){
            modules.add(newModule);
            newModule.addStudent(this);
        }
    }

    public void removeModule(Module moduleToDelete){
        if (moduleToDelete != null && modules.contains(moduleToDelete)){
            modules.remove(moduleToDelete);
            moduleToDelete.removeStudent(this);
        }
    }
}
