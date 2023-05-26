
package arraydemos23friam;


public class Student {
   
    private String sId;
    private String sName;
    private String address;
    //comment added for modification
    
    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
}
