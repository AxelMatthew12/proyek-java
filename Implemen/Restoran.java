package Implemen;

public class Restoran {
    int[] data;
    int front, rear, size,max;
    
    public Restoran(int n) {
        max = n;
        data= new int[max];
        size = 0;
        front = rear = -1;
    }
    public boolean Isempty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void peek() {
        if (!Isempty()) {
            System.out.println("Antrian terdepan: "+data[front]);
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void print() {
        if (Isempty()) {
            System.out.println("Antrian masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i]+ " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah Antrian = "+ size);
        }
    }
    public void clear() {
        if (!Isempty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }
    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            if (Isempty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }
    public int Dequeue() {
        int dt = 0;
        if (Isempty()) {
            System.out.println("Antrian masih kosong");
        } else {
            dt = data[front];
            size--;
            if (Isempty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                }else {
                    front++;
                }
            }
        } 
        return dt;
    }
}

