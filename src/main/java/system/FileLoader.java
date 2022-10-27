package system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.swing.*;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class FileLoader {

   private static final Logger log = LoggerFactory.getLogger(FileLoader.class);

   private CyclicBarrier barrier;

   public FileLoader(CyclicBarrier bar){
       this.barrier = bar;
   }

   public void loadLibrary(JProgressBar bar){
       new Thread(() -> {
           for (int i = 1; i < 100; i++){
               try {
                   Thread.sleep(50);
                   bar.setValue(i + 1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           try {
               barrier.await();
           } catch (InterruptedException e) {
               e.printStackTrace();
           } catch (BrokenBarrierException e) {
               e.printStackTrace();
           }
       })
               .start();
   }


   public void loadSound(JProgressBar bar){
       new Thread(() -> {
           for (int i = 1; i < 100; i++){
               try {
                   Thread.sleep(100);
                   bar.setValue(i + 1);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           try {
               barrier.await();
           } catch (InterruptedException e) {
               e.printStackTrace();
           } catch (BrokenBarrierException e) {
               e.printStackTrace();
           }
       })
               .start();
   }
}







