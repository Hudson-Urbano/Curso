public class Data {

    int dia;
    int mes;
    int ano;

    String obterDataInformada () {
        return String.format("%d/%d%d" , dia, mes, ano);
    }

    void DataInformada () {
        System.out.println(obterDataInformada());
    }
}