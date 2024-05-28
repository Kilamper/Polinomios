public class UsaPolinomio {
    public static void main(String[] args) {
        int[] numeros1 = {};
        Polinomio p = new Polinomio(numeros1);
        System.out.println("El polinomio es de grado " + String.valueOf(p.grado()));
        int index = 0;
        System.out.println("El coeficiente con índice " + String.valueOf(index) 
            + " es " + String.valueOf(p.coeficiente(4)));
        p.coeficiente(index, 0);
        System.out.println("El nuevo coeficiente con índice " + String.valueOf(index) 
            + " es " + String.valueOf(p.coeficiente(4)));
        System.out.println(p.toString());
        int value = 2;
        System.out.println("El resultado del polinomio para x = " + String.valueOf(value)
            + " es " + String.valueOf(p.valor(value)));
    }
}