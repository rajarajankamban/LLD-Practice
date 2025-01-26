package ParkingLot.models;

import ParkingLot.strategies.FeeCalculationStrategy;

import java.util.ArrayList;
import java.util.Date;

public class Payment {
    private String id;
    private Date time;
    private PaymentStatus status;
    private PaymentMode paymentMode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ArrayList<FeeCalculationStrategy> getFeeCalculationStrategy() {
        return feeCalculationStrategy;
    }

    public void setFeeCalculationStrategy(ArrayList<FeeCalculationStrategy> feeCalculationStrategy) {
        this.feeCalculationStrategy = feeCalculationStrategy;
    }

    private double amount;
    private String transactionId;
    private ArrayList<FeeCalculationStrategy> feeCalculationStrategy;
}
