package ParkingLot.models;

import java.util.HashMap;
import java.util.List;

public class Floor {
    private String id;
    private String floorName;

    private Slot[] slots;
    private List<SupportedVehicleTypes> supportedVehicleTypes;
    private FloorState floorState;

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

    public List<SupportedVehicleTypes> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<SupportedVehicleTypes> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public FloorState getFloorState() {
        return floorState;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }

}
