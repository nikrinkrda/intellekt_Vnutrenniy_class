public class Receipt {
    public static void printReceipt(ProductInfo [] productInfo){

        for (ProductInfo prod : productInfo){
            new Transaction().new TransactionItem(prod.name, prod.price).printInfo();
        }

        for (ProductInfo prod : productInfo){
            new Transaction().new TransactionItem(prod.name, prod.price).getTransaction().printCheck();
        }
    }

    public static void printTransactionInfo (Transaction.TransactionItem transactionItem){
        transactionItem.getTransaction().printCheck();
    }
}
