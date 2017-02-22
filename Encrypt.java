
/**
 * Write a description of class Encrypt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
import java.math.*;
public class Encrypt extends OswegoLib
{
    // VARIABLE INITIALIZATION:
    
    // PRIVATE FINAL _ARR
    Random r = new Random();
    private final BigInteger [] _ARR = {new BigInteger((int)Math.pow(3,2),r), new BigInteger((int)Math.pow(3,2),r)} ;
    
    // PRIVATE FINAL _N
    public final BigInteger _N = generateN();
    
    // PRIVATE ARRAYLIST _LIST
    private ArrayList<BigInteger> _LIST = createEList();
    
    // PRIVATE FINAL _E 
    public final BigInteger _E = generateE();
    
    
    //PRIVATE FINAL _D
    private final BigDecimal _D = generateD();
    
    public BigInteger generateN()
    {
        return _ARR[0].multiply(_ARR[1]);
    }
    
    // CREATION totient()
    // Returns Integer * Integer
    private BigInteger totient ()
    {
        return (_ARR[0].subtract(B_ONE)).multiply(_ARR[1].subtract(B_ONE));
    }
    
    // CREATION: generateE
    // E is the public key ExpB_ONEnt
    public BigInteger generateE()
    {
        Random r = new Random();
        return _LIST.get(r.nextInt(_LIST.size()));
    }
    // CREATION: generateD
    // D is the private key expB_ONEnt
    // Array list must be the same list from CoPrime
    private BigDecimal generateD()
    {
        BigDecimal e = new BigDecimal(_E.toString());
        BigDecimal tot = new BigDecimal(totient().toString());
		BigDecimal bD = (D_ONE.divide(e, RoundingMode.HALF_UP)).remainder(tot);
		return bD;
    }
    
    // CREATION: createEList
    private ArrayList<BigInteger> createEList()
    {
        ArrayList<BigInteger> arr = new ArrayList();
        BigInteger i = (totient().divide(B_TWO));
		//System.out.println("i: " + i);
		for(; (i.compareTo((totient().divide(B_TWO)).add(new BigInteger("100"))) == -1); i = i.add(B_ONE))
        {
            //println("createList is the problem: " + i);
            if(coprime(i, totient()))
            {
				//println("createList is the problem #2" + i);
                //println("CoPrime found: " + i);
				arr.add(i);
            }
        }
		//System.out.println("done!");
        return arr;
    }
    public BigInteger encrypt(BigInteger password)
    {
        println("Password: "+ password);
        //println("e: "+ _E);
        //println("n: "+_N);
        Integer e = new Integer(_E.toString());
        BigInteger exponent = password.pow(e);
        BigInteger bigEncrypt = (exponent.mod(_N));
        //println("math.pow things: "+ exponent);
        return (bigEncrypt);
    }
}
