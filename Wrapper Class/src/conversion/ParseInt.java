package conversion;


public class ParseInt{
	public int con(String a) throws NumberFormatException {
	    try {    
		return Integer.parseInt(a);
	    }catch(NumberFormatException e) {
	    	return -1;
	    }
	    }
}