import org.joda.time.DateTime;
import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, ArrayList<Module> modules, ArrayList<Student> students, DateTime startDate, DateTime endDate) {
        setName(name);
        setModules(modules);
        setStudents(students);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            if (name.length() >= 1)
                this.name = name;
            else
                this.name = "UNDEFINED";
        }
        else
            this.name = "UNDEFINED";
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        if (students != null)
            this.students = students;
        else
            this.students = new ArrayList<Student>();
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        if (startDate != null)
            this.startDate = startDate;
        else
            this.startDate = DateTime.now();
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        if (endDate != null) {
            if (endDate.isAfter(this.getStartDate()))
                this.endDate = endDate;
            else
                this.endDate = this.getStartDate();
        }
        else
            this.endDate = this.getStartDate();
    }

    public void addStudent(Student newStudent){
        if (newStudent != null && !students.contains(newStudent)){
            students.add(newStudent);
            newStudent.addCourse(this);
        }
    }

    public void removeStudent(Student studentToDelete){
        if (studentToDelete != null && students.contains(studentToDelete)){
            students.remove(studentToDelete);
            studentToDelete.removeCourse(this);
        }
    }

    public void addModule(Module newModule){
        if (newModule != null && !modules.contains(newModule)){
            modules.add(newModule);
            newModule.addCourse(this);
        }
    }

    public void removeModule(Module moduleToDelete){
        if (moduleToDelete != null && modules.contains(moduleToDelete)){
            modules.remove(moduleToDelete);
            moduleToDelete.removeCourse(this);
        }
    }
}
