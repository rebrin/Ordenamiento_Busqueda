package busquedas;

public class HashV1 {
    public final int N = 10007;
    String[] tabla = new String[N];

    public HashV1() {
        String[] names = {"David",
                "Jennifer",
                "Donnie", "Mayo",
                "Raymond", "Bernica",
                "Mike", "Clayton",
                "Beata", "Michael"};
        //añadir los elementos dentro de la tabla
        for (String nombre : names
        ) {
            tabla[hash(nombre)] = nombre;
        }
        //imprimir toda la tabla
        imprimir();
        System.out.println();
        System.out.println(recuperar("Clayton"));
    }

    public void imprimir() {
        for (String s : tabla
        ) {
            if (s != null) {
                System.out.println(s);
            }
        }
    }

    public String recuperar(String cad){
        return tabla[hash(cad)];
    }

  public int hash(String x){
      int suma=0;
        for (int i = 0; i < x.length(); i++) {
          suma+=13*suma+(int)x.charAt(i);
          suma=suma%N;
      }
        if(suma>0)
            suma+=N;
        return suma%N;
  }

}
