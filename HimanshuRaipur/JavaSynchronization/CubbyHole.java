class Shop
{
      private int materials;
      private boolean available = false;
      public synchronized int get()
      {
            while (available == false)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException e)
                  {
                  }
            }
            available = false;
            notifyAll();
            return materials;
      }
      public synchronized void put(int value)
      {
            while (available == true)
            {
                  try
                  {
                        wait();
                  }
                  catch (InterruptedException e)
                  {
                        e.printStackTrace();
                  }
            }
            materials = value;
            available = true;
            notifyAll();
      }
}