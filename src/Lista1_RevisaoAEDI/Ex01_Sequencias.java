package Lista1_RevisaoAEDI;
import java.util.Scanner;
public class Ex01_Sequencias {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int n, m;
        boolean cres = true;

        System.out.print("Informe o numero maior que 1 para n: ");
        n = tec.nextInt();

        while (n<=1){
            System.out.println("N DEVE SER MAIOR QUE 1");
            System.out.print("Informe o numero maior que 1 para n: ");
            n = tec.nextInt();
        }

        System.out.print("Informe o valor de m: ");
        m = tec.nextInt();

        for(int aux = 0; aux < m; aux++){
            if (cres){
                for(int x = 0; x <= n; x++){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            else{
                for (int x = n; x >= 0; x--){
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            cres = !cres;
        }
        tec.close();
    }
}
