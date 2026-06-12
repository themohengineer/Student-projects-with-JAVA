package multiplication_of_polynomials;

import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.*;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


public class Mul_polynomials {





       private Monomial head;
       private int TOLERANCE = 0;





    /******************  the  Monomial (inner) class   ********************************/

       private class Monomial
       {
          private DecimalFormat precision = new DecimalFormat("#.####");
          private int deg;     // degree of polynomial
          private int coeff; // coefficients
          private Monomial next; // Pointer to next term


          public Monomial(int coeff, int deg, Monomial next)
          {
             this.coeff = coeff;    //coefficient
             this.deg = deg;        // Degree
             this.next = next;      // Pointer
          }
          public String toString()
          {
             String form = precision.format(Math.abs(coeff));

             if(deg == 0) return form ;
             else
             if(deg == 1) return form + "x";
             else
             return form +"x^" + deg;
          }
          public boolean equals(Monomial mono)
          {
             return coeff == mono.coeff && deg == mono.deg;
          }

       }

    //*********************************************************************************************

       public Mul_polynomials()
       {
          head = null;
       }

     /***************************************************************************
       *  Adds a new term into the polynomial, assuming that the polynomial
       *  is sorted in order from smallest to largest exponent.
     **************************************************************************/
       public void addTerm(int coeff, int deg)
       {
          if( Math.abs(coeff) < TOLERANCE ) return;

          if( head == null || deg < head.deg )
          {
             head = new Monomial(coeff, deg, head);
             return;
          }

          Monomial cur = head;
          Monomial prev = null;

          while( cur != null && deg > cur.deg)
          {
             prev = cur;
             cur = cur.next;
          }
          if( cur == null || deg != cur.deg )
                prev.next = new Monomial(coeff, deg, cur);
          else
          {
             cur.coeff += coeff;
             if( Math.abs(cur.coeff) < TOLERANCE )
               if(prev != null)
                   prev.next = cur.next;
                else
                   head = head.next;
          }
       }

       public String toString()
       {
          StringBuffer sb = new StringBuffer();

          for(Monomial tmp = head; tmp != null; tmp = tmp.next)
            if(tmp.coeff < 0 )
               sb.append(" - " + tmp.toString());
            else
               sb.append(" + " + tmp.toString());

          return sb.toString();
       }

    //*********************************************************************************************


    /*********************************************************************************************

       *  Return the degree of this polynomial

     **********************************************************************************************/



    //*********************************************************************************************/



    /*********************************************************************************************
       *  Multiplies Polynomial 1 to Polynomial 2
       *  The method does not change the original polynomial.
    **********************************************************************************************/





    //*********************************************************************************************/

    /*********************************************************************************************
       *  Adds Polynomial 1 to Polynomial 2
       *  The method does not change the original polynomial.
    **********************************************************************************************/
       public Mul_polynomials add(Mul_polynomials poly)
       {
    	   Mul_polynomials res = clone();

          for(Monomial tmp = poly.head; tmp != null; tmp = tmp.next)
             res.addTerm(tmp.coeff, tmp.deg);

          return res;
       }

       public Mul_polynomials clone()
       {
    	   Mul_polynomials res = new Mul_polynomials();

          for(Monomial tmp = head; tmp != null; tmp = tmp.next)
             res.addTerm(tmp.coeff, tmp.deg);

          return res;
       }

       public boolean equals(Mul_polynomials poly)
       {
          Monomial tmp1 = head;
          Monomial tmp2 = poly.head;

          while(tmp1 != null && tmp2 != null)
          {
             if( !tmp1.equals(tmp2) ) return false;
             tmp1 = tmp1.next;
             tmp2 = tmp2.next;
          }
          return true;
       }

    //*********************************************************************************************/


    /*********************************************************************************************
       *  Multiplies by a Constant
       *  The method does not change the original polynomial.
    **********************************************************************************************/

       public Mul_polynomials multiply(int num)
       {
          Mul_polynomials res = clone();

          for(Monomial tmp = res.head; tmp != null; tmp = tmp.next)
             tmp.coeff *= num;

          return res;
       }

    //*********************************************************************************************/


     /*********************************************************************************************
       *  Returns a new polynomial that is the derivative of this polynomial.
     **********************************************************************************************/
       public Mul_polynomials diff()
       {
    	   Mul_polynomials res = new Mul_polynomials();

          for(Monomial tmp = head; tmp != null; tmp = tmp.next)
          {
             if(tmp.deg != 0)
                res.addTerm(tmp.coeff * tmp.deg, tmp.deg - 1 );
          }

          return res;
       }

    //*********************************************************************************************/


     /*********************************************************************************************
       *  Returns a new polynomial that is the result of Monomial times polynomial.
       **  The method does not change the original polynomial.
     **********************************************************************************************/
    /*
    public Polynomial times(Polynomial poly)
       {
              {
          Polynomial result = new Polynomial();



             for(Monomial tmp2 = poly.head; tmp2 != null; tmp2 = tmp2.next)
             res.addTerm(tmp2.coeff, tmp2.deg );


             for(Monomial tmp = head; tmp != null; tmp = tmp.next)
             res.addTerm(tmp.coeff, tmp.deg);

          while(tmp != null && tmp2 != null)
          {
             result.addTerm(tmp.coeff * tmp2.coeff, tmp.deg + tmp2.deg);
             tmp = tmp.next;
             tmp2 = tmp2.next;
          }
          return result;


       }

       }
    */
	
	
	
	
	
	
	
	
	
	
	
}
