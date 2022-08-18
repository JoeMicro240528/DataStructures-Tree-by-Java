import java.util.Scanner ;

public class TreeAppTest {
public static void main ( String [] argsn ){

Scanner input = new Scanner ( System.in);
Tree o = new Tree ();
System.out.println( " press any number? ");
int Anser = input.nextInt();
while ( Anser != 6 ){
System.out.println  ("   ");

System.out.println  ("   ");

System.out.println  ("   " );

System.out.println( " What You Want to do ? ");
System.out.println( " 1 - Insert ");
System.out.println (" 2  - Travers");
System.out.println (" 3 - Sum Tree");
System.out.println  (" 4 - Search");
System.out.println  (" 5 - Deledt element");
System.out.println  (" 6  - out	");
System.out.println  ("   ");

System.out.println  ("   ");

System.out.println  ("   ");

Anser = input.nextInt();
switch ( Anser ){

case 1 :
System.out.println  (" Enter the element");

System.out.println  ("   ");

System.out.println  ("   ");

int el = input.nextInt();
o.insert(el);
break ;

case 2:
 System.out.println( " 1 - preorder ");
 System.out.println( " 2 - inorder ");
 System.out.println (" 3 - postorder ");
 int an = input.nextInt();
 o.traverse(an);
 break ;

case 3 :
System.out.println( " The Sumation of Tree,s is " +  "("+ o.SumTree(o.root)+ ")" );
break ;

case 4 :
System.out.println ( " enter the elmente you want to Find it ");
int se = input.nextInt();
System.out.println(o.Search(se));
break ;

case 5 :
System.out.println ( " enter the elmente you want to delete it ");
int de = input.nextInt();
o.Delete(de);
break ;

        }
     }
   }
}