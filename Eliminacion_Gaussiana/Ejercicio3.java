package Eliminacion_Gaussiana;
public class Ejercicio3 { public static void main(String[] args) {

    int n = 3; // Número de incógnitas
   
    double[][] matrix = {
            
            {-8, -5.0, 7.0, 22.0},
            
            {4.0, 1.0, -9.0, 21.0},
    
            {-12.0, -14.0, 4.0, -3.0}
    
    };
    
    double[] result = Eliminacion(matrix, n);
    
    for (int i = 0; i < n; i++) {
    
        System.out.println("x[" + i + "] = " + result[i]);

    }

}

public static double[] Eliminacion(double[][] matrix, int n) {
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            double factor = matrix[j][i] / matrix[i][i];
            for (int k = i; k < n + 1; k++) {
                matrix[j][k] -= factor * matrix[i][k];
            }
        }
    }

    double[] result = new double[n];
    for (int i = n - 1; i >= 0; i--) {
        result[i] = matrix[i][n];
        for (int j = i + 1; j < n; j++) {
            result[i] -= matrix[i][j] * result[j];
        }
        result[i] /= matrix[i][i];
    }

    return result;
}}