import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        int[] list={1,1,2,3,4,4,6,6,8,8};
        ArrayList<Calc> repeated= new ArrayList<>();

        for(int x : list){
            if(x%2==0){
                boolean control =true;
                for (Calc y: repeated) {
                    if(x==y.number){
                        y.times++;
                        control=false;
                        break;
                    }
                }
                if(control){
                    Calc temp=new Calc(x,1);
                    repeated.add(temp);
                }
            }

        }
        for (Calc a:repeated){
            if(a.times>1){
            System.out.println(a.number);
            }

        }
    }
}
