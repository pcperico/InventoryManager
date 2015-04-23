/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dtos;

/**
 *
 * @author GlobalDev
 */
public class CategoryDto {
    private int Id;
    private String Description;
    private int TotalProducts;

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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the TotalProducts
     */
    public int getTotalProducts() {
        return TotalProducts;
    }

    /**
     * @param TotalProducts the TotalProducts to set
     */
    public void setTotalProducts(int TotalProducts) {
        this.TotalProducts = TotalProducts;
    }
}
