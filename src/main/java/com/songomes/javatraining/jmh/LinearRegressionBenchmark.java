package com.songomes.javatraining.jmh;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

@State(Scope.Benchmark)
public class LinearRegressionBenchmark {

    private LinearRegression lr;
    private double[][] X;
    private double[] y;
    private double[] xToPredict;

    @Setup(Level.Trial)
    public void setUp() {
        lr = new LinearRegression();
        X = new double[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 6}
        };
        y = new double[]{3, 5, 7, 9, 11};
        xToPredict = new double[]{6, 7};
    }

    @Benchmark
    public void testFit() {
        lr.fit(X, y);
    }

    @Benchmark
    public double testPredict() {
        return lr.predict(xToPredict);
    }

    public static void main(String[] args) throws Exception {

        Options opt = new OptionsBuilder()
                .include(LinearRegressionBenchmark.class.getSimpleName())
                .forks(1)
                .build();

        new Runner(opt).run();
    }
}
