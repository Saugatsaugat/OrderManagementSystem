package com.saugat.oms.wrapper.api;

/*
This will return success and failed api responses.
 */
public record APIResponse<T>(
        boolean success,
        String message,
        T result
) {
    public static <T> APIResponse<T> success(String message, T data){
        return new APIResponse<>(true, message, data);
    }

    public static <T> APIResponse<T> failure(String message){
        return new APIResponse<>(false, message, null);
    }
}
