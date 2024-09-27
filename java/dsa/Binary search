//working of binary search
class HelloWorld {
    public static void main(String[] args) {
        // int[] arr = new int[31];
        // for(int i = 10; i<arr.length;i++) {
        //     arr[i] = i;
        // }
        int[] arr = {1,34,55,67,68,71,72,78,87,91};
        int start = 0,end = arr.length - 1, target = 72, mid = 0;
        boolean isFound  = false;
        
        while(start <=end) {
            mid = start +(end -start) /2;
            if(target > arr[mid]) {
               System.out.println("If 1'st"); 
               System.out.println("start : "+start); 
               System.out.println("Mid : "+ mid); 
                start = mid + 1;
               System.out.println("start after : "+start); 
               System.out.println(); 
            } else if(target < arr[mid]){
               System.out.println("If 2'nd"); 
               System.out.println("end : "+end); 
               System.out.println("Mid : "+ mid); 
                end = mid - 1;
               System.out.println("end after : "+end); 
               System.out.println(); 
            } else {
                isFound  = true;
                break;
            }
        }
            if(isFound) {
               System.out.print("Value found ! " + mid); //arr[mid]
            } else {
               System.out.print("Value-NOT found ! "); 
                
            }
    }
}
//OUTPUT 
If 1'st
start : 0
Mid : 4
start after : 5

If 2'nd
end : 9
Mid : 7
end after : 6

If 1'st
start : 5
Mid : 5
start after : 6

Value found ! 6

//Binary search
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = new int[31];
        for(int i = 0; i<arr.length;i++) {
            arr[i] = i;
        }
        // int[] arr = {1,34,55,67,68,71,72,78,87,91};
        int start = 0,end = arr.length - 1, target = 14, mid = 0;
        boolean isFound  = false;
        
        while(start <=end) {
            mid = start +(end -start) /2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                isFound  = true;
                break;
            }
        }
            if(isFound) {
               System.out.print("Value found ! " + mid); //arr[mid]
            } else {
               System.out.print("Value-NOT found ! "); 
                
            }
    }
}

//Binary Search for both ascending and Decending
class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {1,34,55,67,68,71,72,78,87,91}; // Ascending order
        // int[] arr = {99,98,87,65,54,43,32,21,12}; // Descending order
        int start = 0, end = arr.length - 1, target = 5, mid = 0;
        boolean isFound = false;
        boolean isDec = arr[start] > arr[end]; // Check if array is descending
        
        while(start <= end) {
            mid = (start + end) / 2; // Update mid point
            
            if(arr[mid] == target) {
                isFound = true;
                break; // Break loop once the target is found
            }
            
            if(isDec) { // Binary search for descending array
                if(target > arr[mid]) {
                    end = mid - 1; // Move left
                } else {
                    start = mid + 1; // Move right
                }
            } else { // Binary search for ascending array
                if(target < arr[mid]) {
                    end = mid - 1; // Move left
                } else {
                    start = mid + 1; // Move right
                }
            }
        }
        
        if(isFound) {
            System.out.println("Value Found! " + mid);
        } else {
            System.out.println("Value Not Found!");
        }
    }
}

