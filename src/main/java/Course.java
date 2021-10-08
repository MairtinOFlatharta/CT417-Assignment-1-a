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
        if (name != null) {
            if (name.length() >= 1)
                this.name = name;
            else
                this.name = "UNDEFINED";
        }
        else
            this.name = "UNDEFINED";
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

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        if (students != null)
            this.students = students;
        else
            this.students = new Student[0];
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
}
