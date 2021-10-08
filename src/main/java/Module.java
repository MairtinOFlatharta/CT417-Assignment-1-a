import java.util.ArrayList;

public class Module {
    private String name;
    private String id;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String name, String id, ArrayList<Student> students, ArrayList<Course> courses) {
        setName(name);
        setId(id);
        setStudents(students);
        setCourses(courses);
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

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        if (students != null)
            this.students = students;
        else
            this.students = new ArrayList<Student>();
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

    public void addStudent(Student newStudent){
        if (newStudent != null && !students.contains(newStudent)){
            students.add(newStudent);
            newStudent.addModule(this);
        }
    }

    public void removeStudent(Student studentToDelete){
        if (studentToDelete != null && students.contains(studentToDelete)){
            students.remove(studentToDelete);
            studentToDelete.removeModule(this);
        }
    }

    public void addCourse(Course newCourse){
        if (newCourse != null && !courses.contains(newCourse)){
            courses.add(newCourse);
            newCourse.addModule(this);
        }
    }

    public void removeCourse(Course courseToDelete){
        if (courseToDelete != null && courses.contains(courseToDelete)){
            courses.remove(courseToDelete);
            courseToDelete.removeModule(this);
        }
    }
}
