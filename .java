+ public class Main {
+    private static int suma(int a, int b, int c) {
+       return(a + b + c);
+    }
+
+
+   public static void main(String[] args) {
+        int a=10, b=10,c=10;
+       System.out.println(suma(a,b,c));
+    }
+ }
+
+
+ public class Main {
+    public static void main(String[] args) {
+        Coche micoche= new Coche();
+        micoche.MasPuerta();
+        System.out.println(micoche.puertas);
+    }
+
+ }
+ class Coche{
+   public int puertas=4;
+
+    public void MasPuerta() {
+        this.puertas++;
+    }
+ }
