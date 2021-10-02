package DSA.Sorting;

public class basicSort {
    static void selectionSort(int a[])
    {
        int n =a.length;
        for (int i=0;i<n-1;i++)
        {
            for (int j=i+1; j<=n-1;j++)
            {
                if (a[i]>a[j])
                {
                    Swap.swap(a,i,j);
                }
            }
            for (int temp : a) {
                System.out.print(temp+" ");

            }
            System.out.print("\n");
        }

    }
    static void insertionSort(int a[])
    {
        int i, j,temp; //
        for (i=1;i<a.length;i++)// vòng lặp chạy từ phần tử thứ 2 vì coi phần tử đầu tiên đã được sắp xếp
        {
            temp=a[i];// lưu giữ phần tử đang xét
            j=i-1;// chỉ số để duyệt ngược lại các phần từ ở phần đã sắp xếp
            while(j>=0 && a[j]>temp)// đến khi gặp phần tử lớn hơn phần tử a[i]= temp đang xét
            {
                a[j+1]=a[j];//
                j=j-1;//
            }
            a[j+1]=temp; // trả lại giá trị đã lưu trữ vào vị trí j+1 ( j alf vị trí dừng vòng lặp while)
            for (int k : a ) {
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }

    }
    static void bubbleSort(int a[])
    {
        int n =a.length;
        for( int i=0; i<n-2;i++)
        {
            for (int j=n-1;j>i;j--)
            {
                if (a[j]<a[j-1])
                    Swap.swap(a,j,j-1);
            }
            for (int k : a ) {
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }

    }
    static void bubbleSort2(int a[])
    {
        int n= a.length;
        for(int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (a[j]>a[j+1])
                    Swap.swap(a,j,j+1);
            }
            for (int k : a ) {
                System.out.print(k+" ");
            }
            System.out.print("\n");
        }

    }
}
