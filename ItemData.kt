/**
 * <h1> Laboratorio # 1 - Programación de plataformas móviles </h1>
 * <p>
 * Universidad del Valle de Guatemala
 * </p>
 * 
 * @Edwing José Gabriel de León García – Carné No. 22809
 * @since 16/07/2023
 * 
 * CC3087 Seccion 31
 * 
 * Referencia de https://www.youtube.com/watch?v=YDiLQu9Y38o&list=PLAg6Lv5Bbjjde1VXcSjUvSXwhvaFBHfBd&index=5
 * 
 **/ 
class ItemData(originalValue: Any) {
    private val originalValue: Any = originalValue

    fun getType(): String? {
        return when (originalValue) {
            is String -> "cadena"
            is Int -> "entero"
            is Boolean -> "booleano"
            else -> null
        }
    }

    fun getInfo(): String? {
        return when (originalValue) {
            is String -> "L${originalValue.length}"
            is Int -> {
                when {
                    originalValue % 10 == 0 -> "M10"
                    originalValue % 5 == 0 -> "M5"
                    originalValue % 2 == 0 -> "M2"
                    else -> null
                }
            }
            is Boolean -> if (originalValue) "Verdadero" else "Falso"
            else -> null
        }
    }
}
