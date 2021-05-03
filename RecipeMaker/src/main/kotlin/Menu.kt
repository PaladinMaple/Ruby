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
        else if (response!!.toIntOrNull()!! < 1 || response!!.toIntOrNull()!! > 3)
            println("Opcion no valida");
    }
}