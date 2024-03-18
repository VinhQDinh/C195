package model;

import java.util.Date;

/**
 * Represents a first-level division entity.
 */
public class FirstLevelDivisions {
    private int divisionId;
    private String division;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;
    private int countryId;

    /**
     * Constructs a new first-level division with default values.
     */
    public FirstLevelDivisions() {
    }

    /**
     * Constructs a new first-level division with specified attributes.
     *
     * @param divisionId     The ID of the division.
     * @param division       The name of the division.
     * @param createDate     The creation date of the division.
     * @param createdBy      The creator of the division.
     * @param lastUpdate     The last update time of the division.
     * @param lastUpdatedBy  The user who last updated the division.
     * @param countryId      The ID of the country associated with the division.
     */
    public FirstLevelDivisions(int divisionId, String division, Date createDate, String createdBy,
                               Date lastUpdate, String lastUpdatedBy, int countryId) {
        this.divisionId = divisionId;
        this.division = division;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.countryId = countryId;
    }

    /**
     * Gets the ID of the division.
     *
     * @return The division ID.
     */
    public int getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the ID of the division.
     *
     * @param divisionId The division ID to set.
     */
    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    /**
     * Gets the name of the division.
     *
     * @return The division name.
     */
    public String getDivision() {
        return division;
    }

    /**
     * Sets the name of the division.
     *
     * @param division The division name to set.
     */
    public void setDivision(String division) {
        this.division = division;
    }

    /**
     * Gets the creation date of the division.
     *
     * @return The creation date.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the creation date of the division.
     *
     * @param createDate The creation date to set.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the creator of the division.
     *
     * @return The creator.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the creator of the division.
     *
     * @param createdBy The creator to set.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the last update time of the division.
     *
     * @return The last update time.
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last update time of the division.
     *
     * @param lastUpdate The last update time to set.
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated the division.
     *
     * @return The user who last updated the division.
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the user who last updated the division.
     *
     * @param lastUpdatedBy The user who last updated the division.
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Gets the ID of the country associated with the division.
     *
     * @return The country ID.
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * Sets the ID of the country associated with the division.
     *
     * @param countryId The country ID to set.
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
}
