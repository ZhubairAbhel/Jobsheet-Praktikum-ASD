package pertemuan_10.tugas.no2;

public class Queue {
    Mahasiswa[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        data = new Mahasiswa[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nim + " " + data[front].nama + " "
                    + " " + data[front].absen + " " + data[front].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].nim + " " + data[i].nama + " "
                + " " + data[i].absen + " " + data[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " "
            + " " + data[i].absen + " " + data[i].ipk);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Mahasiswa dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
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

    public Mahasiswa Dequeue() {
        Mahasiswa dt = new Mahasiswa();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Elemen terbelakang: " + data[rear].nim + " " + data[rear].nama + " "
                    + " " + data[rear].absen + " " + data[rear].ipk);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekPosition(String dataDicari) {
        int i = front;
        int posisi = 1;
        System.out.print("data " + dataDicari + " ada pada posisi : ");
        while(i != rear) {
            if (data[i].nim.equals(dataDicari)){
                System.out.print(posisi + " ");
            }
            i = (i+1) % max;
            posisi++;
        }
        if (data[i].nim.equals(dataDicari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void printMahasiswa(int position) {
        int idxDicari = front;
        System.out.print("Data pada posisi " + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idxDicari = (idxDicari + 1) % max;
        }

        System.out.println(data[idxDicari].nim + " " + data[idxDicari].nama + " "
        + " " + data[idxDicari].absen + " " + data[idxDicari].ipk);
    }
}
