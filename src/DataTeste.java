public class DataTeste {
    public static void main(String[] args) {

    Data d1 = new Data();

    var d2 = new Data(27, 07, 2004);

    System.out.printf(d1.obterDataInformada());
    System.out.println(" ");
    System.out.printf(d2.obterDataInformada());
    System.out.println(" ");

    d1.DataInformada();
    d2.DataInformada();

    }

}
