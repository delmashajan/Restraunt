import java.util.ArrayList;

public class Product {

    private int id;
    private String customerName;

    private int phoneNo;
    private int qty;
    private double price;
    private double totalPrice;



    Product(String customerName,int id, int qty, double price, double totalPrice)
    {
        this.id=id;
        this.customerName = customerName;
        this.qty = qty;
        this.price = price;
        this.totalPrice = totalPrice;
        this.phoneNo = phoneNo;
    }
    static void display(ArrayList<Product> p) {
        System.out.println("\nTransaction History\n");
        for (Product e : p) {
            System.out.println(("Name:" + e.customerName));
            System.out.println("PhoneNo:" + e.phoneNo);
            System.out.println(("ID:" + e.id));
            System.out.println(("Company:" + e.qty));
            System.out.println(("Contact:" + e.totalPrice));
            System.out.println("   ");
        }
    }



    public void display()
    {
        System.out.println("Product: " +id +"\n"+"Customer Name "+ customerName +"\n" + "Phone Number" + phoneNo +"\n" + "Quantity "+ qty +"\n" +
                "Single Piece Price:" +price +"\n" + "Total price"+ totalPrice);
    }
}

