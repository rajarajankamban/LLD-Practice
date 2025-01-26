package ParkingLot.models;

import java.util.Date;

public class Bill {
     private String id;
     private double amount;
     private Date exitTime;
     private Gate exitGate;
     private Operator operator;

     public String getId() {
          return id;
     }

     public void setId(String id) {
          this.id = id;
     }

     public double getAmount() {
          return amount;
     }

     public void setAmount(double amount) {
          this.amount = amount;
     }

     public Date getExitTime() {
          return exitTime;
     }

     public void setExitTime(Date exitTime) {
          this.exitTime = exitTime;
     }

     public Gate getExitGate() {
          return exitGate;
     }

     public void setExitGate(Gate exitGate) {
          this.exitGate = exitGate;
     }

     public Operator getOperator() {
          return operator;
     }

     public void setOperator(Operator operator) {
          this.operator = operator;
     }

     public Payment[] getPayment() {
          return payment;
     }

     public void setPayment(Payment[] payment) {
          this.payment = payment;
     }

     public Ticket getTicket() {
          return ticket;
     }

     public void setTicket(Ticket ticket) {
          this.ticket = ticket;
     }

     private Payment[] payment;
     private Ticket ticket;
}
