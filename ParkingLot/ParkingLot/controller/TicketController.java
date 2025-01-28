package ParkingLot.controller;

import ParkingLot.dtos.IssueTicketRequestDTO;
import ParkingLot.dtos.IssueTicketResponseDTO;
import ParkingLot.dtos.ResponseStatus;
import ParkingLot.models.Ticket;
import ParkingLot.services.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    private IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO request) {
        IssueTicketResponseDTO response = new IssueTicketResponseDTO();
        try {

            Ticket ticket = ticketService.issueTicket(request.getGateId(), request.getVehicleNumber(), request.getOwnerName(), request.getVehicleType());
            response.setTicketId(ticket.getId());
            response.setSlotName(ticket.getSlot().getName());
            response.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception ex) {
            response.setResponseStatus(ResponseStatus.FAILURE);
            response.setFailureMessage(ex.getMessage());
        }

        return response;

    }
}
