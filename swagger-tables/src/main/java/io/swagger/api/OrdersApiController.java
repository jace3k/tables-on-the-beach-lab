package io.swagger.api;

import io.swagger.model.Order;
import io.swagger.model.Party;
import io.swagger.model.Snack;
import io.swagger.model.Table;
import io.swagger.model.Ticket;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-05T16:18:34.457Z")

@Controller
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Order> createOrder(@ApiParam(value = "ticket details" ,required=true )  @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 6,  \"status\" : \"placed\"}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteOrder(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Order>> getAllOrders() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Order>>(objectMapper.readValue("[ {  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 6,  \"status\" : \"placed\"}, {  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 6,  \"status\" : \"placed\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrder(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 6,  \"status\" : \"placed\"}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Party>> getOrderParty(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Party>>(objectMapper.readValue("[ {  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}, {  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Party>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Party>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Snack>> getOrderSnacks(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Snack>>(objectMapper.readValue("[ {  \"quantity\" : 6,  \"snack_name\" : \"snack_name\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}, {  \"quantity\" : 6,  \"snack_name\" : \"snack_name\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Snack>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Snack>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Table>> getOrderTables(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Table>>(objectMapper.readValue("[ {  \"number\" : 6,  \"id\" : 0,  \"position\" : \"position\",  \"capacity\" : 1}, {  \"number\" : 6,  \"id\" : 0,  \"position\" : \"position\",  \"capacity\" : 1} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Table>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Table>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Ticket>> getOrderTickets(@ApiParam(value = "",required=true) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Ticket>>(objectMapper.readValue("[ {  \"month\" : \"JAN\",  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 0}, {  \"month\" : \"JAN\",  \"user_id\" : {    \"password\" : \"password\",    \"surname\" : \"surname\",    \"name\" : \"name\",    \"id\" : 1,    \"email\" : \"email\"  },  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Ticket>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Ticket>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
