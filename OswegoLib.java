import java.util.*;
import java.math.*;
public class OswegoLib
{
    public static final BigInteger B_ZERO = BigInteger.ZERO;
    public static final BigInteger B_ONE = BigInteger.ONE;
    public static final BigDecimal D_ZERO = BigDecimal.ZERO;
    public static final BigDecimal D_ONE = BigDecimal.ONE;
    public static final BigInteger B_TWO = ((BigInteger.ONE).add(BigInteger.ONE));
    // GENERAL METHODS:
    // CREATION: print()
    public static void print(String promptText)
    {
        System.out.print(promptText);
    }

    public static void print(int promptText)
    {
        System.out.print(promptText);
    }

    public static void print(double promptText)
    {
        System.out.print(promptText);
    }
    // CREATION: println()
    public static void println(String promptText)
    {
        System.out.println(promptText);
    }

    public static void println(int promptText)
    {
        System.out.println(promptText);
    }

    public static void println(double promptText)
    {
        System.out.println(promptText);
    }

    public static void println(BigInteger promptText)
    {
        System.out.println(promptText);
    }    
    // CREATION: prompt()
    public static String prompt()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("input line: ");
        String output = input.nextLine();
        return output;
    }

    public static String prompt(String promptText)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(promptText);
        String output = input.nextLine();
        return output;
    }

    // CREATION: flip()
    public static String flip()
    {
        String text = prompt("Enter a String to flip: ");
        String temp = "";
        for (int x = text.length(); x > 0; x--)
        {
            temp += text.substring(x-1,x);
        }
        text = temp;
        return text;
    }

    public static String flip(String text)
    {
        String temp = "";
        for (int x = text.length(); x > 0; x--)
        {
            temp += text.substring(x-1,x);
        }
        text = temp;
        return text;
    }

    // CREATION: isSame()
    public static boolean isSame(int a, int b)
    {
        return a == b;
    }

    public static boolean isSame(long a, long b)
    {
        return a == b;
    }

    public static boolean isSame(float a, float b)
    {
        return a == b;
    }

    public static boolean isSame(double a, double b)
    {
        return a == b;
    }

    public static boolean isSame(String a, String b)
    {
        return a.equals(b);
    }

    // ARRAY METHODS:
    // CREATION: readArray()
    public static String readArray(int[] array)
    {
        String text = "[";
        for (int x = 0; x<array.length;x++)
        {
            if (x>0)
            {
                text += ", "+array[x]+" ";
            } else
            {
                text += " "+array[x]+" ";
            }
        }
        text += "]";
        return text;
    }

    public static String readArray(float[] array)
    {
        String text = "[";
        for (int x = 0; x<array.length;x++)
        {
            if (x>0)
            {
                text += ", "+array[x]+" ";
            } else
            {
                text += " "+array[x]+" ";
            }
        }
        text += "]";
        return text;
    }

    public static String readArray(long[] array)
    {
        String text = "[";
        for (int x = 0; x<array.length;x++)
        {
            if (x>0)
            {
                text += ", "+array[x]+" ";
            } else
            {
                text += " "+array[x]+" ";
            }
        }
        text += "]";
        return text;
    }

    public static String readArray(double[] array)
    {
        String text = "[";
        for (int x = 0; x<array.length;x++)
        {
            if (x>0)
            {
                text += ", "+array[x]+" ";
            } else
            {
                text += " "+array[x]+" ";
            }
        }
        text += "]";
        return text;
    }

    public static String readArray(String[] array)
    {
        String text = "[";
        for (int x = 0; x<array.length;x++)
        {
            if (x>0)
            {
                text += ", \""+array[x]+"\" ";
            } else
            {
                text += " \""+array[x]+"\" ";
            }
        }
        text += "]";
        return text;
    }

    // CREATION: countElements()
    public static int countElements(int[] array, int element)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == element)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(long[] array, long element)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == element)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(double[] array, double element)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == element)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(float[] array, float element)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == element)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(String[] array, String element)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x].equals(element))
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(int[] array)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == -1)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(long[] array)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == -1)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(double[] array)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == -1)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(float[] array)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] == -1)
            {
                count++;
            }
        }
        return count;
    }

    public static int countElements(String[] array)
    {
        int count = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x].equals("-1"))
            {
                count++;
            }
        }
        return count;
    }

    // CREATION: removeElements()
    public static int[] removeElements(int[] array, int element)
    {
        int[] temp = new int[array.length-countElements(array,element)];
        int counter = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (array[x] != element)
            {
                //System.out.println(array[x]);
                temp[counter] = array[x];
                counter++;
            }
        }
        return temp;
    }

    public static String[] removeElements(String[] array, String element)
    {
        String[] temp = new String[array.length-countElements(array,element)];
        int counter = 0;
        for (int x = 0;x<array.length;x++)
        {
            if (!(array[x].equals(element)))
            {
                temp[counter] = array[x];
                counter++;
            }
        }
        return temp;
    }

    
    // MATH METHODS:
    // CREATION: toAscii()
    public static List toAscii(String text)
    {
        //Scanner input = new Scanner(System.in);
        //System.out.println("input line:");
        //String text = input.nextLine();
        int indexVar = 0;
        List<Integer> userArray = new ArrayList<Integer>();
        for(int x=0;x<text.length();x++)
        {
            char temp = text.charAt(x);
            userArray.add((int)temp);
            //System.out.println(userArray.get(x));
        }
        return userArray;
        //System.out.println(userArray);
    }

    public static List toAscii()
    {
        String text = prompt();
        int indexVar = 0;
        List<Integer> userArray = new ArrayList<Integer>();
        for(int x=0;x<text.length();x++)
        {
            char temp = text.charAt(x);
            userArray.add((int)temp);
            //System.out.println(userArray.get(x));
        }
        return userArray;
        //System.out.println(userArray);
    }

    // CREATION: getFactors()
    public static int[] getFactors()
    {
        int number = Integer.parseInt(prompt("Number to retrieve factors of: "));
        int[] array = new int[number];
        for (int x=1;x<=number;x++)
        {
            if (number%x==0)
            {
                array[x-1] = x;
                //System.out.println(array[x]);
            } else {
                array[x-1] = -1;
                //System.out.println(array[x]);
            }
        }
        array = removeElements(array, -1);
        return array;
    }

    public static int[] getFactors(int number)
    {
        int[] array = new int[number];
        for (int x=1;x<=number;x++)
        {
            if (number%x==0)
            {
                array[x-1] = x;
                //System.out.println(array[x]);
            } else {
                array[x-1] = -1;
                //System.out.println(array[x]);
            }
        }
        array = removeElements(array, -1);
        return array;
    }

	/************************* THE OD GETFACTORS CONFLICTS WITH THE NEW ONE BELOW ***************************/
    /*public static BigInteger[] getFactors(BigInteger number)
    {
        Integer index = new Integer(number.toString());
        BigInteger[] array = new BigInteger[index+1];
        BigInteger x = new BigInteger("1");
		array[0] = B_ONE;
        //BigInteger numb = new BigInteger(number.toString());
        for (; (x.compareTo(number) == -1); x = x.add(B_ONE))
        {
            if (number.mod(x)== B_ZERO)
            {
                index = new Integer(x.toString());
                array[index - 1] = x;
                //System.out.println("Hi");
            }
        }
        //array = removeElements(array, -1);
        return array;
    }*/
	
	public static ArrayList<BigInteger> getFactors(BigInteger number)
    {
        ArrayList<BigInteger> array = new ArrayList();
        BigInteger x = new BigInteger("1");
        //BigInteger numb = new BigInteger(number.toString());
        for (; (x.compareTo(number) == -1); x = x.add(B_ONE))
        {
            if (number.mod(x)== B_ZERO)
            {
                array.add(x);
                //System.out.println("Hi");
            }
        }
        //array = removeElements(array, -1);
        return array;
    }

    // CREATION: coprime()
    public static boolean coprime(int[] arrayA, int[] arrayB)
    {
        boolean test = true;
        for (int x = 0;x<arrayA.length;x++)
        {
            for (int y = 0;y<arrayB.length;y++)
            {
                if (arrayA[x] == arrayB[y])
                {
                    test = false;
                }
            }
        }
        return test;
    }

    public static boolean coprime(double[] arrayA, double[] arrayB)
    {
        boolean test = true;
        for (int x = 0;x<arrayA.length;x++)
        {
            for (int y = 0;y<arrayB.length;y++)
            {
                if (arrayA[x] == arrayB[y])
                {
                    test = false;
                }
            }
        }
        return test;
    }

    public static boolean coprime(long[] arrayA, long[] arrayB)
    {
        boolean test = true;
        for (int x = 0;x<arrayA.length;x++)
        {
            for (int y = 0;y<arrayB.length;y++)
            {
                if (arrayA[x] == arrayB[y])
                {
                    test = false;
                }
            }
        }
        return test;
    }

    public static boolean coprime(float[] arrayA, float[] arrayB)
    {
        boolean test = true;
        for (int x = 0;x<arrayA.length;x++)
        {
            for (int y = 0;y<arrayB.length;y++)
            {
                if (arrayA[x] == arrayB[y])
                {
                    test = false;
                }
            }
        }
        return test;
    }

    public static boolean coprime(int a, int b)
    {
        int[] arrayA = getFactors(a);
        int[] arrayB = getFactors(b);
        boolean coprime = true;
        for (int x = 1;x<arrayA.length;x++)
        {
            for (int y = 1;y<arrayB.length;y++)
            {
                if (arrayA[x] == arrayB[y] && arrayA[x] != 1 && arrayB[y] != 1)
                {
                    coprime = false;
                }
            }
        }
        return coprime;
    }

    public static boolean coprime(BigInteger a, BigInteger b)
    {
        ArrayList<BigInteger> arrayA = getFactors(a);
		ArrayList<BigInteger> arrayB = getFactors(b);
		//BigInteger[] arrayA = getFactors(a);
        //BigInteger[] arrayB = getFactors(b);
        boolean coprime= true;
        for (int x = 0;x < arrayA.size();x++)
        {
            //println("coprime step 1 for loop");
            for (int y = 0;y < arrayB.size();y++)
            {
                //println("coprime step 2 for loop");
                if ((arrayA.get(x).compareTo(arrayB.get(y)) == 0) && (arrayA.get(x).compareTo(B_ONE) != 0) && (arrayB.get(y).compareTo(B_ONE) != 0))
                {
                    //println("coprime step 1 for loop if loop");
                    coprime = false;
                }
            }
        }
        return coprime;
    }

    // CREATION: phi()
    public static int phi(int n)
    {
        int totatives = 0;
        for (int i = 1;i<=n;i++)
        {
            if (coprime(n,i))
            {
                totatives++;
            }
        }
        return totatives;
    }

    // CREATION: prime()
    public static boolean prime(int n)
    {
        return getFactors(n).length == 2;
    }

    // CREATION: randPrime()
    public static int randPrime()
    {
        Random r = new Random();
        int rand = r.nextInt(100)+1;
        while(!prime(rand))
        {
            rand = r.nextInt(100)+1;
        }
        return rand;
    }

    // CREATION: getPrimePair()
    public static int[] getPrimePair()
    {
        int[] array = new int[2];
        int a = randPrime();
        int b = randPrime();
        while(isSame(a,b))
        {
            a = randPrime();
        }
        array[0] = a;
        array[1] = b;
        return array;
    }

    //CREATION: getCoPrime()
    private ArrayList getCoPrime(int n)
    {
        //int totatives = 0;
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for (int i = 1;i<=n;i++)
        {
            if (coprime(n,i))
            {
                System.out.println("haha");
                temp.add(i);
                //totatives++;
            }
        }
        return temp;
    }
    //BIG INTEGER METHODS:
    //THESE ARE THE BUGS!
    private ArrayList getCoPrime(BigInteger n)
    {
        int totatives = 0;
        ArrayList<BigInteger> temp = new ArrayList<BigInteger>();
        for (BigInteger i = n.divide(B_TWO); (i.compareTo(n) < 0); i = i.add(B_ONE))
        {
            System.out.println("hello");
            if (coprime(n,i))
            {
                temp.add(i);
                println(totatives);
                if(totatives >= 500)
                    break;
                totatives++;
            }
        }
        return temp;
    }//
}