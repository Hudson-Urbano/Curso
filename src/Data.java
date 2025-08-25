public class Data {

    int dia;
    int mes;
    int ano;

    public Data () {
        dia = 01;
        mes = 01;
        ano = 1970;
    }

    public Data (int diaIncial, int mesIncial, int anoInicial) {
        dia = diaIncial;
        mes = mesIncial;
        ano = anoInicial;
    }

    String obterDataInformada () {
        return String.format("%d/%d/%d" , dia, mes, ano);
    }

    void DataInformada () {
        System.out.println(obterDataInformada());
    }
}