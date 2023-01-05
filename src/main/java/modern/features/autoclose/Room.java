package modern.features.autoclose;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{


   private static class State implements Runnable {
       int numJunkPiles; // Number of junk piles in this room

       State(int numJunkPiles) {
           this.numJunkPiles = numJunkPiles;
       }

       // Invoked by close method or cleaner
       @Override
       public void run() {
           System.out.println("Cleaning room");
           numJunkPiles = 0;
       }
   }

    private final State state;
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles){
        state = new State(numJunkPiles);
        this.cleanable = Cleaner.create().register(this, state);

    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
}
