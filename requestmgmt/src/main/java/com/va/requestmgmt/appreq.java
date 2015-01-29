package com.va.requestmgmt;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(1901df908a9df12ec73176d95e1f91ab)
 */
@org.kie.api.definition.type.Label(value = "Appointment Reques")
public class appreq extends java.lang.Object implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Preferred Date")
    @org.kie.api.definition.type.Position(value = 0)
    private java.util.Date prefdate;
    
    @org.kie.api.definition.type.Label(value = "Preferred Date 2")
    @org.kie.api.definition.type.Position(value = 1)
    private java.util.Date prefdate2;
    
    @org.kie.api.definition.type.Label(value = "Status")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.String status;
    
    @org.kie.api.definition.type.Label(value = "Appointment Type")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String type;

    public appreq() {
    }

    public appreq(java.util.Date prefdate, java.util.Date prefdate2, java.lang.String type, java.lang.String status) {
        this.prefdate = prefdate;
        this.prefdate2 = prefdate2;
        this.type = type;
        this.status = status;
    }


    
    public java.util.Date getPrefdate() {
        return this.prefdate;
    }

    public void setPrefdate(java.util.Date prefdate) {
        this.prefdate = prefdate;
    }
    
    public java.util.Date getPrefdate2() {
        return this.prefdate2;
    }

    public void setPrefdate2(java.util.Date prefdate2) {
        this.prefdate2 = prefdate2;
    }
    
    public java.lang.String getStatus() {
        return this.status;
    }

    public void setStatus(java.lang.String status) {
        this.status = status;
    }
    
    public java.lang.String getType() {
        return this.type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }
}