**📌 Task 18th May | Java Operators**

**Task 1**
What will be the output of the following code?
int i = 11;
i = i++ + ++i; //11+13
System.out.println(i);

**Ouput:** : 24

**Task 2**
Guess the output:
int a = 11, b = 22, c;
c = a + b + a++ + b++ + ++a + ++b; //11+22+11+22+13+24
System.out.println("a=" + a);
System.out.println("b=" + b);
System.out.println("c=" + c);

**Ouput:**
a=13
b=24
c=103


**Task 3**
int i = 1, j = 2, k = 3;
int m = i-- - j-- - k--; //1-2-3
System.out.println("i=" + i + ", j=" + j + ", k=" + k + ", m=" + m);

**Ouput:**
i=0 , j=1 , k=2 , m=-4