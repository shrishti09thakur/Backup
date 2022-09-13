package com.mindtree.employee.entities;
import javax.persistence.Entity;
@Entity
public class employeecontact {
	private int userId;
    private String itemId;
    private double discount;
  
    public String getItemId() {
        return itemId;
    }
  
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
  
    public double getDiscount() {
        return discount;
    }
  
    public void setDiscount(double discount) {
        this.discount = discount;
    }
  
    public int getUserId() {
        return userId;
    }
  
    public void setUserId(int userId) {
        this.userId = userId;
    }

}
