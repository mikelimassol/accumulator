package com.metapack.exersise;

import org.junit.Test;
import static org.junit.Assert.*;



/**
 * 
 * @author Michael Papamichael
 *
 */
public class AccumulatorImplTest{
    
	private Accumulator accumulator = new AccumulatorImpl();
	
	
	@Test(expected=IllegalArgumentException.class)
	public void shouldThrowIllegalArgumentException(){
		
		accumulator.accumulate();
		
	}
	
	@Test
	public void shouldAccumulateValues(){
		
		assertEquals(6, accumulator.accumulate(1, 2, 3));
		
	}
	
	@Test
	public void shouldAccumulateValuesAndGetTotal(){
		
		accumulator.accumulate(1, 2, 3);
		accumulator.accumulate(4);
		assertEquals(10, accumulator.getTotal());
		
	}
	
	@Test
	public void shouldAccumulateValuesAndResetTotal(){
		
		accumulator.accumulate(1, 2, 3);
		accumulator.reset();
		assertEquals(0, accumulator.getTotal());
		
	}
	
	
	
	
	
}
