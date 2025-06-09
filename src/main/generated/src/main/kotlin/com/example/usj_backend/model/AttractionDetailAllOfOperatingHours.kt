package com.example.usj_backend.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import jakarta.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param &#x60;open&#x60; 
 * @param close 
 */
data class AttractionDetailAllOfOperatingHours(

    @Schema(example = "null", description = "")
    @get:JsonProperty("open") val `open`: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("close") val close: kotlin.String? = null
    ) {

}

