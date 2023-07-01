package sequality;

public class Calculate{
  public int sum(int x, int y){
    return x + y;
  }

  public double average(int sum, int n){
    return (double)sum / n;
  }

  public int sumTo(int start, int end){
    int sum = 0;
    for(int i=start;i<=end;i++){
      sum += i;
    }
    return sum;
  }

  public int odd(int start, int end){
    int odd = 0;
    for(int i=start;i<=end;i++){
      if(i%2 != 0){
        odd += i;
      }
    }
    return odd;
  }

    public int even(int start, int end){
    int even = 0;
    for(int i=start;i<=end;i++){
      if(i%2 == 0){
        even += i;
      }
    }
    return even;
  }
}
