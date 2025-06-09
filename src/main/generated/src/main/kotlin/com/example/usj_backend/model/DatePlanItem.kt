package com.example.usj_backend.model

import java.util.Objects
import com.example.usj_backend.model.Attraction
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
 * @param id 
 * @param attractionId 
 * @param attraction 
 * @param scheduledTime 
 * @param estimatedDuration 
 * @param notes 
 * @param order 
 */
data class DatePlanItem(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("attractionId") val attractionId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attraction") val attraction: Attraction? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledTime") val scheduledTime: kotlin.String? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("estimatedDuration") val estimatedDuration: kotlin.Int? = null,

    @get:Size(max=200)
    @Schema(example = "null", description = "")
    @get:JsonProperty("notes") val notes: kotlin.String? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("order") val order: kotlin.Int? = null
    ) {

}

