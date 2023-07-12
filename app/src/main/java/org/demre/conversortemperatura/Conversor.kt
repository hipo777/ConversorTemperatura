package org.demre.conversortemperatura

fun main() {

    print("Ingrese la temperatura a convertir (en grados Celsius): ")
    val celsius = readLine()!!.toDouble()
    val CelsiusToFahrenheit = (9.0/5.0 * celsius) + 32
    println("$celsius grados Celsius son $CelsiusToFahrenheit grados Fahrenheit")

    print("Ingrese la temperatura a convertir (en grados Kelvin): ")
    val kelvin = readLine()!!.toDouble()
    val KelvinToCelsius = kelvin - 273.15
    println("$kelvin grados Kelvin son $KelvinToCelsius grados Celsius")

    print("Ingrese la temperatura a convertir (en grados Fahrenheit): ")
    val fahrenheit = readLine()!!.toDouble()
    val fahrenheitToKelvin = (fahrenheit - 32) * 5.0/9.0 + 273.15
    println("$fahrenheit grados Fahrenheit son $fahrenheitToKelvin grados Kelvin")
}
