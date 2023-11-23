package khanh.stage;

public class Sorting {
    public static void main(String[] args) {
        sortPrimitiveV2();
    }

    public static void sortPrimitiveV2() {
        int[] arr = new int[]{1000, -20, -1000, 20, 30, 3};

        // Sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println("The array after sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
        }

    }


    public static void sortPrimitive() {
        int[] arr = new int[]{1000, -20, -1000, 20, 30, 3};
        //                     [0]  [1]    [2]  [3] [4] [5]
        //                    1000 > -20
        //                     -20  1000    đổi ko  ko  ko
        //                    -1000 1000 >  -20
        //                    -1000 -20    1000 20
        // Sắp xếp tăng dần
        System.out.println("The array before sorting ascending");
        for (int x : arr) {
            System.out.println(x + "\t");
            /*
                Sắp xếp tăng dần: thằng trước phải < thằng, bất kì vị trí trên mảng
                if (thằng trước > thằng sau) -> swap
                tao cần vị trí [0] mày phải nhỏ nhất trong cả đám phần tử
                lấy tao [0] đi so với tất cả phần tử còn lại, nếu if ko ổn thì đổi
             */
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[0] > arr[i]) {
                int tmp = arr[0];
                arr[0] = arr[i];
                arr[i] = tmp;
            }
        }

        for (int x : arr) {
            System.out.println(x + "\t");
        }
        // -1000 1000 -20 20 30 3
        // -1000 -20 1000 20 30 3
        for (int i = 2; i < arr.length; i++) {
            if (arr[1] > arr[i]) {
                int tmp = arr[1];
                arr[1] = arr[i];
                arr[i] = tmp;
            }
        }
        System.out.println("The array after sorting");

        for (int x : arr) {
            System.out.println(x + "\t");
        }
    }
}
