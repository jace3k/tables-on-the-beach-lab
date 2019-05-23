package io.swagger.api;

import io.swagger.model.Party;
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
public class PartyApiController implements PartyApi {

    private static final Logger log = LoggerFactory.getLogger(PartyApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PartyApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Party> createParty(@ApiParam(value = "Snack details" ,required=true )  @Valid @RequestBody Party body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Party>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", Party.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Party>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Party>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteParty(@ApiParam(value = "",required=true) @PathVariable("partyId") Long partyId) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Party>> getAllParties() {
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

    public ResponseEntity<Party> getParty(@ApiParam(value = "",required=true) @PathVariable("partyId") Long partyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Party>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", Party.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Party>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Party>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Party> updateParty(@ApiParam(value = "Party unique identifier",required=true) @PathVariable("partyId") Long partyId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Party>(objectMapper.readValue("{  \"date_start\" : \"2000-01-23T04:56:07.000+00:00\",  \"date_end\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : 0,  \"order_id\" : {    \"user_id\" : {      \"password\" : \"password\",      \"surname\" : \"surname\",      \"name\" : \"name\",      \"id\" : 1,      \"email\" : \"email\"    },    \"id\" : 6,    \"status\" : \"placed\"  }}", Party.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Party>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Party>(HttpStatus.NOT_IMPLEMENTED);
    }

}
