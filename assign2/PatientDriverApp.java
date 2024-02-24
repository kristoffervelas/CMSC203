/*
 * Class: CMSC203 32038
 * Instructor: Ashique Tanveer
 * Description: Create three class that work in unison to create a patient procedure collector program.
 * Due: 02/25/2024
 * Platform/compiler: vim
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Kristoffer Velas
*/

public class PatientDriverApp{    
    public static void main(String[] args){
        Patient patient1 = new Patient("Kristoffer","L","Velas","8315 BB Lane","Bethesda","MD","20814","3014359876","7863246718","Ashique Tanveer");
        Procedure proc1 = new Procedure("General Checkup", "04/12/2024", "Dr.Patel", 250.50);
        Procedure proc2 = new Procedure("Craniotomy", "02/22/2023", "Dr. Monica", 2470.00);
        Procedure proc3 = new Procedure();

        proc3.setProcedure("Cataract Surgery");
        proc3.setDate("05/12/2024");
        proc3.setPractitioner("Dr. Noah");
        proc3.setCharges(5550.00);

        PatientDriverApp drive = new PatientDriverApp();

        drive.displayPatient(patient1);
        drive.displayProcedure(proc1, proc2, proc3);
        drive.calculateTotalCharges(proc1, proc2, proc3);

        System.out.println("Student Name: Kristoffer Velas\nMC#:M21176452\nDue Date: 2/27/24");
    }

    public void displayPatient(Patient pat){
        System.out.println(pat.toString()+"\n");
    }

    public void displayProcedure(Procedure proc1, Procedure proc2, Procedure proc3){
        System.out.println(proc1.toString()+"\n");
        System.out.println(proc2.toString()+"\n");
        System.out.println(proc3.toString()+"\n");
    }
    public void calculateTotalCharges(Procedure proc1, Procedure proc2, Procedure proc3){
        double totalCharge = proc1.getCharges() + proc2.getCharges() + proc3.getCharges();
        System.out.println("Total Charges: $"+totalCharge+"\n");
    }


}
