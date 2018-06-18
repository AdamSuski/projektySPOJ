import java.util.Scanner;
public class Liczby {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int licznik = scan.nextInt();
        if (licznik>100000 || licznik<0)
            throw new IllegalArgumentException();

        int[] tabela= new int[licznik];

        for (int i=0; i<tabela.length; i++){
            int pom=scan.nextInt();
            if(pom<10001 && pom>0)
                tabela[i]=pom;
            else
                throw new IllegalArgumentException();
        }

        for (int i=0; i<tabela.length; i++){
            if(tabela[i]==2)
                System.out.println("TAK");
            if(tabela[i]==1)
                System.out.println("NIE");
            else if(tabela[i]%2==0)
                System.out.println("NIE");
            else if(tabela[i]==3)
                System.out.println("TAK");
            else if(tabela[i]==5)
                System.out.println("TAK");
            else if(tabela[i]==7)
                System.out.println("TAK");
            else if(tabela[i]%3==0 || tabela[i]%5==0 || tabela[i]%7==0)
                System.out.println("NIE");
            else
                System.out.println("TAK");
        }
    }
}