package com.JavaEE.Exercise.HomeRentSystem;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        addHome[] home = new addHome[10];
        for(int i = 0;i < home.length;i++){
            home[i] = new addHome("",0,"",0,-1);
        }
        int id = 0,choice = 0;
        Scanner scanner = new Scanner(System.in);
        label1:
        while(choice != 6) {
            System.out.println("------------房屋出租系统-----------\n\t\t1.新增房源\n\t\t2.查找房屋\n\t\t3.删除房屋\n\t\t4.修改房屋信息\n\t\t5.房屋列表\n\t\t6.退   出");
            System.out.println("请输入您想要选择的模块");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    lable2:
                        for(int i = 0;i < home.length;i++) {
                            if(home[i].getName() == "") {
                                home[i].addHome(home[i]);
                                System.out.println("您的房源已添加完毕");
                                break lable2;
                            }
                        }
                    break;
                case 2:
                    System.out.println("请输入您想查找的房间id号：");
                    id = scanner.nextInt();
                    if(home[id].getName() != ""){
                        home[id].find(home[id]);
                    }else{
                        System.out.println("您想要查找的房源不存在！");
                    }
                    break;
                case 3:
                    System.out.println("请输入您想删除的房间id号：");
                    id = scanner.nextInt();
                    if(home[id].getName() != ""){
                        home[id].delete(home[id]);
                    }else{
                        System.out.println("您想要要删除的房源不存在！");
                    }
                    break;
                case 4:
                    System.out.println("请依次输入您想要修改信息的id号：（不想修改的直接按回车健即可！）");
                    id = scanner.nextInt();
                    home[id].update(home[id]);
                    break;
                case 5:
                    for(int i = 0;i < home.length;i++){
                        home[id].print(home[i]);
                    }
                    break;
                case 6:
                    System.out.println("您已退出系统!");
                    break label1;
            }
        }
    }
}