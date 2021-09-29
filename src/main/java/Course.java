import org.joda.time.DateTime;

public class Course {
    private String name;
    private Module[] modules;
    private Student[] students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, Module[] modules, Student[] students, DateTime startDate, DateTime endDate) {
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
        this.name = name;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
