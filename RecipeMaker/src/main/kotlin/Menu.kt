fun main(args: Array<String>) {
    println(".: Bienvenido a Recipe Maker :.\n");

    val menu:String = """Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent();

    var response:String? = null;

    while (response != "3")
    {
        println(menu);
        response = readLine();

        if (response!!.toIntOrNull() == null)
            println("Solo introducir numeros");
        else if (response.toIntOrNull()!! < 1 || response.toIntOrNull()!! > 3)
            println("Opcion no valida");
        else{
            print(viewRecipe(response.toInt()))
            if(response == "1")
                makeRecipe();
        }
    }
}

fun makeRecipe()
{
    println("""Selecciona por categoría el ingrediente que buscas
    1. Agua
    2. Leche
    3. Carne
    4. Verduras
    5. Frutas
    6. Cereal
    7. Huevos
    8. Aceites""".trimIndent());
}

fun viewRecipe(selectedOption: Int): String {
    return when(selectedOption){
        1 -> "Hacer una receta\n";
        2 -> "Ver mis recetas\n";
        3 -> "Salir\n";
        else -> "";
    }
}