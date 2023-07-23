import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ProductInfo[] productInfos = new ProductInfo[3];
        productInfos[0] = new ProductInfo("A", 22);
        productInfos[1] = new ProductInfo("B", 32);
        productInfos[2] = new ProductInfo("K", 46);

        Receipt.printReceipt(productInfos);

        System.out.println("-----------------------------------------------");

        Transaction transaction = new Transaction();
        Transaction.TransactionItem transactionItem = transaction.new TransactionItem("A", 22); // Первая транзакция
        Receipt.printTransactionInfo(transactionItem);

        transactionItem = transaction.new TransactionItem("K", 32); // Вторая транзакция
        Receipt.printTransactionInfo(transactionItem);

        transactionItem = transaction.new TransactionItem(null, 46); // Третяя транзакция
        Receipt.printTransactionInfo(transactionItem);
    }

}