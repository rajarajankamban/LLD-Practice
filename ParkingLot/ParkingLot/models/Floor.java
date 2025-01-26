package ParkingLot.models;

import java.util.HashMap;

public class Floor {
    private String id;
    private String floorName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public Slot[] getSlots() {
        return slots;
    }

    public void setSlots(Slot[] slots) {
        this.slots = slots;
    }

    public HashMap<VehicleType, Integer> getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(HashMap<VehicleType, Integer> allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public FloorState getFloorState() {
        return floorState;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }

    private Slot[] slots;
    private HashMap<VehicleType,Integer> allowedVehicleType;
    private FloorState floorState;
}
