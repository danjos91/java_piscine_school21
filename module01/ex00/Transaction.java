

import java.util.UUID;

public class Transaction {

    private static final String DEBIT = "OUTCOME";
    private static final String CREDIT = "INCOME";
    private UUID identifier;
    private User recipient;
    private User sender;
    private String transferCategory;
    private Integer transferAmount;
    private static final Integer SUCCES = 1;
    private static final Integer FAILED = 0;
    private Integer transactionStatus;

    public Transaction(User recipient, User sender, int transferAmount){
        this.identifier = UUID.randomUUID();
        this.recipient = recipient;
        this.sender = sender;
        this.transferAmount = transferAmount;

        if(sender.GetBalance() - transferAmount < 0)
        {
            transactionStatus = FAILED;
            return;
        }
        else
        {
            transactionStatus = SUCCES;
        }
        sender.SetBalance(sender.GetBalance() - transferAmount);
        recipient.SetBalance(recipient.GetBalance() + transferAmount);
    }

    public Integer GetTransferAmount(){
        return  transferAmount;
    }
    public User GetRecipient(){
        return  recipient;
    }

    public User GetSender(){
        return  sender;
    }

    public void printAllTransactionInfo(){
        transferCategory = DEBIT;
        System.out.println(sender.GetName() + " -> " + recipient.GetName() +", " + "-" + GetTransferAmount() + ", " + transferCategory +", " + "transaction ID: " + identifier);
        transferCategory = CREDIT;
        System.out.println( recipient.GetName() + " -> " + sender.GetName() +", " + "+" + GetTransferAmount() + ", " + transferCategory +", " + "transaction ID: " + identifier);
        if(transactionStatus == SUCCES) {
            System.out.println("Transaction status: SUCCES");
        }
        else {
            System.out.println("Transaction status: FAILED, not enough balance available.");
        }
    }


}
