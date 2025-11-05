class Publication{
    String title;
    float price;
    int copies;
    public void saleCopy(int qty){
        copies=copies-1;
    }

}
class Book extends Publication{
    String author;
    public void orderCopies(int qty){
        copies=copies+qty;
        return qty;
    }
}  
class Magazine extends Publication{
    int orderQty;
    String currentIssue;
    public void receiveIssue(){

    }

}
class PublicationDemo{
    public static void main(String[] args) {
        Book b1=new Book();
        b1.title="java programming";
        b1.price=250;
        b1.copies=10;
        b1.author="chetna siya";
        double ordercopycount =b1.orderCopies(5);
        System.out.println("ordered copies of"+b1.title+"are"+ordercopycount);
        double totalsales=b1.price*b1.copies;
        System.out.println("total sales:"+totalsales);
    }

}




