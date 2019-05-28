package com.vince.utils;

import com.vince.bean.Order;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderIo  {
    private static List<Order> orders = new ArrayList<>();
    private static final String ORDER_FILE="order.ogj";



    public void add(Order order) throws BusinessException{
        orders.add(order);
        writeOrders();
    }
    public List<Order> list() throws BusinessException{
        readOrders();
        return orders;
    }
    public  Order findByOrderId(int  orderId) throws  BusinessException{
        Order order = null;
        int oid;
        for(Order o:orders){
            oid = o.getOrderId();
            if (oid == orderId){
                order = o;
                break;
            }
        }
        return order;
    }
    public boolean writeOrders(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ORDER_FILE));
            out.writeObject(orders);
            out.close();
            return  true;
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }
    public boolean readOrders(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(ORDER_FILE));
            orders = (List<Order> ) in.readObject() ;
            in.close();
            return true;
        } catch (IOException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }



}
