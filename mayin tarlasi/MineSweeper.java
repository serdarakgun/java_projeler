import java.util.Random;

public class MineSweeper {

    int row;
    int col;
    int mineNumber;
    int mineLoc;
    int mineCount;
    String[][] answer;
    String[][] user;

    MineSweeper(int row, int col){
        this.row=row;
        this.col=col;
        this.user=new String[row][col];
        this.answer=new String[row][col];
        newGame();

    }

    private void newGame(){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                user[i][j]="-";
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                answer[i][j]="-";
            }
        }

        mineNumber=this.col*this.row/4;
        Random var = new Random();
        for(int i=0;i<mineNumber;i++){
            mineLoc= var.nextInt(row*col);
            if(answer[mineLoc/col][mineLoc%row].equals("*")){
                i--;
            }
            else{
                answer[mineLoc/col][mineLoc%row]="*";
            }

        }


        //end of mine insertion of the answers
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                mineCount=0;
                if(!answer[i][j].equals("*")){
                    for(int upper=j-1;upper<j+2;upper++){

                        if(upper>=0&&upper<col&&(i-1)>=0){
                            if(answer[i-1][upper].equals("*")){
                                mineCount++;
                            }
                        }
                    }
                    for(int lower=j-1;lower<j+2;lower++){

                        if(lower>=0&&lower<col&&(i+1)<row){
                            if(answer[i+1][lower].equals("*")){
                                mineCount++;
                            }
                        }
                    }
                    if(j-1>=0 && answer[i][j-1].equals("*")){
                        mineCount++;
                    }
                    if((j+1)<col&&answer[i][j+1].equals("*")){
                        mineCount++;
                    }
                    answer[i][j]=Integer.toString(mineCount);
                }
            }
        }
            //end of answer array
        System.out.println();
            print(user);
        System.out.println("============================");
    }
    public boolean userChoice(int row,int col){

       if(answer[row][col].equals("*")){
           System.out.println("OYUNU KAYBETTİNİZ");
           System.out.println();
           print(answer);
           return false;
       }

       else{
           user[row][col]=answer[row][col];
           boolean control=true;
           for(int i=0;i<this.row;i++){
               for(int j=0;j<this.col;j++){
                   if(answer[i][j].equals("*")){
                       continue;
                   }
                   if(!user[i][j].equals(answer[i][j])){
                       control=false;
                       break;
                   }

               }
           }
           if(control){
               System.out.println("OYUNU KAZANDINIZ");
               System.out.println();
               print(user);
               System.out.println("============================");
               print(answer);
               return false;
           }
           print(user);
           return true;
       }


    }
    public void print(String[][] array){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
