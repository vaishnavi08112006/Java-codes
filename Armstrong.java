public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        int original=n;
        int temp=n;
        int count=0;
        while(temp>0){
            temp=temp/10;
        }
        temp=n;
        int sum=0;
        while(temp>0){
            int digit= temp%10;
            sum+=(int) Math.pow(digit,count);
            temp=temp/10;
        }
        if(sum==original)
        System.out.println("Armstrong number");
        else
        System.out.println("Not an Armstrong number");
    }
}
