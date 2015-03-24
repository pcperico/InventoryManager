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
public class Proveedor implements Serializable{
    private int Id;
    private String Nombre;
    private String Direccion;
    private String Telefono;
    private String Pais;
    private String Contacto;
    private String Email;
    private int Active;    
    public Proveedor()
    {
    }
    
    public Proveedor(String nombre,String direccion, String telefono,String pais,String contacto,String email, int status)
    {
        Nombre=nombre;
        Direccion=direccion;
        Telefono=telefono;
        Pais=pais;
        Contacto=contacto;
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
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion the Direccion to set
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Pais
     */
    public String getPais() {
        return Pais;
    }

    /**
     * @param Pais the Pais to set
     */
    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    /**
     * @return the Contacto
     */
    public String getContacto() {
        return Contacto;
    }

    /**
     * @param Contacto the Contacto to set
     */
    public void setContacto(String Contacto) {
        this.Contacto = Contacto;
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
