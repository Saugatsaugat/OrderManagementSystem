package com.saugat.oms.controller;

import com.saugat.oms.service.IService;
import com.saugat.oms.wrapper.PKEntityVo;
import com.saugat.oms.wrapper.api.APIErrorResponse;
import com.saugat.oms.wrapper.api.APIResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(
        name = "REST API Documentation",
        description = "CRUD Operations for REST API"
)
public abstract class AbstractController<W extends PKEntityVo, ID> {

    protected abstract IService<W, ID> getService();

    protected abstract String getResourceName();

    // Logback Logger
    /*
        Java Code -> SLF4J -> Logging Frameworks (Like Logback, JUL, Log4J)
     */
    private static final Logger log = LoggerFactory.getLogger(AbstractController.class);

    @Operation(
            summary = "Ping Rest API",
            description = "REST API to check the status"
    )
    @GetMapping("/ping")
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("Hello from " + getResourceName());
    }

    @Operation(
            summary = "Create Rest API",
            description = "REST API to create the data"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Data fetch successful"),
            @ApiResponse(
                    responseCode = "400", description = "Resource Not Found",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class))),

            @ApiResponse(
                    responseCode = "500", description = "Internal Server Error",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class)))
    }
    )
    @GetMapping("/{id}")
    public ResponseEntity<APIResponse<W>> get(@PathVariable ID id) {
        log.info("{}_Read_Request for id={}", getResourceName(), id);
        W data = getService().get(id);
        log.info("{}_Read_Success for id={}", getResourceName(), id);
        return ResponseEntity.ok(APIResponse.success(getResourceName() + "fetched successfully", data));
    }

    @Operation(
            summary = "GET Rest API",
            description = "REST API to read the datalist"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "201", description = "Datalist fetched successful"),
            @ApiResponse(responseCode = "400", description = "Resource Not Found",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class)))
    }
    )
    @GetMapping
    public ResponseEntity<APIResponse<List<W>>> get() {
        log.info("{}_Read_Request", getResourceName());
        List<W> data = getService().getAll();
        log.info("{}_Read_Success", getResourceName());
        return ResponseEntity
                .ok(APIResponse.success(getResourceName() + " list fetched successfully", data));
    }

    @Operation(
            summary = "CREATE Rest API",
            description = "REST API to create the data"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Data created successful"),
            @ApiResponse(responseCode = "400", description = "Resource Not Found",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class)))
    }
    )
    @PostMapping
    public ResponseEntity<APIResponse<W>> create(@RequestBody W vo) {
        log.info("{}_Create_Request", getResourceName());
        W created = getService().create(vo);
        log.info("{}_Create_Success", getResourceName());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(APIResponse.success(getResourceName() + " created successfully", created));
    }

    @Operation(
            summary = "PUT Rest API",
            description = "REST API to edit the data"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Data edited successful"),
            @ApiResponse(responseCode = "400", description = "Resource Not Found",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class)))
    }
    )
    @PutMapping("/{id}")
    public ResponseEntity<APIResponse<W>> edit(@RequestBody W vo, @PathVariable ID id) {
        log.info("{}_Edit_Request", getResourceName());
        W updated = getService().edit(vo, id);
        log.info("{}_Edit_Success", getResourceName());
        return ResponseEntity.ok(
                APIResponse.success(getResourceName() + " updated successfully", updated)
        );
    }

    @Operation(
            summary = "DELETE Rest API",
            description = "REST API to delete the data"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "203", description = "Data deleted successful"),
            @ApiResponse(responseCode = "400", description = "Resource Not Found",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class))),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content(schema = @Schema(implementation = APIErrorResponse.class)))
    }
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<APIResponse<Void>> delete(@PathVariable ID id) {
        log.info("{}_Delete_Request for id={}", getResourceName(), id);
        getService().delete(id);
        log.info("{}_Delete_Request_Success for id={}", getResourceName(), id);
        return ResponseEntity.noContent().build();
    }

}