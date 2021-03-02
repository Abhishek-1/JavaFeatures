package closures;

public class ClosureWithAIC {

    public static void main(String args[]){
      int x = 10;
      //The value of b is freezed and passed around
      int b = 20;
      doProcess(x, new Process() {
        @Override
        public void process(int i) {
          System.out.println(i + b);
        }
      });
    }

    public static void doProcess(int i, Process p){
      p.process(i);
    }
}

