/**
 * 
 */
package com.nucleusteq.inventorymanagementbeta.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author NucleusTeq Device
 *
 */
@JsonInclude(content = Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ValidationException {
 
    private String errorCode;
    private String message;
 
    public ValidationException(String errorCode, String message) {
        super();
        this.errorCode = errorCode;
        this.message = message;
}
}