// *     *
// *   *
//  * *
//   *
//  * *
// *   *
// *     *
class P75{
    public static void main(String[] args) {
        int count=8;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=count-i; k++){
                int count1=count-i;
                if(k==1 || k==count1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }
        for(int i=1; i<=3; i++){
            for(int j=3; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i+1; k++){
              int count2=2*i+1;
                if(k==1 || k==count2){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}