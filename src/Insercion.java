import java.util.Arrays;
import java.util.Random;

public class Insercion {
    final int N=1000000;
    int[] data=new int[N];
    public Insercion(){
        Random r=new Random();
        for(int i=0;i<N;i++) {
            data[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(insSort(data)));
    }

    public int[] insSort(int [] data){
        for(int i=1;i<data.length;i++){
            int el=data[i];
            int j=i;
            while(j>0 && data[j-1]>el){
                data[j]=data[j-1];
                j--;
            }
            data[j]=el;
        }
        return data;
    }
}
