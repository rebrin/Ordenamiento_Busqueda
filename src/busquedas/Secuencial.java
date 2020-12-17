package busquedas;
import java.util.*;
public class Secuencial {

    int [] data;
    //para listas no ordenadas.

    public Secuencial(int N){
        data=new int[N];
        Scanner s=new Scanner(System.in);
        Random r=new Random();
        for (int i = 0; i < data.length; i++) {
            data[i]=r.nextInt(N);
        }

        System.out.println(Arrays.toString(data));
        System.out.println("el elemento a buscar?");
        int buscado=s.nextInt();
        System.out.println("el elemento "+buscado+" esta en la pos:"
                +bSecuencial(buscado));
    }

    public int bSecuencial(int el){
        for (int i = 0; i < data.length; i++) {
            if(data[i]==el){
                return i;
            }
        }
        return -1;
    }
    public int bSecuencial(int el,int pos){
        for (int i = pos; i < data.length; i++) {
            if(data[i]==el){
                return i;
            }
        }
        return -1;
    }
}
