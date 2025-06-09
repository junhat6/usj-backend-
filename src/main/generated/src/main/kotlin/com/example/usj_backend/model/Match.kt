package com.example.usj_backend.model

import java.util.Objects
import com.example.usj_backend.model.PublicProfile
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
 * @param user1 
 * @param user2 
 * @param matchedAt 
 * @param lastMessageAt 
 */
data class Match(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user1") val user1: PublicProfile? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("user2") val user2: PublicProfile? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("matchedAt") val matchedAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("lastMessageAt") val lastMessageAt: java.time.OffsetDateTime? = null
    ) {

}

