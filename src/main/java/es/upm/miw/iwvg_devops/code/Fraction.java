package es.upm.miw.iwvg_devops.code;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return (this.numerator*fraction.getDenominator()) == (this.denominator*fraction.getNumerator());
    }

    private Fraction reduce() {
        int max_value = gcd(this.numerator, this.denominator);
        this.numerator /= max_value;
        this.denominator /= max_value;
        return this;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a
                % b);
    }

    public Fraction add(Fraction fraction) {
        int numerator1 = this.numerator*fraction.getDenominator();
        int numerator2 = fraction.getNumerator()*this.denominator;
        int commonDenominator = this.denominator*fraction.getDenominator();
        return new Fraction(numerator1+numerator2, commonDenominator).reduce();
    }

    public Fraction multiply(Fraction fraction) {
        int numerator = this.numerator*fraction.getNumerator();
        int denominator = this.denominator*fraction.getDenominator();
        return new Fraction(numerator, denominator).reduce();
    }

    public Fraction divide(Fraction fraction) {
        int numerator = this.numerator*fraction.getDenominator();
        int denominator = this.denominator* fraction.getNumerator();
        return new Fraction(numerator, denominator).reduce();
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}