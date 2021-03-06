/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Ticket;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-05T16:18:34.457Z")

@Api(value = "tickets", description = "the tickets API")
public interface TicketsApi {

    @ApiOperation(value = "New ticket order", nickname = "createTicket", notes = "", response = Ticket.class, tags={ "ticket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ticket created successfully", response = Ticket.class),
        @ApiResponse(code = 400, message = "Can not create ticket") })
    @RequestMapping(value = "/tickets",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Ticket> createTicket(@ApiParam(value = "ticket details" ,required=true )  @Valid @RequestBody Ticket body);


    @ApiOperation(value = "Delete ticket", nickname = "deleteTicket", notes = "", tags={ "ticket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ticket deleted successfully"),
        @ApiResponse(code = 400, message = "Error while deleting ticket") })
    @RequestMapping(value = "/tickets/{ticketId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTicket(@ApiParam(value = "",required=true) @PathVariable("ticketId") Long ticketId);


    @ApiOperation(value = "Get all tickets", nickname = "getAllTickets", notes = "", response = Ticket.class, responseContainer = "List", tags={ "ticket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ticket list", response = Ticket.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Parties not found") })
    @RequestMapping(value = "/tickets",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Ticket>> getAllTickets();


    @ApiOperation(value = "Get ticket by id", nickname = "getTicket", notes = "", response = Ticket.class, tags={ "ticket", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Ticket details", response = Ticket.class),
        @ApiResponse(code = 404, message = "Ticket not found") })
    @RequestMapping(value = "/tickets/{ticketId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Ticket> getTicket(@ApiParam(value = "",required=true) @PathVariable("ticketId") Long ticketId);

}
