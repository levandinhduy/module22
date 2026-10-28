package thuc_hanh;

public class StudentManager {
    private Student[] studentlist = new Student[100];

    public void showList(){
        for (int i = 0; i < studentlist.length; i++) {
            if (studentlist[i] != null) {
                System.out.println(studentlist[i].getInfo());
            } else {
                break;
            }
        }

    }
    public void add(Student student){
        for(int i =0; i < studentlist.length; i++){
            if(studentlist[i] == null){
                studentlist[i] = student;
                break;
            }
        }

    }
}
