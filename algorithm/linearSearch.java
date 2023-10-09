class linearSearch{
    public static void main(String[] args){
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
        int key = 1;
        int index = linearSearch(array, key);
        System.out.print(index);
    }
    private static int linearSearch(int[] array, int key){
        for(int i=0; i< array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return 0;
    }
}