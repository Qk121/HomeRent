package com.JavaEE.Exercise.HomeRentSystem;

public class Home {
    private String name;
    private int phonenum;
    private String address;
    private int rentMoney;
    private int status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRentMoney() {
        return rentMoney;
    }

    public void setRentMoney(int rentMoney) {
        this.rentMoney = rentMoney;
    }

    public int getStatus() {
        return status;
    }

    public Home(String name, int phonenum, String address, int rentMoney, int status) {
        this.name = name;
        this.phonenum = phonenum;
        this.address = address;
        this.rentMoney = rentMoney;
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
