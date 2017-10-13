/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ie.nuigalway.aidan.studentregdriver;

import ie.nuigalway.aidan.student.registration.project.CourseProgramme;
import ie.nuigalway.aidan.student.registration.project.Module;
import ie.nuigalway.aidan.student.registration.project.Student;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class StudentRegDriver {
    
    public static ArrayList<Student> eceStudents = new ArrayList<Student>();

    public static void main(String [] Args) {
        // initialise students
        Student Aidan = new Student("Aidan","Walsh", 22, "1995-08-17", 14467852);
        Student Jordan = new Student("Jordan","Cahill", 21, "1996-01-11", 14484036);
        Student Hugh = new Student("Hugh", "Caufield", 22, "1995-10-08", 14419057);
        
        eceStudents.add(Aidan);
        eceStudents.add(Jordan);
        eceStudents.add(Hugh);
  
        // Add modules to eceModules ArrayList
        Module softEng = new Module("Software Engineering III", "CT417");
        Module machLearn = new Module("Machine Learning & Data Mining", "CT475");
        Module DSP = new Module("Digital Signal Processing", "EE445");
        Module SoC = new Module("System on Chip Design I", "EE451");
        Module TSA = new Module("Telecommunications Software Applications", "EE453");
        
        softEng.addStudent(Aidan);
        softEng.addStudent(Jordan);
        softEng.addStudent(Hugh);
        machLearn.addStudent(Aidan);;
        machLearn.addStudent(Jordan);
        machLearn.addStudent(Hugh);
        DSP.addStudent(Aidan);
        DSP.addStudent(Jordan);
        DSP.addStudent(Hugh);
        SoC.addStudent(Aidan);
        SoC.addStudent(Jordan);
        SoC.addStudent(Hugh);
        TSA.addStudent(Aidan);
        TSA.addStudent(Jordan);
        TSA.addStudent(Hugh);    
       

        // Create ECE course and add list of modules
        CourseProgramme ECE = new CourseProgramme("Electronic and Computer Engineering ", "BP" ,"2014-09-01", "2018-05-31");
        ECE.addModule(softEng);
        ECE.addModule(machLearn);
        ECE.addModule(DSP);
        ECE.addModule(SoC);
        ECE.addModule(TSA);
        
        
        eceStudents.forEach((s) -> {
            System.out.println(
                            "\nStudent Details:\n----------------\n" +
                            "Student Name: " + s.getStudentName() +
                            "\nCourse Details: " + s.getStudentCourse().getCourseName() +
                            "\nModules: ");
            for (Module m : s.getSModules()) {
                System.out.print(m.getModuleName()+ "\n");
            }
        });
    }
    
}
