public abstract class KendaraanListrik implements KonsumsiEnergi {
    protected String nama;
    protected double kapasitasBaterai;
    protected double dayaSaatIni;
    protected double kecepatanPengisian;

    public KendaraanListrik(String nama, double kapasitasBaterai, double dayaSaatIni, double kecepatanPengisian) {
        this.nama = nama;
        this.kapasitasBaterai = kapasitasBaterai;
        this.dayaSaatIni = dayaSaatIni;
        this.kecepatanPengisian = kecepatanPengisian;
    }

    public String getNama() {
        return nama;
    }

    public abstract double hitungWaktuPengisian();

    @Override
    public double hitungEnergiDibutuhkan() {
        return kapasitasBaterai - dayaSaatIni;
    }
}