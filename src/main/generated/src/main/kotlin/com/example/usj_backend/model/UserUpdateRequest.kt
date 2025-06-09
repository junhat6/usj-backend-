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
 * @param nickname 
 * @param birthDate 
 */
data class UserUpdateRequest(

    @get:Size(max=20)
    @Schema(example = "null", description = "")
    @get:JsonProperty("nickname") val nickname: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("birthDate") val birthDate: java.time.LocalDate? = null
    ) {

}

