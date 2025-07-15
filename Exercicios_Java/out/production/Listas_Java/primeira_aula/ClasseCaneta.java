package primeira_aula;

public class ClasseCaneta {

    //Atributos

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;


    //Métodos

    void rabiscar(){ //função sem retorno

        if(this.tampada==true){ //==comparação
            System.out.println("Erro, a caneta está tampada"); //sout escreve pra voce
        }else{
            System.out.println("Estou rabiscando");
        }
    }

    void desenhar(){

        if(this.tampada==true){
            System.out.println("Não da pra desenhar, pois estou tampada");
        }else{
            System.out.println("Estou desenhando");
        }
    }

    void tampar(){
        this.tampada = true; // = atribuindo um valor
    }

    void destampar(){
        this.tampada = false;
    }

    void estado_atual(){
        System.out.println("Esta caneta é do modelo: " + this.modelo);
        System.out.println("Esta caneta tem a cor: " + this.cor);
        System.out.println("Esta caneta tem a ponta: " + this.ponta);
        System.out.println("Esta caneta está com a carga em: " + this.carga + "%");
        System.out.println("Esta caneta está tampada?: " + this.tampada);
    }

    void grifar(){
        if(this.tampada==true){
            System.out.println("Não da pra grifar querida");
        }else{
            System.out.println("Estou grifando, e arrasando");
        }
    }
}
