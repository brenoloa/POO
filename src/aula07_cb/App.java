package aula07_cb;

public class App {
    public static void main(String[] args) {
        Carro[] CARRO = new Carro[10];
        Moto[] MOTO = new Moto[10];
        // BASE DE DADOS///////////////////////////////////////////////////////////
        CARRO[0] = new Carro("BMW", "i320", 2020, 7650, 210000);
        CARRO[2] = new Carro("Mercedes-Benz", "C200", 2021, 5400, 230000);
        CARRO[3] = new Carro("Ford", "Mustang", 2018, 15000, 250000);
        CARRO[4] = new Carro("Chevrolet", "Camaro", 2022, 3000, 280000);
        CARRO[5] = new Carro("Toyota", "Corolla", 2020, 8500, 95000);
        CARRO[6] = new Carro("Honda", "Civic", 2017, 18000, 90000);
        CARRO[7] = new Carro("Volkswagen", "Golf", 2019, 12000, 105000);
        CARRO[8] = new Carro("Porsche", "911", 2021, 5000, 550000);
        CARRO[9] = new Carro("Tesla", "Model 3", 2023, 1000, 320000);
        CARRO[1] = new Carro("Audi", "A4", 2019, 12000, 180000);
        MOTO[0] = new Moto("HONDA", "CB600R", 2023, 2435, 43000);
        MOTO[1] = new Moto("Yamaha", "MT-09", 2022, 3500, 48000);
        MOTO[2] = new Moto("Suzuki", "GSX-R750", 2021, 2200, 52000);
        MOTO[3] = new Moto("Kawasaki", "Ninja 650", 2020, 4500, 39000);
        MOTO[4] = new Moto("Ducati", "Panigale V4", 2023, 1500, 150000);
        MOTO[5] = new Moto("Triumph", "Street Triple", 2021, 3800, 45000);
        MOTO[6] = new Moto("Harley-Davidson", "Iron 883", 2019, 6000, 60000);
        MOTO[7] = new Moto("BMW", "S1000RR", 2022, 2700, 120000);
        MOTO[8] = new Moto("KTM", "Duke 390", 2020, 5000, 33000);
        MOTO[9] = new Moto("Aprilia", "RSV4", 2021, 3000, 135000);
        //BASE DE DADOS //////////////////////////////////////////////////////////



        CARRO[0].negociar_valor(203500);
        CARRO[0].detalhes();
        System.out.println();
        MOTO[0].vender();
        MOTO[0].detalhes();
    }
}
