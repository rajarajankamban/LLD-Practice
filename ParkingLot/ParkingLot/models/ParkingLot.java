package ParkingLot.models;

import java.util.List;

public class ParkingLot extends BaseEntity {
    private String name;
    private Floor[] floors;
    private Gate[] entryGates;
    private Gate[] exitGates;
    private ParkingLotStatus parkingLotStatus;
    private List<SupportedVehicleTypes> supportedVehicleTypes;
    private int totalCapacity;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }

    public Gate[] getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(Gate[] entryGates) {
        this.entryGates = entryGates;
    }

    public Gate[] getExitGates() {
        return exitGates;
    }

    public void setExitGates(Gate[] exitGates) {
        this.exitGates = exitGates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<SupportedVehicleTypes> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleTypes> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
