public class rekursif {
    public static void main(String[] args) {
        System.out.println("rekursif");

        public int faktorial (int i){
            if (i<0){
                return 0;
            }
            if (i==1 || i==0 ){
                return 1;
            }
            return i * faktorial (i -1);
        }
    }
}
