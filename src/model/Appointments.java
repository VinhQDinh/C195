package model;

import java.util.Date;

/**
 * Represents an appointment entity.
 */
public class Appointments {
    private int appointmentId;
    private String title;
    private String description;
    private String location;
    private String type;
    private Date start;
    private Date end;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;
    private int customerId;
    private int userId;
    private int contactId;

    /**
     * Constructs a new appointment with default values.
     */
    public Appointments() {
    }

    /**
     * Constructs a new appointment with specified attributes.
     *
     * @param appointmentId The ID of the appointment.
     * @param title         The title of the appointment.
     * @param description   The description of the appointment.
     * @param location      The location of the appointment.
     * @param type          The type of the appointment.
     * @param start         The start time of the appointment.
     * @param end           The end time of the appointment.
     * @param createDate    The creation date of the appointment.
     * @param createdBy     The creator of the appointment.
     * @param lastUpdate    The last update time of the appointment.
     * @param lastUpdatedBy The user who last updated the appointment.
     * @param customerId    The ID of the customer associated with the appointment.
     * @param userId        The ID of the user associated with the appointment.
     * @param contactId     The ID of the contact associated with the appointment.
     */
    public Appointments(int appointmentId, String title, String description, String location, String type,
                        Date start, Date end, Date createDate, String createdBy, Date lastUpdate,
                        String lastUpdatedBy, int customerId, int userId, int contactId) {
        this.appointmentId = appointmentId;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.start = start;
        this.end = end;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.customerId = customerId;
        this.userId = userId;
        this.contactId = contactId;
    }

    /**
     * Gets the ID of the appointment.
     *
     * @return The appointment ID.
     */
    public int getAppointmentId() {
        return appointmentId;
    }

    /**
     * Sets the ID of the appointment.
     *
     * @param appointmentId The appointment ID to set.
     */
    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    /**
     * Gets the title of the appointment.
     *
     * @return The appointment title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the appointment.
     *
     * @param title The appointment title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the description of the appointment.
     *
     * @return The appointment description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description of the appointment.
     *
     * @param description The appointment description to set.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Gets the location of the appointment.
     *
     * @return The appointment location.
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the location of the appointment.
     *
     * @param location The appointment location to set.
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * Gets the type of the appointment.
     *
     * @return The appointment type.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the appointment.
     *
     * @param type The appointment type to set.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets the start time of the appointment.
     *
     * @return The start time.
     */
    public Date getStart() {
        return start;
    }

    /**
     * Sets the start time of the appointment.
     *
     * @param start The start time to set.
     */
    public void setStart(Date start) {
        this.start = start;
    }

    /**
     * Gets the end time of the appointment.
     *
     * @return The end time.
     */
    public Date getEnd() {
        return end;
    }

    /**
     * Sets the end time of the appointment.
     *
     * @param end The end time to set.
     */
    public void setEnd(Date end) {
        this.end = end;
    }

    /**
     * Gets the creation date of the appointment.
     *
     * @return The creation date.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the creation date of the appointment.
     *
     * @param createDate The creation date to set.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the creator of the appointment.
     *
     * @return The creator.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the creator of the appointment.
     *
     * @param createdBy The creator to set.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the last update time of the appointment.
     *
     * @return The last update time.
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * Sets the last update time of the appointment.
     *
     * @param lastUpdate The last update time to set.
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated the appointment.
     *
     * @return The user who last updated the appointment.
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the user who last updated the appointment.
     *
     * @param lastUpdatedBy The user who last updated the appointment.
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Gets the ID of the customer associated with the appointment.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the ID of the customer associated with the appointment.
     *
     * @param customerId The customer ID to set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the ID of the user associated with the appointment.
     *
     * @return The user ID.
     */
    public int getUserId() {
        return userId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public int getContactId() {
        return contactId;
    }
}