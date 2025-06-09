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
 * @param bio 
 * @param height 
 * @param occupation 
 * @param hobbies 
 * @param favoriteAttractions 
 * @param visitFrequency 
 * @param preferredAreas 
 * @param profileImages 
 * @param isVisible 
 */
data class ProfileUpdateRequest(

    @get:Size(max=500)
    @Schema(example = "null", description = "")
    @get:JsonProperty("bio") val bio: kotlin.String? = null,

    @get:Min(100)
    @get:Max(250)
    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @get:Size(max=50)
    @Schema(example = "null", description = "")
    @get:JsonProperty("occupation") val occupation: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hobbies") val hobbies: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteAttractions") val favoriteAttractions: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visitFrequency") val visitFrequency: ProfileUpdateRequest.VisitFrequency? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredAreas") val preferredAreas: kotlin.collections.List<ProfileUpdateRequest.PreferredAreas>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImages") val profileImages: kotlin.collections.List<java.net.URI>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isVisible") val isVisible: kotlin.Boolean? = null
    ) {

    /**
    * 
    * Values: FIRST_TIME,MONTHLY,WEEKLY,DAILY
    */
    enum class VisitFrequency(@get:JsonValue val value: kotlin.String) {

        FIRST_TIME("FIRST_TIME"),
        MONTHLY("MONTHLY"),
        WEEKLY("WEEKLY"),
        DAILY("DAILY");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): VisitFrequency {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * 
    * Values: HOLLYWOOD,NEW_YORK,SAN_FRANCISCO,JURASSIC_PARK,AMITY_VILLAGE,WATERWORLD,WIZARDING_WORLD,MINION_PARK,OTHER
    */
    enum class PreferredAreas(@get:JsonValue val value: kotlin.String) {

        HOLLYWOOD("HOLLYWOOD"),
        NEW_YORK("NEW_YORK"),
        SAN_FRANCISCO("SAN_FRANCISCO"),
        JURASSIC_PARK("JURASSIC_PARK"),
        AMITY_VILLAGE("AMITY_VILLAGE"),
        WATERWORLD("WATERWORLD"),
        WIZARDING_WORLD("WIZARDING_WORLD"),
        MINION_PARK("MINION_PARK"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): PreferredAreas {
                return values().first{it -> it.value == value}
            }
        }
    }

}

