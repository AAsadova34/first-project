public class Converter {
    double rateUSD;
    double rateEUR;
    double rateJPY;
    double rateTenge;

    Converter(double usd, double eur, double jpy, double tenge) {
        rateUSD = usd;
        rateEUR = eur;
        rateJPY = jpy;
	rateTenge = tenge;
    }

    void convert(double rubles, int currency) {
        if (currency == 1) {
            System.out.println("���� ���������� � ��������: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("���� ���������� � ����: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("���� ���������� � �����: " + rubles / rateJPY);
        } else if (currency == 4) {
            System.out.println("���� ���������� � �����: " + rubles / tenge);
        } else {
            System.out.println("����������� ������");
        }
    }
}