/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxpayer;

/**
 *
 * @author PC
 */
class Taxpayer{
    String code,name;
    double income,tax,deduct;

    public Taxpayer() {
    }

    public Taxpayer(String code, String name, double income, double tax, double deduct) {
        this.code = code;
        this.name = name;
        this.income = income;
        this.tax = tax;
        this.deduct = deduct;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getDeduct() {
        return deduct;
    }

    public void setDeduct(double deduct) {
        this.deduct = deduct;
    }

    @Override
    public String toString() {
        return "Taxpayer{" + "code=" + code + ", name=" + name + ", income=" + income + ", tax=" + tax + ", deduct=" + deduct + '}';
    }   
}