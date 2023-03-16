package org.example;

public class Test1 {

    public static void main(String args[]){

        //Sort the array withount using any colection.

        int[] arr1 = {5,8,9};
        int[] arr2 = {4,7,8};
        int size = arr1.length + arr2.length;

        int[] arr3 = new int[size];
        //Add elements of both arrays

       for(int i=0 ; i< arr1.length ;i++){
            arr3[i]= arr1[i];
        }

        for(int j=0 ; j < size ;j++){
            for(int x= arr1.length+j; x<size ;x++) {
                arr3[x] = arr2[j];
            }
        }

        /*for (int m=0 ; m<size ; m++) {
            System.out.println(arr3[m]);
        }*/
        //sort elements in arr3
        int tmp;
        for(int k=0 ; k<arr3.length ;k ++){
            for(int l=k+1 ; l<arr3.length ; l++){
                if(arr3[k] > arr3[l]){
                    tmp=arr3[l];
                    arr3[l] = arr3[k];
                    arr3[k]=tmp;
                }
            }
        }
        for (int m=0 ; m<size ; m++) {
            System.out.println(arr3[m]);
        }

    }

}
