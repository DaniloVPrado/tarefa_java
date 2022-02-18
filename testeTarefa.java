public class testeTarefa {
    public static void main(String[] args) {
        tarefa e1 = new tarefa();
        tarefa e2 = new tarefa();

        e1.setTipo(1);
        e2.setTipo(2);

        e1.setA(100);
        e1.setB(100);
        e2.setA(1700);
        e2.setB(500);
        

        System.out.println(e1);
        System.out.println(e2);

    }
}
