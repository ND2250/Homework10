package stringhw;

public class Student {
 // Execute student record program with Object and String Concatenation
    int Numberofstudents;
    float Percentage;
    char Grade;
    String Name;

    public static void main(String[] args){

        Student studentrecord = new Student();
        studentrecord.Numberofstudents= 219;
        studentrecord.Percentage = 77.87f;
        studentrecord.Grade = 'B';
        studentrecord.Name = "Nishant";
        System.out.println("Total number of student:"+" "+ studentrecord.Numberofstudents);
        System.out.println("Percentage of student:"+" "+studentrecord.Percentage);
        System.out.println("Grades of students :"+" "+studentrecord.Grade);
        System.out.println("Name of students:"+" "+studentrecord.Name);






    }
}
