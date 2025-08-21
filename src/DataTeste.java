public class DataTeste {
    public static void main(String[] args) {

    Data nascimeData = new Data();

    nascimeData.dia = 31;
    nascimeData.mes = "Janeiro - 01";
    nascimeData.ano = 2005;

    System.out.println("O dia do seu nascimento é: " + nascimeData.dia);
    System.out.println("O mês do seu nascimento é: " + nascimeData.mes);
    System.out.println("O ano do seu nascimento é: " + nascimeData.ano);
    }

}
