package Inheritance;

class Order {
    String orderId, orderDate;
    Order(String id,String date){orderId=id;orderDate=date;}
    String getOrderStatus(){return "Placed on "+orderDate;}
}
class ShippedOrder extends Order {
    String tracking;
    ShippedOrder(String id,String date,String t){super(id,date);tracking=t;}
    String getOrderStatus(){return "Shipped, Track: "+tracking;}
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String id,String date,String t,String d){super(id,date,t);deliveryDate=d;}
    String getOrderStatus(){return "Delivered on "+deliveryDate;}
}
public class Main {
    public static void main(String[] args){
        System.out.println(new Order("O1","2025-09-10").getOrderStatus());
        System.out.println(new ShippedOrder("O2","2025-09-11","TRK123").getOrderStatus());
        System.out.println(new DeliveredOrder("O3","2025-09-12","TRK999","2025-09-14").getOrderStatus());
    }
}
