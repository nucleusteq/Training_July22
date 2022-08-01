class Consumer extends Thread {
   private CubbyHole cubbyhole;
   public Consumer(CubbyHole c) {
      cubbyhole = c;
   }
   public void run() {
      int value = 0;
      for (int i = 0; i < 50; i++) {
         value = cubbyhole.get();
         System.out.println("Consumer" + " got: " + value);
      }
   }}