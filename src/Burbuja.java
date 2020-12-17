import java.util.ArrayList;
import java.util.Arrays;

public class Burbuja {
    Alumno[] data=new Alumno[5];
    ArrayList <Alumno> al=new ArrayList<>();

    Burbuja(){
        data[0]=new Alumno("rebrin",3);
        data[1]=new Alumno("alumno 2",2);
        data[2]=new Alumno("Alumno 3",1);
        data[3]=new Alumno("Alumno 4",5);
        data[4]=new Alumno("Alumno 5",4);

        System.out.println(Arrays.toString(bubble(data)));
    }

    public Alumno[] bubble(Alumno[] data) {
        for(int i=0;i< data.length-1;i++){
            for(int j=0;j< data.length-1;j++){
                if(data[j].compareTo(data[j+1])>0){
                    Alumno tmp=data[j];
                    data[j]=data[j+1];
                    data[j+1]=tmp;
                }
            }
        }
        return data;
    }
}
