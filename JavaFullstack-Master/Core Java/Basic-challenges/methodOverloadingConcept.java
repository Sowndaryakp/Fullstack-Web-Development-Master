class Calculater{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1, int n2){
        return n1 + n2;
    }
    public double add(int n1, double n2, int n3){
        return n1 + n2 + n3;
    }
}

public class methodOverloadingConcept {
    public static void main(String[] args) {
        Calculater calc = new Calculater();
        int res = calc.add(1,3, 6);
        System.out.println(res);
    }
}
