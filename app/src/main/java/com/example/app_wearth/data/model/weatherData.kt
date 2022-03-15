package com.example.app_wearth.data.model

data class weatherData (
            val cod:String,
            val message: Long,
            val cnt: Long,
            val list: List<ListElement>,
            val city:City
        )

data class City(
    val id: Long,
    val name: String,
    val coord: Coord,
    val country: String,
    val population: Long,
    val timezone: Long,
    val sunrise: Long,
    val sunset: Long
)

data class Coord(
    val lat: Double,
    val lon:Double
)

data class ListElement(
    val dt: Long,
    val main:MainClass,
    val weather: List<WeatherElement>,
    val clouds: CLouds,
    val wind: Wind,
    val visibility: Long,
    val pop: Double,
    val dt_txt:String
)

data class Wind (
    val speed: Double,
    val deg: Long,
    val gust: Double
)

data class CLouds(
    val all:Long
)

data class WeatherElement(
    val id: Long,
    val description: Description,

)

enum class Description(val value: String) {
    BrokenClouds("broken clouds"),
    ClearSky("clear sky"),
    FewClouds("few clouds"),
    ScatteredClouds("scattered clouds");

    companion object {
        public fun fromValue(value: String): Description = when (value) {
            "broken clouds"    -> BrokenClouds
            "clear sky"        -> ClearSky
            "few clouds"       -> FewClouds
            "scattered clouds" -> ScatteredClouds
            else               -> throw IllegalArgumentException()
        }
    }
}



data class MainClass(
    val temp:Double,
    val feels_like:Double,
    val temp_min:Double,
    val temp_max:Double,
    val pressure: Long,
    val grnd_level:Long,
    val humidity: Long,
    val temp_kf: Double
)
