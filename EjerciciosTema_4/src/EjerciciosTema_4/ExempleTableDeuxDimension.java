package EjerciciosTema_4;

public class ExempleTableDeuxDimension {
    public static void main(String[] args) {
        int [][] tabla = new int [2][3];
        int numeo=0;
        for (int i=0; i<tabla.length;i++){

            for (int j=0; j<tabla[i].length; j++){

                numeo=tabla[i][j]*5;
                tabla[i][j]=5*1;
            }
        }
        for (int i=0; i<tabla.length;i++){

            for (int j=0; j<tabla[i].length; j++){
                System.out.println(tabla[i][j]);
                System.out.println("test: "+numeo);
            }
        }
    }
}
