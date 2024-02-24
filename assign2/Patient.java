public class Patient{

    //fields
    private String first;
    private String middle;
    private String last;
    private String StreetAddress;
    private String city;
    private String state;
    private String zip;
    private String phoneNum;
    private String emergencyNum;
    private String emergencyName;

    //no-arg constructor
    public Patient(){
        first = "Kris";
        middle = "L";
        last = "Velas";
        StreetAddress = "235 Overbroad Ave";
        city = "Atlanta";
        state = "NY";
        zip = "01355";
        phoneNum = "3015438792";
        emergencyNum = "7856738123";
        emergencyName = "Jon Snow";
    }
    //name constructor
    public Patient(String fir, String mid, String las){
        first = fir;
        middle = mid;
        last = las;
    }
    //general constructor
    public Patient(String fir, String mid, String las, String add, String cit, String sta, String zi, String num, String emnum, String emnam){
        first = fir;
        middle = mid;
        last = las;
        StreetAddress = add;
        city = cit;
        state = sta;
        zip = zi;
        phoneNum = num;
        emergencyNum = emnum;
        emergencyName = emnam;
    }

    //accessors
    public String getFirstName(){
        return first;
    }
    public String getMiddleName(){
        return middle;
    }
    public String getLastName(){
        return last;
    }
    public String getStreetAddress(){
        return StreetAddress;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZIPCode(){
        return zip;
    }
    public String getPhoneNumber(){
        return phoneNum;
    }
    public String getEmergencyName(){
        return emergencyName;
    }
    public String getEmergencyNumber(){
        return emergencyNum;
    }

    //mutators
    public void setFirstName(String fir){
        first = fir;
    }
    public void setMiddleName(String mid){
        middle = mid;
    }
    public void setLastName(String las){
        last = las;
    }
    public void setStreetAddress(String add){
        StreetAddress = add;    
    }
    public void setCity(String cit){
        city = cit;
    }
    public void setState(String sta){
        state = sta;
    }
    public void setZIPCode(String zi){
        zip = zi;
    }
    public void setPhoneNumber(String num){
        phoneNum = num;
    }
    public void setEmergencyName(String enam){
        emergencyName = enam;
    }
    public void setEmergencyNumber(String emnum){
        emergencyNum = emnum;
    }

    //build name
    public String buildFullName(){
        String full = first + " " + middle + " " + last;
        return full;
    }

    //build address
    public String buildAddress(){
        String fullAddy = StreetAddress + " " + city + " " + state + " " + zip;
        return fullAddy;
    }

    //build emergency contact()
    public String buildEmergencyContact(){
        String fullE = emergencyName + " " + emergencyNum;
        return fullE;
    }

    //toString method
    public String toString(){
        String fullthing = "Patient info:\n    Name: "+ buildFullName()+"\n    Address: "+ buildAddress() + "\n    Emergency Contact: " + buildEmergencyContact();
        return fullthing;
    }
    
    
    
    

}
