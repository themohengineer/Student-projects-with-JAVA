/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohamad
 */
public class Class_MUX {

   public Boolean a;
   public Boolean b;
   public Boolean c;
   public Boolean d;
   public Boolean s1;
   public Boolean s0;
   public Boolean en;
   public Boolean output;

   public Class_MUX() {
      a = false;
      b = false;
      c = false;
      d = false;
      s1 = false;
      s0 = false;
      en = false;
      output = false;
   }

   public void execute() {
      output = en & (!s1 & !s0 & a | !s1 & s0 & b | s1 & !s0 & c | s1 & s0 & d);
   }

}
