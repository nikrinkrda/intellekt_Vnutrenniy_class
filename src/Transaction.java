public class Transaction {
    private double price;
    private double tax = 1.2;

    public class TransactionItem{
        private final double price;
        private final String name;
        Transaction getTransaction(){
            return Transaction.this;
        }

        public TransactionItem(String name, double price){
            if(name.isEmpty()){  // доработать: если параметр неопределен п.3 абз.4
                this.name = "Default";
            } else {
                this.name = name;
            }
            if(price < 0){
                this.price = 0;
            } else {
                this.price = price;
                setPrice(getPrice() + this.price); // не уверен в правильности, ведь в условии сетер не предусмотрен
            }
        }
        void printInfo(){
            System.out.printf("Item: %s, ", name); // не во всём уверен п.3 абз. 5
            printCheck(price);
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    double dealPrice(){
        return price * tax;
    }

    private void printCheck(double price){
        if (price == 0) {
            System.out.println(String.format("Order price: %.2f \nTotal price: %.2f" , getPrice(), dealPrice()));
        } else {
            System.out.println(String.format("price: %.2f", price));
        }
    }
    public void printCheck(){
        printCheck(0);
    }

}
