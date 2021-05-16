public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> temp = new ArrayList<Integer>();
    int j=0;
    for(int i = a.size() - 1; i >= 0  ; i --){
        temp.add(j,a.get(i));
        j++;
    }
     return temp;
   
    }
