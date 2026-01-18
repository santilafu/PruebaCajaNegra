import java.util.Arrays;
import java.util.Scanner;

public class OrdenarNumeros {

    /**
     * Método principal para ejecutar las pruebas de Caja Negra manualmente
     * o pedir datos al usuario.
     */
    public static void main(String[] args) {

        System.out.println("INICIO DE PRUEBAS DE CAJA NEGRA ");

        // Ejecutamos nuestro juego de pruebas definido en la estrategia
        ejecutarPrueba(1, "Orden Ascendente (1, 2, 3)", 1, 2, 3, "1, 2, 3");
        ejecutarPrueba(2, "Desordenados (3, 1, 2)", 3, 1, 2, "1, 2, 3");
        ejecutarPrueba(3, "Orden Descendente (3, 2, 1)", 3, 2, 1, "1, 2, 3");
        ejecutarPrueba(4, "Con Negativos (-5, 0, -10)", -5, 0, -10, "-10, -5, 0");
        ejecutarPrueba(5, "Números Iguales (5, 5, 5)", 5, 5, 5, "5, 5, 5");
        ejecutarPrueba(6, "Dos Iguales (2, 9, 2)", 2, 9, 2, "2, 2, 9");

        System.out.println(" FIN DE PRUEBAS");
    }

    /**
     * Devuelve un String con los 3 números ordenados de menor a mayor.
     * Implementación interna usando Arrays.sort para mayor eficiencia.
     *
     * @param num1 Número 1
     * @param num2 Número 2
     * @param num3 Número 3
     * @return El texto de salida es algo como: 4, 78, 145
     */
    public static String ordenarNumeros(int num1, int num2, int num3) {
        // Creamos un array temporal con los números
        int[] numeros = {num1, num2, num3};

        // Ordenamos el array automáticamente (de menor a mayor)
        Arrays.sort(numeros);

        // Construimos y devolvemos el String formateado
        return numeros[0] + ", " + numeros[1] + ", " + numeros[2];
    }

    /**
     * Método auxiliar para automatizar la comprobación visual de las pruebas.
     * Compara el resultado obtenido con el esperado.
     */
    public static void ejecutarPrueba(int id, String descripcion, int n1, int n2, int n3, String resultadoEsperado) {
        String resultadoObtenido = ordenarNumeros(n1, n2, n3);

        System.out.print("Prueba " + id + " [" + descripcion + "]: ");

        // Verificamos si coincide (Caja negra: Entrada vs Salida esperada)
        if (resultadoObtenido.equals(resultadoEsperado)) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("FALLO");
            System.out.println("   -> Esperado: " + resultadoEsperado);
            System.out.println("   -> Obtenido: " + resultadoObtenido);
        }
    }
}