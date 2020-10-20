package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Students;

public class StudentsImpl implements IStudentsService{
    private  ArrayList<Students> studentList = null;
    
    //Contructor donde se crea la lista de estudiantes
    public StudentsImpl(){
        studentList = new ArrayList();
        Students student1 = new Students();
        int []id = new int [10];
        
        //Genera un id de 6 digitos aleatorio
        for(int i=0; i<id.length; i++){
            id[i]=(int) (Math.random()*1000000);
        }
        
        //Student 1
        student1.setId(id[0]);
        student1.setFirstName("Gerardo");
        student1.setLastName("Chaparro");
        student1.setGrade(80);
        
        //Student 2
        Students student2 = new Students();
        student2.setId(id[1]);
        student2.setFirstName("Luis");
        student2.setLastName("Garcia");
        student2.setGrade(90);
        
        //Student 3
        Students student3 = new Students();
        student3.setId(id[2]);
        student3.setFirstName("Lionel");
        student3.setLastName("Messi");
        student3.setGrade(100);
        
        //Student 4
        Students student4 = new Students();
        student4.setId(id[3]);
        student4.setFirstName("Javier");
        student4.setLastName("Hernandez");
        student4.setGrade(75);
        
        //Student 5
        Students student5 = new Students();
        student5.setId(id[4]);
        student5.setFirstName("Chofis");
        student5.setLastName("Lopez");
        student5.setGrade(50);
        
        //Student 6
        Students student6 = new Students();
        student6.setId(id[5]);
        student6.setFirstName("Andres");
        student6.setLastName("Guardado");
        student6.setGrade(60);
        
        //Student 7
        Students student7 = new Students();
        student7.setId(id[6]);
        student7.setFirstName("Hector");
        student7.setLastName("Herrera");
        student7.setGrade(95);
        
        //Student 8
        Students student8 = new Students();
        student8.setId(id[7]);
        student8.setFirstName("Uriel");
        student8.setLastName("Antuna");
        student8.setGrade(40);
        
        //Student 9
        Students student9 = new Students();
        student9.setId(id[8]);
        student9.setFirstName("Andres");
        student9.setLastName("Iniesta");
        student9.setGrade(85);
        
        //Student 10
        Students student10 = new Students();
        student10.setId(id[9]);
        student10.setFirstName("Xavi");
        student10.setLastName("Hernandez");
        student10.setGrade(90);
        
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        
        Collections.sort(studentList, (Students o1, Students o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName()));

    }
    
    @Override
    public List<Students> getStudents(){
        return studentList;
    }
    
    @Override
    public List<Students> getTop5Students(){
         List<Students> top5 = new ArrayList<Students>();
        
         //simulando un "select top 5" de la lista de estudiantes existente que tengan Grade arriba de 85
        for(Students s : studentList){
            if(top5.size()<5){
                if(s.getGrade()>=85){
                    top5.add(s);
                }
            }
        }
         Collections.sort(top5, (Students o1, Students o2) -> o1.getLastName().compareToIgnoreCase(o2.getLastName()));
        
        return top5;
    }
}
