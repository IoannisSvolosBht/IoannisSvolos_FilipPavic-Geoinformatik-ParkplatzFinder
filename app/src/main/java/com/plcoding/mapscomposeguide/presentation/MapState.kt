package com.plcoding.mapscomposeguide.presentation

import com.google.android.gms.maps.model.MapStyleOptions
import com.google.maps.android.compose.MapProperties
import com.plcoding.mapscomposeguide.domain.model.ParkingSpot

// Mapstate ist hier eine Klasse mit drei Variablen, die alle Bildschirmsituationen kombiniert

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)
