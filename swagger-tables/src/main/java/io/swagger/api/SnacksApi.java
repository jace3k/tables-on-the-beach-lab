/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Snack;
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

@Api(value = "snacks", description = "the snacks API")
public interface SnacksApi {

    @ApiOperation(value = "New table order", nickname = "createSnack", notes = "", response = Snack.class, tags={ "snack", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully added snack", response = Snack.class),
        @ApiResponse(code = 400, message = "Can not add snack") })
    @RequestMapping(value = "/snacks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Snack> createSnack(@ApiParam(value = "Snack details" ,required=true )  @Valid @RequestBody Snack body);


    @ApiOperation(value = "Delete snack", nickname = "deleteSnack", notes = "", tags={ "snack", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Snack deleted successfully"),
        @ApiResponse(code = 400, message = "Error while deleting snack") })
    @RequestMapping(value = "/snacks/{snackId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteSnack(@ApiParam(value = "",required=true) @PathVariable("snackId") Long snackId);


    @ApiOperation(value = "Get all snacks", nickname = "getAllSnacks", notes = "", response = Snack.class, responseContainer = "List", tags={ "snack", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of existing snacks", response = Snack.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Error while getting snacks") })
    @RequestMapping(value = "/snacks",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<List<Snack>> getAllSnacks();


    @ApiOperation(value = "Get snack by id", nickname = "getSnack", notes = "", response = Snack.class, tags={ "snack", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Snack details", response = Snack.class),
        @ApiResponse(code = 404, message = "Snack not found") })
    @RequestMapping(value = "/snacks/{snackId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Snack> getSnack(@ApiParam(value = "",required=true) @PathVariable("snackId") Long snackId);

}