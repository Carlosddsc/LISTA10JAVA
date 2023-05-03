enum luz{
    VERMELHO("indsponivel"),VERDE("Disponivel"),AMBAR("Sendo Liberado");


private String situacao;

luz(String S){
    situacao=S;

}
String getSituacao(){
    return situacao;
    }
}