package SOLID;

//S--> Single Responsibility
//O--> Open/Closed Principle
//L--> LisKov Substitution Principle
//I--> Interface Segment Principle
//D--> Dependancy inversion Principle

//Here Each classes have Single Responsibility

public class SolidPrinciple {

    public static void main(String Args[]){
        Marker marker = new Marker("Natraj" , "Yellow" , 2021 , 40);
        Marker marker2 = new Marker("Afsara" , "Grey" , 2022 , 50);
        Invoice invoice = new Invoice(marker2 , 2);
        Invoiceprinter invoiceprinter = new Invoiceprinter(invoice);
        invoiceprinter.printInvoice();
    }
}

class Marker {
    String name;
    String color;
    int year;
    int price;

    public Marker(String name , String color , int year , int price){
        this.name = name;
        this.color = color;
        this.price = price ;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Invoice {
    private Marker marker ;
    private int quantity;
    public Invoice(Marker marker , int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * quantity);
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Marker getMarker() {
        return marker;
    }

    public void setMarker(Marker marker) {
        this.marker = marker;
    }
}

// Changing for Open closed Principle
// what is suggested that every class should be open for extension but closed for modification
//It mostly plays with interface and show the oop piller of abstractions

interface InvoiceDao{
    public void save(Invoice invoice);
}

class DBInvoiceDao implements  InvoiceDao{
    @Override
    public void save(Invoice invoice) {
      System.out.println("Saving to SQL DB");
    }
}

class FileInvoiceDB implements InvoiceDao {
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving to File DB");
    }
}

class NoSQLInvoiceDB implements InvoiceDao{
    @Override
    public void save(Invoice invoice) {
        System.out.println("Saving to NO SQL Mongo DB");
    }
}




class Invoiceprinter{
   Invoice invoice;
    public Invoiceprinter(Invoice invoice){
        this.invoice = invoice;
    }
    public void printInvoice(){
       Marker marker = invoice.getMarker();
       int quantity = invoice.getQuantity();
       int totalPrice = invoice.calculateTotal();

       System.out.println("Invoice Details:");
       System.out.println("Product:"+marker.getName());
       System.out.println("Year:"+marker.getYear());
       System.out.println("Color:"+marker.getColor());
       System.out.println("Price Per Market:"+marker.getPrice());
       System.out.println("Quantity:"+invoice.getQuantity());
       System.out.println("Total Price:"+invoice.calculateTotal());

    }
}
