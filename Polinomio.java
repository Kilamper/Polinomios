import java.util.Arrays;

public class Polinomio {
    int[] coefs;

    public Polinomio() {
        /**Constructor por omisión*/
        this.coefs = new int[0];
    }
    public Polinomio(int[] inputVector) {
        /**Constructor con vector de enteros*/
        this.coefs = Arrays.copyOf(inputVector, inputVector.length);
    }
    public int grado() {
        /**Método para devolver el grado del polinomio*/
        int grado = 0;
        for (int i = 0; i < this.coefs.length; i++) {
            if (this.coefs[i] != 0) {
                grado = i;
            }
        } return grado;
    }
    public int coeficiente(int index) {
        /**Método para devolver el coeficiente de la posición index*/
        if ((index < this.coefs.length) && (index >= 0)) {
            return this.coefs[index];
        } return 0;
    }
    public void coeficiente(int index, int value) {
        /**Método para cambiar el coeficiente de la posición index por value*/
        if ((index < this.coefs.length) && (index >= 0)) {
            this.coefs[index] = value;
        } else {
            this.coefs = Arrays.copyOf(this.coefs, index + 1);
            this.coefs[index] = value;
        }
    }
    public int[] coeficientes() {
        /**Método para aumentar en 1 el grado del polinomio*/
        return Arrays.copyOf(this.coefs, this.grado() + 1);
    }
    public String toString() {
        /**Método para devolver el polinomio como una string*/
        String str = "";
        if (this.coefs.length > 0) {
            for (int i = this.grado(); i >= 0; i--) {
                if ((this.coefs[i] < -1) || (this.coefs[i] > 1)) {
                    if ((i < this.grado()) && (this.coefs[i] > 1)) {
                        if (i > 1) {
                            str += "+" + this.coefs[i] + "x^" + i;
                        } else if (i == 1) {
                            str += "+" + this.coefs[i] + "x";
                        } else if (i < 1) {
                            str += "+" + this.coefs[i];
                        }
                    } else {
                        if (i > 1) {
                            str += this.coefs[i] + "x^" + i;
                        } else if (i == 1) {
                            str += this.coefs[i] + "x";
                        } else if (i == 0) {
                            str += this.coefs[i];
                        }   
                    }
                } else if (this.coefs[i] == 1) {
                    if (i < this.grado()) {
                        if (i > 1) {
                            str += "+x^" + i;
                        } else if (i == 1) {
                            str += "+x";
                        } else if (i == 0) {
                            str += "+1";
                        }
                    } else {
                        if (i > 1) {
                            str += "x^" + i;
                        } else if (i == 1) {
                            str += "x";
                        } else if (i == 0) {
                            str += "1";
                        }
                    }
                } else if (this.coefs[i] == -1) {
                    if (i < this.grado()) {
                        if (i > 1) {
                            str += "-x^" + i;
                        } else if (i == 1) {
                            str += "-x";
                        } else if (i == 0) {
                            str += "-1";
                        }
                    }
                }
            }
        } if (str.isEmpty()) {
                return "0";
        } return str;
    }
    public float valor(float realValue) {
        /**Método para devolver el valor real del polinomio para x = realValue*/
        float result = 0;
        for (int i = 0; i < this.coefs.length; i++) {
            result += Math.pow((realValue), i) * this.coefs[i];
        } return result;
    }
    public Polinomio suma(Polinomio other) {
        /**Método para devolver un polinomio que sea la suma de otros dos*/
        Polinomio suma = new Polinomio();
        if (this.coefs.length < other.coefs.length) {
            for (int i = 0; i < this.coefs.length; i++) {
                suma.coeficiente(i, this.coefs[i] + other.coefs[i]);
            } for (int i = this.coefs.length; i < other.coefs.length; i++) {
                suma.coeficiente(i, other.coefs[i]);
            }
        } else {
            for (int i = 0; i < other.coefs.length; i++) {
                suma.coeficiente(i, this.coefs[i] + other.coefs[i]);
            } for (int i = other.coefs.length; i < this.coefs.length; i++) {
                suma.coeficiente(i, this.coefs[i]);
            }
        } return suma;
    }
    public Polinomio resta(Polinomio other) {
        /**Método para devolver un polinomio que sea la resta de otros dos*/
        Polinomio resta = new Polinomio();
        if (this.coefs.length < other.coefs.length) {
            for (int i = 0; i < this.coefs.length; i++) {
                resta.coeficiente(i, this.coefs[i] - other.coefs[i]);
            } for (int i = this.coefs.length; i < other.coefs.length; i++) {
                resta.coeficiente(i, -other.coefs[i]);
            }
        } else {
            for (int i = 0; i < other.coefs.length; i++) {
                resta.coeficiente(i, this.coefs[i] - other.coefs[i]);
            } for (int i = other.coefs.length; i < this.coefs.length; i++) {
                resta.coeficiente(i, this.coefs[i]);
            }
        } return resta;
    }
}