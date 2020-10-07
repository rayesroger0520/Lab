/*
 * Share.java

 * All Rights Reserved.
 * Copyright (c) 2019 FPT University
 *
 */
package entity;

/**
 * Share.<br>
 * 
 * <pre>
 * Store Share
 * 
 * .Share()
 * .getIcon()
 * .setIcon()
 * .getSocialNetwork()
 * .setSocialNetwork()
 * .getURL()
 * .setURL()
 * </pre>
 * 
 * @author thinh
 */
public class Share {
    /** Store the icon, socialNetwork, url */
     private String icon, socialNetwork, url;

     /**
     * Construction.<br>
     */
    public Share() {
    }

    /**
     * Construction.<br>
     * 
     * @param icon
     * @param socialNetwork
     * @param url
     */
    public Share(String icon, String socialNetwork, String url) {
        this.icon = icon;
        this.socialNetwork = socialNetwork;
        this.url = url;
    }

    /**
     * Get Icon.<br>
     * 
     * @return the Icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Set Icon.<br>
     * 
     * @param icon 
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * Get socialNetwork.<br>
     * 
     * @return the socialNetwork
     */
    public String getSocialNetwork() {
        return socialNetwork;
    }

    /**
     * Set socialNetwork.<br>
     * 
     * @param socialNetwork 
     */
    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    /**
     * Get url.<br>
     * 
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * Set url.<br>
     * 
     * @param url 
     */
    public void setUrl(String url) {
        this.url = url;
    }
     
}
