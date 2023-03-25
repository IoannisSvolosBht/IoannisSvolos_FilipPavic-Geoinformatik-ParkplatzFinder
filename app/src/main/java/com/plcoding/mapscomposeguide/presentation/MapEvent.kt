package com.plcoding.mapscomposeguide.presentation

import com.google.android.gms.maps.model.LatLng
import com.plcoding.mapscomposeguide.domain.model.ParkingSpot

//MapEvent Klasse bestimmt welche Dinge der Nutzer auf Karte/ Bildeschirm machen kann
sealed class MapEvent {
    object ToggleFalloutMap: MapEvent()
    data class OnMapLongClick(val latLng: LatLng): MapEvent()
    data class OnInfoWindowLongClick(val spot: ParkingSpot): MapEvent()
}
