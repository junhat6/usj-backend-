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
 * @param name 
 * @param category 
 * @param area 
 * @param description 
 * @param imageUrl 
 * @param averageWaitTime 
 * @param isOperating 
 */
data class Attraction(

    @Schema(example = "null", description = "")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("category") val category: Attraction.Category? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("area") val area: Attraction.Area? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("imageUrl") val imageUrl: java.net.URI? = null,

    @get:Min(0)
    @Schema(example = "null", description = "")
    @get:JsonProperty("averageWaitTime") val averageWaitTime: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("isOperating") val isOperating: kotlin.Boolean? = true
    ) {

    /**
    * 
    * Values: RIDE,SHOW,RESTAURANT,SHOP,OTHER
    */
    enum class Category(@get:JsonValue val value: kotlin.String) {

        RIDE("RIDE"),
        SHOW("SHOW"),
        RESTAURANT("RESTAURANT"),
        SHOP("SHOP"),
        OTHER("OTHER");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Category {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * 
    * Values: HOLLYWOOD,NEW_YORK,SAN_FRANCISCO,JURASSIC_PARK,AMITY_VILLAGE,WATERWORLD,WIZARDING_WORLD,MINION_PARK,OTHER
    */
    enum class Area(@get:JsonValue val value: kotlin.String) {

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
            fun forValue(value: kotlin.String): Area {
                return values().first{it -> it.value == value}
            }
        }
    }

}

