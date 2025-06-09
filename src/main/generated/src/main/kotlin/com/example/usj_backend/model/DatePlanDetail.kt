package com.example.usj_backend.model

import java.util.Objects
import com.example.usj_backend.model.DatePlanItem
import com.example.usj_backend.model.PublicProfile
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param title 
 * @param description 
 * @param creatorId 
 * @param sharedWithUserId 
 * @param scheduledDate 
 * @param items 
 * @param status 
 * @param createdAt 
 * @param updatedAt 
 * @param creator 
 * @param sharedWithUser 
 */
data class DatePlanDetail(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @get:Size(max=100)
    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("creatorId") val creatorId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sharedWithUserId") val sharedWithUserId: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scheduledDate") val scheduledDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("items") val items: kotlin.collections.List<DatePlanItem>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: DatePlanDetail.Status? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdAt") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedAt") val updatedAt: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creator") val creator: PublicProfile? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("sharedWithUser") val sharedWithUser: PublicProfile? = null
    ) {

    /**
    * 
    * Values: DRAFT,SHARED,CONFIRMED,COMPLETED,CANCELLED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        DRAFT("DRAFT"),
        SHARED("SHARED"),
        CONFIRMED("CONFIRMED"),
        COMPLETED("COMPLETED"),
        CANCELLED("CANCELLED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().first{it -> it.value == value}
            }
        }
    }

}

