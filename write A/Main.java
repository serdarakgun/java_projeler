public class Main {
    public static void main(String[] args){
        char[][] array = new char[5][11];
        for(int i=0;i<5;i++){
            for(int j=0;j<11;j++){
             if(i==0){
                 array[i][11/2]='*';
             }
             else if(i!=2){
                array[i][11/2-i]='*';
                array[i][11/2+i]='*';
             }
             else{
                 for(int a=11/2-i;a<=11/2+i;a++){
                     array[i][a]='*';
                 }
             }

            }
        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<11;j++){
                if(array[i][j]!='*'){
                    array[i][j]=' ';
                }
            }

        }
        for(int i=0;i<5;i++) {
            for(int j=0;j<11;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

}
