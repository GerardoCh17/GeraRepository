package main;

import Security.Credentials;
import java.util.Scanner;
import model.Students;
import service.StudentsImpl;

public class SpringEvaluationApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StudentsImpl service = new StudentsImpl();
        Credentials credentials = new Credentials();
        int respuesta=0;
        String userIn=null, 
                passwordIn=null;
        
        
        System.out.println("Tap User Name:");
        userIn = in.next();
        System.out.println("Tap password:");
        passwordIn = in.next();
        
        if((credentials.getUserName().equals(userIn)) 
                && (credentials.getPassword().equals(passwordIn))){
            int i=0;
           while(i==0){
                System.out.println("***************** Menu *******************");
                System.out.println("1. Students List");
                System.out.println("2. Top 5 students list");
                System.out.println("3. Logout");
                System.out.println("Select option");
                System.out.println("************************************");
                respuesta = in.nextInt();

                switch(respuesta){
                    case 1: 
                        for(Students st : service.getStudents()){
                            System.out.println("_____________________ \nId: "+ st.getId()+" Student: "+ st.getFirstName() + " " +st.getLastName()
                            + " Grade: " + st.getGrade());
                        }
                        break;
                    case 2:
                        for(Students st : service.getTop5Students()){
                            System.err.println("_____________________ \nId: "+ st.getId()+" Student: "
                                    + st.getFirstName() + " " +st.getLastName()
                                    + " Grade: " + st.getGrade());
                        } 
                        break;
                    case 3:
                        System.exit(0);
                    break;
                }
            }
        }else{
            System.err.println("User and password incorrect");
        }
    }
    
}
