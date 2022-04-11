public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Nama    : Muhammad Hafizh Adhyaksa");
        System.out.println("NIM     : 215150707111019");

        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Basko Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant
                .tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));

        Merchant merchant = new Merchant();

        System.out.print("Nama Merchant: ");
        merchant.setNamaMerchant(DataMerchant.in.nextLine());
        System.out.print("Nama Produk: ");
        merchant.setNamaProduk(DataMerchant.in.nextLine());
        System.out.print("Harga Makanan: ");
        merchant.setHargaMakanan(DataMerchant.in.nextDouble());

        DataMerchant.merc = DataMerchant.tambahMerchant(merchant);

        DataMerchant.tampilData();

    }
}

