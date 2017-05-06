package main;

/*
 * Regions
 * 	_____  _____
 * [     ][\    ]
 * [     ][ \ 2 ]
 * [     ][  \  ]
 * [     ][ 3 \ ]
 * [     ][____\]
 * [  1  ][     ]
 * [     ][     ]
 * [     ][  4  ]
 * [     ][     ]
 * [_____][_____]
 * 
 */

public class MonteCarloSimulation
{

	public static void main(String[] args)
	{
		final int NUMBER_OF_TRIALS = 1000000;
		
		int oddRegionCount = 0;
		
		for (int trial = 1; trial <= NUMBER_OF_TRIALS; trial++)
		{
			double dartX = (Math.random() * 2.0) - 1.0;
			double dartY = (Math.random() * 2.0) - 1.0;
			
			/* Check hypotenuse by finding the slope and getting the equation of a line. If y point is less than or 
			 * equal to the equation, it is in the right triangle.
			 */
			if ((dartX <= 0.0) || 
					((dartX > 0.0) && (dartX <= 1.0) && (dartY >= 0.0) && (dartY <= 1.0) && 
							(dartY <= (-dartX + 1.0))))
			{
				oddRegionCount++;
			}
		}
		
		System.out.println("The number of times the dart falls into an odd-numbered region is " + oddRegionCount + 
				" times. The probability is " + ((oddRegionCount * 1.0) / NUMBER_OF_TRIALS));
	}

}