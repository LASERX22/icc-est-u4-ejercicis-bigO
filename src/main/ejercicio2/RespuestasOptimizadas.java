package main.ejercicio2;

import java.util.HashSet;

public class RespuestasOptimizadas {
    // El estudiante debe escribir aquí las versiones optimizadas y las
    // complejidades

    // 1. Versión optimizada de tieneDuplicados (Complejidad anotada en la variable)
    public static String tieneDuplicadosComplejidad = "O(n)"; // Ej: "O(n)"

    public static boolean tieneDuplicadosOpt(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) {
                return true; // Duplicado encontrado
            }
            set.add(num);
        }
        return false;
    }

    // 2. Versión optimizada de contarMayores (Complejidad anotada en la variable)
    public static String contarMayoresComplejidad = ""; // Ej: "O(n)"

    public static int contarMayoresOpt(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num > x) {
                count++;
            }
        }
        return 0;
    }

    // 3. Versión optimizada de encontrarMaximo (Complejidad anotada en la variable)
    public static String encontrarMaximoComplejidad = ""; // Ej: "O(n)"

    public static int encontrarMaximoOpt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return 0;
    }
}
