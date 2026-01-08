class TribonacciSolution {
    public int tribonacci(int n) {
        if(n==0){
            return 0 ;
        }else if(n==1 || n==2){
            return 1 ;
        }else{
            int ft = 0;
            int st = 1;
            int tt = 1;

            for(int i = 1 ; i<= n ; i ++){
                int frt = ft + st + tt;
                ft = st ;
                st = tt ;
                tt = frt ;

            }
            return ft ;
        }
    }
}