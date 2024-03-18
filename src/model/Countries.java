package model;

import java.util.Date;

/**
 * Represents a country entity.
 */
public class Countries {
    private int countryId;
    private String country;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;

    /**
     * Constructs a new country with default values.
     */
    public Countries() {
    }

    /**
     * Constructs a new country with specified attributes.
     *
     * @param countryId      The ID of the country.
     * @param country        The name of the country.
     * @param createDate     The creation date of the country.
     * @param createdBy      The creator of the country.
     * @param lastUpdate     The last update time of the country.
     * @param lastUpdatedBy  The user who last updated the country.
     */
    public Countries(int countryId, String country, Date createDate, String createdBy,
                     Date lastUpdate, String lastUpdatedBy) {
        this.countryId = countryId;
        this.country = country;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Gets the ID of the country.
     *
     * @return The country ID.
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the ID of the country.
     *
     * @param countryId The country ID to set.
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    /**
     * Gets the name of the country.
     *
     * @return The country name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the name of the country.
     *
     * @param country The country name to set.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets the creation date of the country.
     *
     * @return The creation date.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the creation date of the country.
     *
     * @param createDate The creation date to set.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the creator of the country.
     *
     * @return The creator.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the creator of the country.
     *
     * @param createdBy The creator to set.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the last update time of the country.
     *
     * @return The last update time.
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last update time of the country.
     *
     * @param lastUpdate The last update time to set.
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated the country.
     *
     * @return The user who last updated the country.
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the user who last updated the country.
     *
     * @param lastUpdatedBy The user who last updated the country.
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}

