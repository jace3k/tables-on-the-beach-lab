package io.swagger.api;

import io.swagger.model.TableOrder;
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
public class TableOrdersApiController implements TableOrdersApi {

    private static final Logger log = LoggerFactory.getLogger(TableOrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TableOrdersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TableOrder> createTableOrder(@ApiParam(value = "Table order details" ,required=true )  @Valid @RequestBody TableOrder body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TableOrder>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"is_all_day\" : true,  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"table_id\" : {    \"number\" : 6,    \"id\" : 0,    \"position\" : \"position\",    \"capacity\" : 1  },  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", TableOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TableOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TableOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTableOrder(@ApiParam(value = "",required=true) @PathVariable("tableOrderId") Long tableOrderId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<TableOrder>> getAllTableOrders() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<TableOrder>>(objectMapper.readValue("[ {  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"is_all_day\" : true,  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"table_id\" : {    \"number\" : 6,    \"id\" : 0,    \"position\" : \"position\",    \"capacity\" : 1  },  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}, {  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"is_all_day\" : true,  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"table_id\" : {    \"number\" : 6,    \"id\" : 0,    \"position\" : \"position\",    \"capacity\" : 1  },  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<TableOrder>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<TableOrder>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TableOrder> getTableOrder(@ApiParam(value = "",required=true) @PathVariable("tableOrderId") Long tableOrderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TableOrder>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"is_all_day\" : true,  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"table_id\" : {    \"number\" : 6,    \"id\" : 0,    \"position\" : \"position\",    \"capacity\" : 1  },  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", TableOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TableOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TableOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<TableOrder> updateTableOrder(@ApiParam(value = "Table order identifier",required=true) @PathVariable("tableOrderId") Long tableOrderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<TableOrder>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"is_all_day\" : true,  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"table_id\" : {    \"number\" : 6,    \"id\" : 0,    \"position\" : \"position\",    \"capacity\" : 1  },  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", TableOrder.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<TableOrder>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TableOrder>(HttpStatus.NOT_IMPLEMENTED);
    }

}
