import java.util.List;

public class Group {
    private String nameGroup;
    private List<Student> studentList;

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameGroup='" + nameGroup + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}