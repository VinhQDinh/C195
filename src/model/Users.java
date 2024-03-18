package model;

import java.util.Date;

/**
 * Represents a user entity.
 */
public class Users {
    private int userId;
    private String userName;
    private String password;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;

    /**
     * Constructs a new user with default values.
     */
    public Users() {
    }

    /**
     * Constructs a new user with specified attributes.
     *
     * @param userId        The ID of the user.
     * @param userName      The name of the user.
     * @param password      The password of the user.
     * @param createDate    The creation date of the user.
     * @param createdBy     The creator of the user.
     * @param lastUpdate    The last update time of the user.
     * @param lastUpdatedBy The user who last updated the user.
     */
    public Users(int userId, String userName, String password, Date createDate,
                 String createdBy, Date lastUpdate, String lastUpdatedBy) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Gets the ID of the user.
     *
     * @return The user ID.
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Sets the ID of the user.
     *
     * @param userId The user ID to set.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Gets the name of the user.
     *
     * @return The user name.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the name of the user.
     *
     * @param userName The user name to set.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Gets the password of the user.
     *
     * @return The user password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the user.
     *
     * @param password The user password to set.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the creation date of the user.
     *
     * @return The creation date.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the creation date of the user.
     *
     * @param createDate The creation date to set.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the creator of the user.
     *
     * @return The creator.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the creator of the user.
     *
     * @param createdBy The creator to set.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the last update time of the user.
     *
     * @return The last update time.
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last update time of the user.
     *
     * @param lastUpdate The last update time to set.
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated the user.
     *
     * @return The user who last updated the user.
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the user who last updated the user.
     *
     * @param lastUpdatedBy The user who last updated the user.
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
}
