package ParkingLot.models;

public class ParkingLot {
    private String id;
    private String name;
    private Floor[] floor;
    private Gate[] entryGates;
    private Gate[] exitGates;
    private VehicleType[] allowedVehicleType;

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

    public Floor[] getFloor() {
        return floor;
    }

    public void setFloor(Floor[] floor) {
        this.floor = floor;
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

    public VehicleType[] getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(VehicleType[] allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    private String address;
    private String capacity;
}
