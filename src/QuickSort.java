import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    final int N=1000;
    int[] data=new int[N];
    public QuickSort(){
        Random r=new Random();
        for(int i=0;i<N;i++){
            data[i]=r.nextInt(N*2);
        }

        //System.out.println(Arrays.toString(data));
        quick(data,0, data.length-1);
        System.out.println(Arrays.toString(data));
    }


    public void quick(int[] data,int wall,int pivot){
        if(pivot<=wall) return;
            //tomar el pivot
            int current=wall;
            while (current<pivot) {

                //si es menor intercambio por wall e incremento wall
                if (data[pivot] >= data[current]) {
                    int tmp = data[wall];
                    data[wall] = data[current];
                    data[current] = tmp;
                    wall++;
                }
                current++;
            }
            //intercambio pivot por el primer elemento despues de wall
            int tmp=data[wall];
            data[wall]=data[pivot];
            data[pivot]=tmp;
            //llamada rec
            quick(data,0,wall-1);
            quick(data,wall+1,pivot);
        }
    }


