import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    final int N=10;
    int [] data=new int[N];

    public SelectionSort(){
        Random r=new Random();
        for(int i=0;i<N;i++){
            data[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(selSort(data)));
    }

    public int[] selSort(int[] data){
        int i,j,menor;
        for(i=0;i< data.length-1;i++){
            for(j=i+1,menor=i;j<data.length;j++){
                if(data[j]<data[menor]){
                    menor=j;
                }
            }
            if(menor!=i){
                int tmp=data[i];
                data[i]=data[menor];
                data[menor]=tmp;
            }
        }

        return data;
    }
}
