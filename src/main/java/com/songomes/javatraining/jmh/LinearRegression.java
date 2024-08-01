package com.songomes.javatraining.jmh;

public class LinearRegression {

    private double[] weights;

    public void fit(double[][] X, double[] y) {
        int n = X.length;
        int m = X[0].length;
        double[][] X_transpose = new double[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                X_transpose[j][i] = X[i][j];
            }
        }

        double[][] XTX = new double[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    XTX[i][j] += X_transpose[i][k] * X[k][j];
                }
            }
        }

        double[] XTy = new double[m];
        for (int i = 0; i < m; i++) {
            for (int k = 0; k < n; k++) {
                XTy[i] += X_transpose[i][k] * y[k];
            }
        }

        this.weights = solve(XTX, XTy);
    }

    private double[] solve(double[][] A, double[] b) {
        int n = b.length;
        double[] x = new double[n];
        // Simplified example using Gaussian elimination (without pivoting)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                double ratio = A[j][i] / A[i][i];
                for (int k = 0; k < n; k++) {
                    A[j][k] -= ratio * A[i][k];
                }
                b[j] -= ratio * b[i];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            x[i] = b[i];
            for (int j = i + 1; j < n; j++) {
                x[i] -= A[i][j] * x[j];
            }
            x[i] /= A[i][i];
        }
        return x;
    }

    public double predict(double[] x) {
        double result = 0.0;
        for (int i = 0; i < weights.length; i++) {
            result += weights[i] * x[i];
        }
        return result;
    }
}

