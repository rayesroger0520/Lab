/*
 * Information.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package entity;

/**
 * Information <br>
 * 
 * <pre>
 * Store Information
 * .Information()
 * .getId()
 * .setId()
 * .getAddress()
 * .setAddress()
 * .getTel()
 * .setTel()
 * .getEmail()
 * .setEmail()
 * .getOpeningHours()
 * .setOpeningHours()
 * </pre>
 * 
 * @author thinh
 */


public class Information {
    /** Store shortDescription, address, tel, email, openingHours */
    private int id;
    private String address;
    private String tel;
    private String email;
    private String openingHours;

    /**
     * Constructor.<br>
     */
    public Information(){
    }

    /**
     * Constructor.<br>
     * 
     * @param id
     * @param address
     * @param tel
     * @param email
     * @param openingHours
     */
    public Information(int id, String address, String tel, String email, String openingHours) {
        this.id = id;
        this.address = address;
        this.tel = tel;
        this.email = email;
        this.openingHours = openingHours;
    }

    /**
     * Get id.<br>
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Set id.<br>
     * 
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get address.<br>
     * 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Set address.<br>
     * 
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Get tel.<br>
     * 
     * @return tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Set tel.<br>
     * 
     * @param tel 
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * Get shortDescription.<br>
     * 
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Set ShortDescription.<br>
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Get shortDescription.<br>
     * 
     * @return openingHours
     */
    public String getOpeningHours() {
        return openingHours;
    }

    /**
     * Set ShortDescription.<br>
     * 
     * @param openingHours 
     */
    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
   
    
}
