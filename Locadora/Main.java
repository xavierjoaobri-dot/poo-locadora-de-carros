public class Main{

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente(
            "João Silva",
            "123.456.789-00",
            "(11) 98765-4321"
        );
        
        Cliente cliente2 = new Cliente(
            "Maria Souza",
            "987.654.321-00",
            "(21) 91234-5678"
        );

        Cliente cliente3 = new Cliente(
            "Carlos Oliveira",
            "456.789.123-00",
            "(31) 99876-5432"
        );

        Cliente cliente4 = new Cliente(
            "Ana Santos",
            "789.123.456-00",
            "(41) 98765-4321"
        );

        Cliente cliente5 = new Cliente(
            "Pedro Lima",
            "321.654.987-00",
            "(51) 91234-5678"
        );

        Cliente cliente6 = new Cliente(
            "Fernanda Costa",
            "654.987.321-00",
            "(61) 99876-5432"
        );

        Veiculo veiculo1 = new Veiculo(
            "ABC-1234",
            "Toyota Corolla",
            2020
        );

        Veiculo veiculo2 = new Veiculo(
            "DEF-5678",
            "Honda Civic",
            2019
        );
        
        Veiculo veiculo3 = new Veiculo(
            "GHI-9012",
            "Ford Focus",
            2021
        );

        Veiculo veiculo4 = new Veiculo(
            "JKL-3456",
            "Chevrolet Cruze",
            2018
        );

        Veiculo veiculo5 = new Veiculo(
            "MNO-7890",
            "Volkswagen Golf",
            2022
        );

        Veiculo veiculo6 = new Veiculo(
            "PQR-2345",
            "Nissan Sentra",
            2020
        );

        Veiculo veiculo7 = new Veiculo(
            "STU-6789",
            "Hyundai Elantra",
            2019
        );

        Veiculo veiculo8 = new Veiculo(
            "VWX-0123",
            "Kia Forte",
            2021
        );

        Veiculo veiculo9 = new Veiculo(
            "YZA-4567",
            "Mazda 3",
            2018
        );
        
        Veiculo veiculo10 = new Veiculo(
            "BCD-8901",
            "Subaru Impreza",
            2022
        );


        Locacao locacao1 = new Locacao(cliente1, veiculo5, "2023-06-01", "2023-06-10");
        Locacao locacao2 = new Locacao(cliente2, veiculo2, "2023-06-05", "2023-06-15");
        Locacao locacao3 = new Locacao(cliente3, veiculo10, "2023-06-08", "2023-06-18");
        Locacao locacao4 = new Locacao(cliente4, veiculo4, "2023-06-10", "2023-06-20");
        Locacao locacao5 = new Locacao(cliente5, veiculo7, "2023-06-12", "2023-06-22");
        Locacao locacao6 = new Locacao(cliente6, veiculo8, "2023-06-15", "2023-06-25");

        System.out.println(locacao1.getVeiculo().getModelo() + " DE " + locacao1.getDataLocacao() + " ATÉ " + locacao1.getDataDevolucao());
        System.out.println(locacao2.getVeiculo().getModelo() + " DE " + locacao2.getDataLocacao() + " ATÉ " + locacao2.getDataDevolucao());
        System.out.println(locacao3.getVeiculo().getModelo() + " DE " + locacao3.getDataLocacao() + " ATÉ " + locacao3.getDataDevolucao());
        System.out.println(locacao4.getVeiculo().getModelo() + " DE " + locacao4.getDataLocacao() + " ATÉ " + locacao4.getDataDevolucao());
        System.out.println(locacao5.getVeiculo().getModelo() + " DE " + locacao5.getDataLocacao() + " ATÉ " + locacao5.getDataDevolucao());
        System.out.println(locacao6.getVeiculo().getModelo() + " DE " + locacao6.getDataLocacao() + " ATÉ " + locacao6.getDataDevolucao());
    }
}