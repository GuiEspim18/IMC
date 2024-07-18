package br.com.fiap.imc

import androidx.compose.ui.graphics.Color
import kotlin.math.pow

fun calculate(weight: Double, height: Double): Double {
    return weight / (height / 100).pow(2)
}

fun getStatus(result: Double): String {
    return if (result < 18.5) {
        "Abaixo do peso"
    } else if (result >= 18.5 && result < 25.0) {
        "Peso ideal"
    } else if (result >= 25.0 && result < 30.0) {
        "Levemente acima do peso"
    } else if (result >= 30.0 && result < 35.0) {
        "Obesidade grau I"
    } else if (result >= 35 && result < 40.0) {
        "Obesidade grau II"
    } else {
        "Obesidade grau III"
    }

}

fun statusColor(result: Double): Color {
    if (result == 0.0) {
        return Color(0xFFE91E63)
    }
    return if (result < 18.5) {
        Color(0xFFEEA615)
    } else if (result >= 18.5 && result < 25.0) {
        Color(0xFF399E39)
    } else if (result >= 25.0 && result < 30.0) {
        Color(0xFFEEA615)
    }  else {
        Color(0xFFCF2C2C)
    }
}