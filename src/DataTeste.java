public class DataTeste {
    public static void main(String[] args) {

    Data d1 = new Data();

    d1.dia = 31;
    d1.mes = 01;
    d1.ano = 2005;

    var d2 = new Data();
    d2.dia = 27;
    d2.mes = 07;
    d2.ano = 2004;

    System.out.printf(d1.obterDataInformada());
    System.out.printf(d2.obterDataInformada());

    d1.DataInformada();
    d2.DataInformada();

    }

}
