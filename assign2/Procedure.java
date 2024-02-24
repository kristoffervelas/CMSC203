public class Procedure{
    //fields
    String procedure;
    String date;
    String practitioner;
    double charges;

    //no arg constructor
    public Procedure(){
        procedure = "Stool Exam";
        date = "04/06/2024";
        practitioner = "Dr. Rickard";
        charges = 550.0;
    }

    //name and date construct
    public Procedure(String nam, String dat){
        procedure = nam;
        date = dat;
    }
    //general construct
    public Procedure(String nam, String dat, String prac, double charge){
        procedure = nam;
        date = dat;
        practitioner = prac;
        charges = charge;
    }

    //accessors
    public String getProcedure(){
        return procedure;
    }
    public String getDate(){
        return date;
    }
    public String getPractitioner(){
        return practitioner;
    }
    public double getCharges(){
        return charges;
    }

    //mutators
    public void setProcedure(String procNew){
        procedure = procNew;
    }
    public void setDate(String dateNew){
        date = dateNew;
    }
    public void setPractitioner(String pracNew){
        practitioner = pracNew;
    }
    public void setCharges(double newChar){
        charges = newChar;
    }

    public String toString(){
        String fullproc = "        Procedure: " + procedure + "\n        Procedure Date=" + date + "\n        Practitioner=" + practitioner + "\n        Charge=" + charges;
        return fullproc;
    }

}

