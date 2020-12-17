package busquedas;

import java.util.*;

public class BusquedaBinaria {

    int [] data;
    public BusquedaBinaria(int N){
        Scanner s=new Scanner(System.in);
        Random r= new Random();
        data=new int[N];
        for (int i = 0; i < N; i++) {
            data[i]=r.nextInt(N*N);
        }

       // System.out.println(Arrays.toString(data));
        //ordenar la coleccion
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        System.out.println("buscado?");
        int buscado=s.nextInt();
        System.out.println(binarySearch(buscado,0, data.length));
    }

    public int binarySearch(int v, int min, int max){
        if(min>max)
            return -1;
        else {
            int mitad=(min+max)/2;
            if(data[mitad]==v)
                return mitad;
            else if(v<data[mitad])
                return binarySearch(v,min,mitad-1);
            else
                return binarySearch(v,mitad+1,max);
        }
    }

}
