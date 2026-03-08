public class q27 {
    public void season(int n){
        if(n>=3 && n<=5){
            System.out.println("Spring");
        }else if(n>=6 && n<=8){
            System.out.println("Summer");
            
        }else if(n>=9 && n<=11){
            System.out.println("Autumn");
         
        }else if(n>=12 || n<=2){
            System.out.println("Winter");
        
        }else{
            System.out.println("Enter correct month");
        }
    }
    public void main(String[] args){
        int input = 12;
        season(input);

    }
}
