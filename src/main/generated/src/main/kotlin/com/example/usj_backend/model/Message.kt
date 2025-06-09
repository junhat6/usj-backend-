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
 * @param id 
 * @param matchId 
 * @param senderId 
 * @param content 
 * @param sentAt 
 * @param isRead 
 */
data class Message(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("matchId") val matchId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("senderId") val senderId: kotlin.Long? = null,

    @get:Size(max=1000)
    @Schema(example = "null", description = "")
    @get:JsonProperty("content") val content: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("sentAt") val sentAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isRead") val isRead: kotlin.Boolean? = false
    ) {

}

