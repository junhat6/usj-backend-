package com.example.usj_backend.model

import java.util.Objects
import com.example.usj_backend.model.Attraction
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
 * @param userId 
 * @param nickname 
 * @param age 
 * @param bio 
 * @param height 
 * @param occupation 
 * @param hobbies 
 * @param favoriteAttractions 
 * @param visitFrequency 
 * @param preferredAreas 
 * @param profileImages 
 */
data class PublicProfile(

    @Schema(example = "null", description = "")
    @get:JsonProperty("userId") val userId: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("nickname") val nickname: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("age") val age: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bio") val bio: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("occupation") val occupation: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("hobbies") val hobbies: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("favoriteAttractions") val favoriteAttractions: kotlin.collections.List<Attraction>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("visitFrequency") val visitFrequency: PublicProfile.VisitFrequency? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("preferredAreas") val preferredAreas: kotlin.collections.List<PublicProfile.PreferredAreas>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("profileImages") val profileImages: kotlin.collections.List<java.net.URI>? = null
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

