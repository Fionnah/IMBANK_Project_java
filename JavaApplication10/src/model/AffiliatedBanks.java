/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Jasper
 */
public class AffiliatedBanks {
    private int bankID;
    private String bankName;
    private float charge;
    
    public AffiliatedBanks(){}

    public AffiliatedBanks(int bankID, String bankName, float charge) {
        this.bankID = bankID;
        this.bankName = bankName;
        this.charge = charge;
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public float getCharge() {
        return charge;
    }
    
    public void setCharge(float charge) {
        this.charge = charge;
    }
}
