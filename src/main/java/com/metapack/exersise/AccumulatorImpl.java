package com.metapack.exersise;

/**
 * Hello world!
 *
 */
public class AccumulatorImpl implements Accumulator
{
	
	private int total;

	public int accumulate(int... values) {
		
		if(values.length == 0){
			throw new IllegalArgumentException();
		}
		
		int sum = 0;
		
		for(int value : values){
			sum += value;
		}
		
		this.total += sum;
		
		return sum;
	}

	public int getTotal() {

		return total;
	}

	public void reset() {
		
		total = 0;
		
	}

}
