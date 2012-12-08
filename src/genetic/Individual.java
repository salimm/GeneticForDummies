package genetic;

/**
 * 
 * @author Salim
 *
 */
public class Individual {
	private int[] sequence;
	private double value;
	
	public Individual(int[] seq) {
		sequence = seq;
	}


	public int[] getSequence() {
		return sequence;
	}

	public void setSequence(int[] sequence) {
		this.sequence = sequence;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}
	@Override
	public String toString() {
		String tmp="[ ";
		for (int i = 0; i < sequence.length; i++) {
			if(i!=0)
				tmp+=" , ";
			tmp+=sequence[i];
		}
		tmp+=" ]";
		return tmp+"\n   Size: "+sequence.length+"\n   Value: "+value;
	}
	
}
