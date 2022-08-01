class Producer extends Thread {
   private CubbyHole cubbyhole;
   public Producer(CubbyHole c) {
      cubbyhole = c;
   } 
   public void run() {
      for (int i = 0; i < 50; i++) {
         cubbyhole.put(i);
         System.out.println("Producer"  + " put: " + i);
         
      } 
   }
} 