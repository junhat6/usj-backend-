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
 * @param attractionId 
 * @param order 
 * @param scheduledTime 
 * @param estimatedDuration 
 * @param notes 
 */
data class CreateDatePlanItemRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attractionId", required = true) val attractionId: kotlin.Long,

    @get:Min(0)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("order", required = true) val order: kotlin.Int,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledTime") val scheduledTime: kotlin.String? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDuration") val estimatedDuration: kotlin.Int? = null,

    @get:Size(max=200)
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.String? = null
    ) {

}

