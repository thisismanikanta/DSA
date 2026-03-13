class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> arr=new ArrayList<>();
         for(int i=0;i<numRows;i++){
            ArrayList<Integer> li=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0  || j==i){
                    li.add(1);
                }
                else{
                   li.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
                
            }
            arr.add(li);
         }
         return arr;
    }
}
