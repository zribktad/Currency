package com.example.Task;

import javax.persistence.*;

@Entity
@Table(name = "currencies")
public class Currency {

    @Id
    @Column(name = "shortName", nullable = false)
    private String shortName;
    @Column(name = "validFrom", nullable = false)
    private String validFrom;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "country", nullable = false)
    private String country;
    @Column(name = "move", nullable = false)
    private double move;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "valBuy", nullable = false)
    private double valBuy;
    @Column(name = "valSell", nullable = false)
    private double valSell;
    @Column(name = "valMid", nullable = false)
    private double valMid;
    @Column(name = "currBuy", nullable = false)
    private double currBuy;
    @Column(name = "currSell", nullable = false)
    private double currSell;
    @Column(name = "currMid", nullable = false)
    private double currMid;
    @Column(name = "version", nullable = false)
    private double version;
    @Column(name = "cnbMid", nullable = false)
    private double cnbMid;
    @Column(name = "ecbMid", nullable = false)
    private double ecbMid;



    public Currency() {
    }

    public Currency( String shortName, String validFrom, String name, String country, double move, int amount, double valBuy, double valSell, double valMid, double currBuy, double currSell, double currMid, double version, double cnbMid, double ecbMid) {
        this.shortName = shortName;
        this.validFrom = validFrom;
        this.name = name;
        this.country = country;
        this.move = move;
        this.amount = amount;
        this.valBuy = valBuy;
        this.valSell = valSell;
        this.valMid = valMid;
        this.currBuy = currBuy;
        this.currSell = currSell;
        this.currMid = currMid;
        this.version = version;
        this.cnbMid = cnbMid;
        this.ecbMid = ecbMid;
    }


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getMove() {
        return move;
    }

    public void setMove(double move) {
        this.move = move;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getValBuy() {
        return valBuy;
    }

    public void setValBuy(double valBuy) {
        this.valBuy = valBuy;
    }

    public double getValSell() {
        return valSell;
    }

    public void setValSell(double valSell) {
        this.valSell = valSell;
    }

    public double getValMid() {
        return valMid;
    }

    public void setValMid(double valMid) {
        this.valMid = valMid;
    }

    public double getCurrBuy() {
        return currBuy;
    }

    public void setCurrBuy(double currBuy) {
        this.currBuy = currBuy;
    }

    public double getCurrSell() {
        return currSell;
    }

    public void setCurrSell(double currSell) {
        this.currSell = currSell;
    }

    public double getCurrMid() {
        return currMid;
    }

    public void setCurrMid(double currMid) {
        this.currMid = currMid;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getCnbMid() {
        return cnbMid;
    }

    public void setCnbMid(double cnbMid) {
        this.cnbMid = cnbMid;
    }

    public double getEcbMid() {
        return ecbMid;
    }

    public void setEcbMid(double ecbMid) {
        this.ecbMid = ecbMid;
    }
}
