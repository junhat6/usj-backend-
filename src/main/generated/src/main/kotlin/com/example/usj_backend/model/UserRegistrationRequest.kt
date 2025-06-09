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
 * @param email 
 * @param password 
 * @param nickname 
 * @param birthDate 
 * @param gender 
 */
data class UserRegistrationRequest(

    @get:Email
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("email", required = true) val email: kotlin.String,

    @get:Size(min=8)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("password", required = true) val password: kotlin.String,

    @get:Size(max=20)
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("nickname", required = true) val nickname: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("birthDate", required = true) val birthDate: java.time.LocalDate,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("gender", required = true) val gender: UserRegistrationRequest.Gender
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

