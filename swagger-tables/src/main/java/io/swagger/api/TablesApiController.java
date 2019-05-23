package io.swagger.api;

import io.swagger.model.Table;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import io.swagger.service.TablesService;

import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-05T16:18:34.457Z")

@Controller
public class TablesApiController implements TablesApi {


    private static final Logger log = LoggerFactory.getLogger(TablesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private TablesService tablesService;

    @org.springframework.beans.factory.annotation.Autowired
    public TablesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Table> createNewTable(@ApiParam(value = "Details about the table" ,required=true )  @Valid @RequestBody Table body) {
        try {
            Table table = tablesService.addTable(body);
            return new ResponseEntity<Table>(table, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Table>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<Table>> getAllTables() {
        try {
            List<io.swagger.model.Table> tables = tablesService.getAllTables();
            return new ResponseEntity<List<Table>>(tables, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Error", e);
            return new ResponseEntity<List<Table>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Table> getTable(@ApiParam(value = "Table unique number",required=true) @PathVariable("tableNo") Long tableNo) {
        try {
            Table table = tablesService.getTable(tableNo);
            table.setCapacity(100L);
            return new ResponseEntity<Table>(table, HttpStatus.OK);
        } catch (Exception e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<Table>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<Void> updateTable(@ApiParam(value = "Table unique number",required=true) @PathVariable("tableNo") Long tableNo) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
