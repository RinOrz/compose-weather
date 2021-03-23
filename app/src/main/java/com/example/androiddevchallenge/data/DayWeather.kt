/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

/**
 * The weather data throughout the day.
 *
 * @author 凛 (https://github.com/RinOrz)
 *
 * @param hours24 The weather in the next 24 hours
 */
data class DayWeather(
    override val temperature: Temperature,
    override val type: WeatherType,
    override val aqi: AQI,
    val wind: Float,
    val humidity: Float,
    val pressure: Float,
    val visibility: Float,
    val sunrise: Long,
    val sunset: Long,
    val hours24: List<HourlyWeather>,
) : Weather
