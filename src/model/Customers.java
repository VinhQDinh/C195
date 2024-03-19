package model;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Represents a customer entity.
 */
public class Customers {
    private int customerId;
    private String customerName;
    private String address;
    private String postalCode;
    private String phone;
    private Date createDate;
    private String createdBy;
    private Date lastUpdate;
    private String lastUpdatedBy;
    private int divisionId;

    /**
     * Constructs a new customer with default values.
     */
    public Customers() {
    }

    /**
     * Constructs a new customer with specified attributes.
     *
     * @param customerId     The ID of the customer.
     * @param customerName   The name of the customer.
     * @param address        The address of the customer.
     * @param postalCode     The postal code of the customer.
     * @param phone          The phone number of the customer.
     * @param createDate     The creation date of the customer.
     * @param createdBy      The creator of the customer.
     * @param lastUpdate     The last update time of the customer.
     * @param lastUpdatedBy  The user who last updated the customer.
     * @param divisionId     The ID of the division associated with the customer.
     */
    public Customers(int customerId, String customerName, String address, String postalCode, String phone,
                     Date createDate, String createdBy, Date lastUpdate, String lastUpdatedBy, int divisionId) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.postalCode = postalCode;
        this.phone = phone;
        this.createDate = createDate;
        this.createdBy = createdBy;
        this.lastUpdate = lastUpdate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.divisionId = divisionId;
    }

    /**
     * Gets the ID of the customer.
     *
     * @return The customer ID.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param customerId The customer ID to set.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Gets the name of the customer.
     *
     * @return The customer name.
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the name of the customer.
     *
     * @param customerName The customer name to set.
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * Gets the address of the customer.
     *
     * @return The customer address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the address of the customer.
     *
     * @param address The customer address to set.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets the postal code of the customer.
     *
     * @return The customer postal code.
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the postal code of the customer.
     *
     * @param postalCode The customer postal code to set.
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * Gets the phone number of the customer.
     *
     * @return The customer phone number.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the phone number of the customer.
     *
     * @param phone The customer phone number to set.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Gets the creation date of the customer.
     *
     * @return The creation date.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the creation date of the customer.
     *
     * @param createDate The creation date to set.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * Gets the creator of the customer.
     *
     * @return The creator.
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the creator of the customer.
     *
     * @param createdBy The creator to set.
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * Gets the last update time of the customer.
     *
     * @return The last update time.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) lastUpdate;
    }

    /**
     * Sets the last update time of the customer.
     *
     * @param lastUpdate The last update time to set.
     */
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /**
     * Gets the user who last updated the customer.
     *
     * @return The user who last updated the customer.
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the user who last updated the customer.
     *
     * @param lastUpdatedBy The user who last updated the customer.
     */
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    /**
     * Gets the ID of the division associated with the customer.
     *
     * @return The division ID.
     */
    public int getDivisionId() {
        return divisionId;
    }

    /**
     * Sets the ID of the division associated with the customer.
     *
     * @param divisionId The division ID to set.
     */
    public void setDivisionId(int divisionId) {
        this.divisionId = divisionId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", createDate=" + createDate +
                ", createdBy='" + createdBy + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", lastUpdatedBy='" + lastUpdatedBy + '\'' +
                ", divisionId=" + divisionId +
                '}';
    }
}
