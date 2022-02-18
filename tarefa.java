public class tarefa {
    private int tipo;
    private double a;
    private double b;


    public double calcularSalario(){
        if (tipo == 1){
            return a + b;
        }
        else if (tipo == 2){
            return a - b;
        }
        return 0;
    }
    
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public int getTipo() {
        return tipo;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}