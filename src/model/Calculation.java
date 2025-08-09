package model;

@FunctionalInterface //Uma interface funcional possui apenas um unico método
public interface Calculation {
    double execute(double a, double b);
}
