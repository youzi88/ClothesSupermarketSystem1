package com.vince.ui;

import com.vince.bean.Clothes;
import com.vince.service.ClothesService;
import com.vince.service.impl.ClothesServiceImpl;
import com.vince.utils.ConsoleTable;

import java.util.List;

public class HomeClass extends BaseClass{
    public void show(){
        showProducts();
        println("welcome:"+currUser.getUsername());
        boolean flag= true;
        while (flag){
            println(getString("home.function"));
            println(getString("info.select" ));
            String select = input.nextLine();
            switch (select){
                case "1"://1、查找全部订单
                    findList();
                    flag = false;
                    break;
                case "2"://2、查找订单
                    findOrderById();
                    flag = false;
                    break;
                case "3"://3、购买
                    byProducts();
                    flag= false;
                    break;
                case "0"://0、退出
                    flag = false;
                    System.exit(0);
                    break;
                    default:
                        println("input.error");
                        break;
            }
        }
    }

    private void byProducts() {

    }

    private void findOrderById() {
    }

    private void findList() {
    }

    private void  showProducts(){
        ClothesService clothesService = new ClothesServiceImpl() ;
        List<Clothes> list = clothesService.list();
        ConsoleTable t = new ConsoleTable(8,true);
        t.appendRow();
        t.appendColum("id")
                .appendColum("style")
                .appendColum("color")
                .appendColum("size")
                .appendColum("num")
                .appendColum("price")
                .appendColum("description");
        for (Clothes c:list){
            t.appendRow();
            t.appendColum(c.getId())
                    .appendColum(c.getBrand())
                    .appendColum(c.getStyle())
                    .appendColum(c.getColor())
                    .appendColum(c.getNum())
                    .appendColum(c.getPrice())
                    .appendColum(c.getDesription());
        }
        println((t.toString()));
    }
}
