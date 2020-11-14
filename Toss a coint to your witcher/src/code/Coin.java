package code;

import java.util.Random;

public class Coin {
   private Random rand;
   private Face face;

   Coin(Face newFace){
      setFace(newFace);
      rand = new Random();
   }

   public final Face getFace() {
      return face;
   }

   public final void setFace(Face newFace) {
    this.face = face == null ? Face.TAIL : newFace;
   }

   public void flip(){
      face = rand.nextBoolean() ? Face.HEAD : Face.TAIL;
   }

   public boolean isHeads(){
      return  (face == Face.HEAD);
   }

   @Override
   public String toString() {
      return face.toString();
   }
}
