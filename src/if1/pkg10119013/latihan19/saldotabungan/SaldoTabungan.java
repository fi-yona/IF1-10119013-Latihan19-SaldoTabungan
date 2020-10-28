/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan19.saldotabungan;

/**
 *
 * @author Fiona Avila
 */


public class SaldoTabungan {
    
    double bunga = 0.15;
    
    public double hitungSaldo(){
        int i;
        int awal = 2500000;
        double besarBunga;
        for (i=1;i<=6;i++){
            besarBunga = awal * bunga;
            awal = (int) (awal + besarBunga);
            System.out.println("Saldo pada bulan ke-" + i + " Rp " + awal);
        }
        return awal;
    }
    
    public static void main(String[] args) {
        SaldoTabungan tabungan = new SaldoTabungan();
        tabungan.hitungSaldo();
    }
    
}
