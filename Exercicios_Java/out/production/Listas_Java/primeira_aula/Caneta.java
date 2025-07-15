package primeira_aula;

public class Caneta { //objeto

    public static void main(String[] args){

        //instanciar, colocar valores

        ClasseCaneta caneta1 = new ClasseCaneta();
        caneta1.modelo = "Esferográfica";
        caneta1.cor = "Preta";
        caneta1.ponta = 0.5f; //f pq é tipo float, e float é numero quebrado
        caneta1.carga = 70;
        //caneta1.tampada = true;


        caneta1.destampar();
        caneta1.estado_atual();
        caneta1.desenhar();


        ClasseCaneta caneta2 = new ClasseCaneta();
        caneta2.modelo = "Permanente";
        caneta2.cor = "Azul";
        caneta2.ponta = 2.0f;
        caneta2.carga = 100;

        caneta2.destampar();
        caneta2.estado_atual();
        caneta2.grifar();

    }
}
