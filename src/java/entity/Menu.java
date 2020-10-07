/*
 * Menu.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package entity;

/**
 * Menu <br>
 * 
 * <pre>
 * Store Menu
 * .Sushi()
 * .getId()
 * .setId()
 * .getName()
 * .setName()
 * .getShortDes()
 * .setShortDes()
 * .getDetailDes()
 * .setDetailDes()
 * .getPrice()
 * .setPrice()
 * </pre>
 * 
 * @author thinh
 */
public class Menu {
    /** Store the id */
    private int id;
    
    /** Store the name */
    private String name;
    
    /** Store the price */
    private String price;
    
    /** Store the shortDes */
    private String shortDes;
    
    /** Store the detailDes */
    private String detailDes;

    /**
     * Constructor.<br>
     */
    public Menu() {
    }

    /**
     * Constructor.<br>
     * 
     * @param id
     * @param name
     * @param price 
     * @param shortDes
     * @param detailDes
     */
    public Menu(int id, String name, String price, String shortDes, String detailDes) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shortDes = shortDes;
        this.detailDes = detailDes;
    }

    /**
     * Get id.<br>
     * 
     * @return the id
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
     * Get name.<br>
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set name.<br>
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get price.<br>
     * 
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * Set price.<br>
     * 
     * @param price 
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * Get shortDes.<br>
     * 
     * @return the shortDes
     */
    public String getShortDes() {
        return shortDes;
    }

    /**
     * Set shortDes.<br>
     * 
     * @param shortDes 
     */
    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    /**
     * Get detailDes.<br>
     * 
     * @return the detailDes
     */
    public String getDetailDes() {
        return detailDes;
    }

    /**
     * Set detailDes.<br>
     * 
     * @param detailDes
     */
    public void setDetailDes(String detailDes) {
        this.detailDes = detailDes;
    }
    
}
