class Main {
    public static void main(String[] args) {
    int[]arr ={5,6,7,8};
    int[]arr1={1,4,6,8,21};
    for (int i=0;i<arr.length;i++)
    {
        int count=0;
        for(int j=0;j<arr1.length;j++)
        {
            if(arr[i]==arr1[j])
            {
                count=count+1;
            }
        }
        if(count==0)
        {
            System.out.println(arr[i]+" ");
        }
    }
    }
}
