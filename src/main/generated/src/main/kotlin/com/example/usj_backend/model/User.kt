package com.example.usj_backend.model

import java.util.Objects
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
 * @param email 
 * @param nickname 
 * @param birthDate 
 * @param gender 
 * @param createdAt 
 * @param updatedAt 
 */
data class User(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @get:Email
    @Schema(example = "null", description = "")
    @get:JsonProperty("email") val email: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("nickname") val nickname: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("birthDate") val birthDate: java.time.LocalDate? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("gender") val gender: User.Gender? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("createdAt") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("updatedAt") val updatedAt: java.time.OffsetDateTime? = null
    ) {

    /**
    * 
    * Values: MALE,FEMALE,OTHER
    */
    enum class Gender(@get:JsonValue val value: kotlin.String) {

        MALE("MALE"),
        FEMALE("FEMALE"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Gender {
                return values().first{it -> it.value == value}
            }
        }
    }

}

