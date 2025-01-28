package ParkingLot.models;

import java.util.HashMap;
import java.util.List;

public class Gate {
    private String id;
    private String name;
    private GateType gateType;
    private Payment payment;
    private GateState gateState;
    private List<SupportedVehicleTypes> supportedVehicleTypes;
    private Operator operator;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public GateState getGateState() {
        return gateState;
    }

    public void setGateState(GateState gateState) {
        this.gateState = gateState;
    }

    public List<SupportedVehicleTypes> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleTypes> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }


}
