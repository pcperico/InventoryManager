/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.Entities;

import java.io.Serializable;

/**
 *
 * @author GlobalDev
 */
public class Provider implements Serializable{
    private int Id;
    private String Name;
    private String Address;
    private String Phone;
    private String Country;
    private String ContactName;
    private String Email;
    private int Active;    
    public Provider()
    {
    }
    
    public Provider(String name,String address, String phone,String country,String contactName,String email, int status)
    {
        Name=name;
        Address=address;
        Phone=phone;
        Country=country;
        ContactName=contactName;
        Email=email;
        Active=status;
    }
    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Phone
     */
    public String getPhone() {
        return Phone;
    }

    /**
     * @param Phone the Phone to set
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    /**
     * @return the Country
     */
    public String getCountry() {
        return Country;
    }

    /**
     * @param Country the Country to set
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    /**
     * @return the ContactName
     */
    public String getContactName() {
        return ContactName;
    }

    /**
     * @param ContactName the ContactName to set
     */
    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Active
     */
    public int getActive() {
        return Active;
    }

    /**
     * @param Status the Active to set
     */
    public void setActive(int Status) {
        this.Active = Status;
    }
}
