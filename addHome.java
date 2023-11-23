package com.JavaEE.Exercise.HomeRentSystem;

import java.util.Scanner;

public class addHome extends Home{
    public addHome(String name, int phonenum, String address, int rentMoney, int status) {
        super(name, phonenum, address, rentMoney, status);
    }

    public void addHome(Home obj){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.next();
        System.out.println("请输入您的电话号：");
        int phonenum = scanner.nextInt();
        System.out.println("请输入您房源的地址：");
        String address = scanner.next();
        System.out.println("请输入您房源的租金：");
        int rentMoney = scanner.nextInt();
        int status = 1;
        obj.setName(name);
        obj.setPhonenum(phonenum);
        obj.setAddress(address);
        obj.setRentMoney(rentMoney);
        obj.setStatus(status);
    }

    public void delete(Home obj){
        obj.setName(null);
        obj.setAddress(null);
        obj.setPhonenum(0);
        obj.setRentMoney(0);
        obj.setStatus(0);
        System.out.println("您的房源已经删除!");
    }

    public void find(Home obj){
        System.out.println("您想要查找的房子信息为：");
        if(obj.getStatus() == 1) {
            System.out.println("\t" + obj.getName() + "\t" + obj.getPhonenum() + "\t" + obj.getAddress() + "\t" + obj.getRentMoney() + "\t未出租");
        }else{
            System.out.println("\t" + obj.getName() + "\t" + obj.getPhonenum() + "\t" + obj.getAddress() + "\t" + obj.getRentMoney() + "\t已出租");
        }
    }

    public void print(Home obj){
        if(obj.getName() != null) {
            if (obj.getStatus() == 1) {
                System.out.println("\t" + obj.getName() + "\t" + obj.getPhonenum() + "\t" + obj.getAddress() + "\t" + obj.getRentMoney() + "\t未出租");
            } else {
                System.out.println("\t" + obj.getName() + "\t" + obj.getPhonenum() + "\t" + obj.getAddress() + "\t" + obj.getRentMoney() + "\t已出租");
            }
        }
    }

    public void update(Home obj){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String name = scanner.next();
        if(name != "\n") {
            obj.setName(name);
        }
        System.out.println("请输入您的电话号：");
        String phonenum = scanner.next();
        if(phonenum != "\n") {
            obj.setPhonenum(Integer.parseInt(phonenum));
        }
        System.out.println("请输入您房源的地址：");
        String address = scanner.next();
        if(address != "\n") {
            obj.setAddress(address);
        }
        System.out.println("请输入您房源的租金：");
        String rentMoney = scanner.next();
        if(rentMoney != "\n") {
            obj.setRentMoney(Integer.parseInt(rentMoney));
        }
        System.out.println("请输入您房租的租聘状态（0-已出租，1-未出租）");
        String status = scanner.next();
        if(status != "\n") {
            obj.setRentMoney(Integer.parseInt(status));
        }
        System.out.println("您的信息已经修改完成!");
    }

}
