class hewan {
    String color;
    String storage;

    public void berjalan() {System.out.println(" hewan jenis " + this.color + " berjalan. ");}
    public void terbang() {System.out.println(" hewan jenis " + this.color + " terbang. ");}

    public static void main(String[] args) {
        hewan anjing = new hewan();
        hewan kucing = new hewan();
        hewan burung = new hewan();

        anjing.color = "anjing";
        kucing.color = "kucing";
        burung.color = "burung";


        anjing.storage = "64GB";
        kucing.storage = "128GB";
        burung.storage = "512GB";
    
        System.out.println();
        anjing.berjalan();
        kucing.berjalan();
        burung.terbang();
        System.out.println();
    }
}