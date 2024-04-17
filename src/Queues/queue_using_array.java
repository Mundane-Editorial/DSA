package Queues;

public class queue_using_array {
    public static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear==-1;
        }

        //ENQUEUE
        public static void add(int data){
            if(rear == size-1){
                System.out.println("queue full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //DEQUEUE - O(n)  -- more time complexity
        public static int remove()
        {
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        //pEEK
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return arr[0];
        }
    }

    static public void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
}
