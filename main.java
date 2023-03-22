package Ss4;

import java.util.Random;
 class Main {

    public static void main(String[] args) {
        int[] arr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000);
        }

        StopWatch stopwatch = new StopWatch();
        selectionSort(arr);
        stopwatch.stop();
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + "ms");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
     public static class StopWatch {
         private long startTime;
         private long endTime;

         public StopWatch() {
             startTime = System.currentTimeMillis();
         }

         public long getStartTime() {
             return startTime;
         }

         public long getEndTime() {
             return endTime;
         }

         public void start() {
             startTime = System.currentTimeMillis();
         }

         public void stop() {
             endTime = System.currentTimeMillis();
         }

         public long getElapsedTime() {
             return endTime - startTime;
         }
     }

 }


