public class Queue {

    private int front=0;
    private int rear=-1;
    private int[] arr = new int[4];
    private int size=0;
    public void enqueue(int i) {
         rear=(rear+1)%4;
         arr[rear]=i;
         size++;
    }

    public int dequeue(){
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public void print(){
        for(int n=0;n<size;n++){
            System.out.print(arr[n]+" ");
        }
        System.out.println();
    }
}
