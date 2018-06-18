package spoj.dwumiannewtona;

public class Newton {

    private int newtonRekurencja(int x){
        if (x==1)
            return 1;
        return x*newtonRekurencja(x-1);
    }

    public Newton(){}


    public int dwumianNewtona(int n, int k){
        int wynik = newtonRekurencja(n)/(newtonRekurencja(k)*newtonRekurencja(n-k));

        return wynik;
    }
}
