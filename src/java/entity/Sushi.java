/*
 * Sushi.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package entity;

/**
 * Sushi <br>
 * 
 * <pre>
 * Store Sushi
 * .Sushi()
 * .getId()
 * .setId()
 * .getName()
 * .setName()
 * .getImage()
 * .setImage()
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

public class Sushi {
    /** Store the id */
    private int id;
    
    /** Store the name */
    private String name;
    
    /** Store the image */
    private String image;
    
    /** Store the shortDes */
    private String shortDes;
    
    /** Store the detailDes */
    private String detailDes;
    
    /** Store the price */
    private String price;
    
    /**
     * Constructor.<br>
     */
    public Sushi() {
    }

    /**
     * Constructor.<br>
     * 
     * @param id
     * @param name
     * @param image
     * @param shortDes
     * @param detailDes
     * @param price 
     */
    public Sushi(int id, String name, String image, String shortDes, String detailDes, String price) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.shortDes = shortDes;
        this.detailDes = detailDes;
        this.price = price;
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
     * Get image.<br>
     * 
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * Set image.<br>
     * 
     * @param image 
     */
    public void setImage(String image) {
        this.image = image;
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
    
}
