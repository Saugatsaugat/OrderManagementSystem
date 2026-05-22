package com.saugat.oms.wrapper.api;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;
import java.util.List;

@Schema(description = "Standard API Error Response")
public class APIErrorResponse {

    @Schema(example = "2026-01-26T19:24:39.790767054Z")
    public Instant timestamp;

    @Schema(example = "404")
    public String status;

    @Schema(example = "RESOURCE_NOT_FOUND")
    public String error;

    @Schema(example = "GET Method: For Id = 1, Address not found")
    public String message;

    @Schema(example = "/api/address/1")
    public String path;

    @Schema(example = "69374389-bcd0-4ffc-94f8-a977b88689e8")
    public String requestId;

    @Schema(description = "Field-level error details (optional)")
    public List<FieldError> details;

    public APIErrorResponse(String status, String error, String message, String path, String requestId, List<FieldError> details) {
        this.timestamp = Instant.now();
        this.status = status;
        this.error = error;
        this.message = message;
        this.path = path;
        this.requestId = requestId;
        this.details = details;
    }

    public static class FieldError{

        @Schema(example = "packageId")
        public String field;

        @Schema(example = "PackageId is required")
        public String message;

        public FieldError(String field, String message) {
            this.field = field;
            this.message = message;
        }
    }
}