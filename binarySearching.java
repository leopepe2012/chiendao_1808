package DSA.Sorting;

import java.util.Collections;

public class binarySearching {
    static int  binarySearching(int a[], int n, int x)
    {
         int left=0;
         int right=n;
         int mid= 0;
         int count=0;
         while(left<=right) {
             count++;
             System.out.println("Lần :"+count);
             mid = (left + right) / 2;
             if (a[mid] > x) right = mid - 1;
             else if (a[mid] < x) left = mid + 1;
             else return a[mid];
         }
         return -1; // nếu không tìm thấy
    }
    static int binarySearching_Extra(int a[], int n, int x)
    {
        int left=0; int right=n;
        while(left<right)
        {
            int mid=(left+right)/2;
            if(a[mid]>x) right=mid;
            else if(a[mid]<x) left=mid+1;
            else if (a[mid]==x) return a[mid+1];
        }
        return a[left];
    }
    public static void main(String[] args) {
        int A[]={57,94,56,77,50,30,29,28,27,26};

        quickSort.quickSort(A,0, A.length-1);
        //mergeSort.mergeSort(A,0,A.length-1);
//        for (int x:A) {
//            System.out.print(x+" ");
//        }
      int kq =  binarySearching(A, A.length-1,94);
     //   int kq= binarySearching_Extra(A, A.length-1, 10);
        System.out.println("\n"+kq);

    }
}
