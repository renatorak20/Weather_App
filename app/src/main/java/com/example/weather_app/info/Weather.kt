package com.example.weather_app.info

class Weather {

    var main:String? = null
    var description:String? = null
    var icon:String? = null

    constructor(main: String?, description: String?, icon: String?) {
        this.main = main
        this.description = description
        this.icon = icon
    }
}