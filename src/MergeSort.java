import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    final int N=10;
    int [] data=new int[N];

    public MergeSort(){
        Random r=new Random();
        for(int i=0;i<N;i++){
            data[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(mergeSort(data)));

    }

    public int[] mergeSort(int[] data){
        if (data.length==1){
            return data;
        }
        int mitad= data.length/2;
        return merge(mergeSort(Arrays.copyOfRange(data,0,mitad)),
                mergeSort(Arrays.copyOfRange(data
                        ,mitad,data.length)));

    }


    public int[] merge(int[] data1,int data2[]){
        int[] data3=new int[data1.length+data2.length];
        int i1=0,i2=0,i3=0;
        while(i1<data1.length && i2<data2.length){
            if(data1[i1]<data2[i2]){
                data3[i3++]=data1[i1++];
            }else
                data3[i3++]=data2[i2++];
        }
        if(i1<data1.length){//cargar los elementos de data1 en data3
            for(int i=i1;i<data1.length;i++){
                data3[i3++]=data1[i];
            }
        }
        if(i2<data2.length){//cargar los elementos de data2 en data3
            for(int i=i2;i<data2.length;i++){
                data3[i3++]=data2[i];
            }
        }
        return data3;
    }
}
