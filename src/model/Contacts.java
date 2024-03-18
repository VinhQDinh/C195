package model;

/**
 * Represents a contact entity.
 */
public class Contacts {
    private int contactId;
    private String contactName;
    private String email;

    /**
     * Constructs a new contact with default values.
     */
    public Contacts() {
    }

    /**
     * Constructs a new contact with specified attributes.
     *
     * @param contactId    The ID of the contact.
     * @param contactName  The name of the contact.
     * @param email        The email address of the contact.
     */
    public Contacts(int contactId, String contactName, String email) {
        this.contactId = contactId;
        this.contactName = contactName;
        this.email = email;
    }

    /**
     * Gets the ID of the contact.
     *
     * @return The contact ID.
     */
    public int getContactId() {
        return contactId;
    }

    /**
     * Sets the ID of the contact.
     *
     * @param contactId The contact ID to set.
     */
    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    /**
     * Gets the name of the contact.
     *
     * @return The contact name.
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the name of the contact.
     *
     * @param contactName The contact name to set.
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * Gets the email address of the contact.
     *
     * @return The email address.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the contact.
     *
     * @param email The email address to set.
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

