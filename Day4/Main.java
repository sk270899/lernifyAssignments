/************************** SESSION 1 *****************************/
/*
//-------Que1 Print hello world-----------

class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
    }
}
*/

/*
//-------Que2 Add two numbers/binary numbers/character-------

class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a+b;
        System.out.println(a+ " + " + b + " = "+ sum);
        
        String bin1 = "1010";
        String bin2 = "0101";
        int num1 = Integer.parseInt(bin1,2);
        int num2 = Integer.parseInt(bin2,2);
        int binsum = num1+num2;
        String bin3 = Integer.toBinaryString(binsum);
        System.out.println(bin1+" + "+bin2+" = "+bin3);
        
        char ch1 = 'a';
        char ch2 = 'b';
        int ch3 = (int)ch1+(int)ch2;
        System.out.println((char)ch3);
    }
}
*/


/*
//-------Que3 calculate compound interest, power of a number, swap 2 numbers------

class Main {
    public static void main(String[] args) {
        int p=1000;
        double r=2,t=2.5,n=2;
        double ammount;
        double temp = Math.pow((1+(r/n)),(n*t));
        ammount = p*temp;
        System.out.println("compound interest : "+ammount);
    
        int num1 = 2;
        int num2 = 10;
        int ans = (int)Math.pow(num1,num2);
        System.out.println(num1 + " to power of " + num2 + " = " +ans);
    
        int a = 10;
        int b = 5;
        int swap;
        System.out.println("before swapping a = "+a+" and b = "+b);
        swap = a;
        a = b;
        b = swap;
        System.out.println("after swapping a = "+a+" and b = "+b);
    }
}
*/



/*
//-------Que4 claculate area of ractangle, circle, ascii value of a character-------

class Main {
    public static void main(String[] args) {
        int length = 10;
        int bredth = 2;
        int areaRec = length*bredth;
        System.out.println("area of ractangle = " + areaRec);
        
        int radius = 2;
        double pi = 3.14;
        double areaCir = pi*radius*radius;
        System.out.println("area of circle = "+areaCir);
        
        char ch = 'a';
        System.out.println("ascii value of " + ch + " is = " +(int)ch);
    }
}
*/



/*
//-------Que6 print fibonacci series till n-------

class Main {
    
    static int fib(int n) {
        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int n = 10;
        for(int i=0;i<n;i++)
        {
            System.out.print(fib(i)+" ");
        }
    }
}
*/



/************************** SESSION 2 *****************************/





















