public class Sort {

    public static void main(String[] args) {
        int[] a ={1,2,3,6,5,8,10,9};

        for (int i =0; i<a.length; i++){
            for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    int tmp = a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }

        for(int i: a){
            System.out.println(i);
        }

    }
}
