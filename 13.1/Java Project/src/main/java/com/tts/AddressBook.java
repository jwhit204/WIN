package com.tts;

public class AddressBook {


    private String FIRST_NAME;
    private String LAST_NAME;
    private String PHONE_NUMBER;
    private String EMAIL_ADDRESS;


    public  AddressBook(String name, String lName, String phNo, String email) {
        super();
        this.FIRST_NAME = name;
        this.LAST_NAME = lName;
        this.PHONE_NUMBER =phNo ;
        this.EMAIL_ADDRESS =email;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getEMAIL_ADDRESS() {
        return EMAIL_ADDRESS;
    }

    public void setEMAIL_ADDRESS(String EMAIL_ADDRESS) {
        this.EMAIL_ADDRESS = EMAIL_ADDRESS;
    }

    @Override
    public String toString() {
        return "Name=" + FIRST_NAME + ", Last Name =" + LAST_NAME + ", Phone No=" + PHONE_NUMBER + ", Email =" + EMAIL_ADDRESS ;
    }

}