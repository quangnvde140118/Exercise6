/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rdc.project;

/**
 *
 * @author quangnv
 */
class test {
    public void test(){
  
      try  {
            String a = "i want to to go to the the zoo";
            System.out.println("Case a: input:" + a);
            System.out.println("Expect output: i want REPEAT go to REPEAT zoo");
            System.out.println("Real output:" + RDCProject.remove(a));
            System.out.println("\n");
            String b = "Truong an an cut cut";
            System.out.println("Case b: input:" + b);
            System.out.println("Expect output: truong REPEAT REPEAT");
            System.out.println("Real output:" + RDCProject.remove(b));
            System.out.println("\n");
          String c = "ngoi nha nay to to qua";
            System.out.println("Case c: input:" + c);
            System.out.println("Expect output: ngoi nha nay REPEAT qua");
            System.out.println("d:" + RDCProject.remove(c));
            System.out.println("\n");
            String d = "Son tung tung mtp";
            System.out.println("Case d: input:" + d);
            System.out.println("Expect output: son REPEAT mtp");
            System.out.println("Real output:" + RDCProject.remove(d));
            String e = "blackpink in in your ...";
            System.out.println("Case d: input:" + e);
            System.out.println("Expect output: blackpink REPEAT your ...");
            System.out.println("Real output:" + RDCProject.remove(e));
        } catch (Exception e) {
    
    
        }
}
      
           
}
