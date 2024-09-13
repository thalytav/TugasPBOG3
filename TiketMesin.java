/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MesinTiket
{
    private int price; // The price of a ticket
    private int balance; // The amount of money entered by a customer
    private int total; // The total amount of money
    /**
     * Constructor for objects of class MesinTiket
     */
    public MesinTiket(int cost)
    {
        price = cost;
        balance = 0;
        total = 0;
    }
    public int getPrice() //Return The price of a ticket
    {
        return price;
    }
    public int getBalance() //Return the amount of money that has been inserted for the next ticket.
    {
        return balance;
    }
    public void insertMoney(int amount) //Receiving a sum of money from a customer. Ensure that the amount is reasonable.
    {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Use a positive amount rather than " + amount);
        }
    }
    public void printTicket() //Code to simulate ticket printing.
    {
        if (balance >= price) {
            System.out.println("###############");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("###############");
            System.out.println();
            
            total = total + price; //Update the total amount by adding the price.
            balance = balance - price; //Decrease the balance as instructed by the price.
        } else {
            System.out.println("You must insert at least: " + (price - balance) + " more cents.");
        }
    }
    public int refundBalance() //Return the money in the balance when the balance is cleared.
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
