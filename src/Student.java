import java.sql.Connection;
import java.util.Random;
public class Student {
    private int rollNo;
    private String name;
    private String sClass;
    private static String college;
    private static int nextRollNo;

    static {

        college = "KHS";
        nextRollNo = 20;
    }

        public Student(String name,String sClass) {
            this.rollNo = nextRollNo;
            nextRollNo++;
            this.name = name;
            this.sClass = sClass;
        }

            public int getRollNo(){
            return rollNo;
            }

            public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
            }

            public String getName() {
            return name;
            }

            public void setName(String name) {
            this.name = name;
            }

            public String getsClass(){
            return sClass;
            }

            public void setClass(String sClass) {
            this.sClass = sClass;
            }

             public static String getCollege() {
             return college;
            }

            public static void setCollege(String college) {
            Student.college = college;
            }

            public void display() {
            System.out.println(rollNo + " " + name + " " + sClass);
    }
}


