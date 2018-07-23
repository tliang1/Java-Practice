package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Tony Liang
 *
 */
public class FindingGenes
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String genome = "";
		
		while (!genome.matches("[ACTG]+"))
		{
			System.out.print("Enter a genome string: ");
			genome = input.next().toUpperCase();
		}
		
		input.close();
		
		String[] genes = findGenes(genome);
		
		if (genes.length == 0)
		{
			System.out.println("no gene is found");
		}
		else
		{
			for (String gene: genes)
			{
				System.out.println(gene);
			}
		}
	}
	
	/**
	 * Returns the array of gene strings given the genome string.
	 * <ul>
	 * 	<li>
	 * 		If the given string is not a valid genome string, the array of gene strings will default to being empty.
	 * 	</li>
	 * </ul>
	 * 
	 * @param genome	the genome string
	 * @return			the array of gene strings
	 */
	public static String[] findGenes(String genome)
	{
		String genomeUppercase = genome.toUpperCase();
		StringBuilder genes = new StringBuilder();
		
		if (genomeUppercase.matches("[ACTG]+"))
		{
			int potentialGenePrefixIndex = genomeUppercase.indexOf("ATG");
			
			while ((potentialGenePrefixIndex != -1) && (genomeUppercase.length() >= 9))
			{
				genomeUppercase = genomeUppercase.substring(potentialGenePrefixIndex + 3);
				
				potentialGenePrefixIndex = genomeUppercase.indexOf("ATG");
				int[] potentialValidGeneSuffixesIndices = {genomeUppercase.indexOf("TAG"), genomeUppercase.indexOf("TAA"), 
															genomeUppercase.indexOf("TGA")};
				Arrays.sort(potentialValidGeneSuffixesIndices);
				
				if (potentialValidGeneSuffixesIndices[potentialValidGeneSuffixesIndices.length - 1] == -1)
				{
					break;
				}
				
				int validGeneSuffix = potentialValidGeneSuffixesIndices[0];
				int currentSuffixesIndex = 1;
				
				while ((validGeneSuffix == -1) && (currentSuffixesIndex < potentialValidGeneSuffixesIndices.length))
				{
					validGeneSuffix = potentialValidGeneSuffixesIndices[currentSuffixesIndex];
					currentSuffixesIndex++;
				}
				
				if ((potentialGenePrefixIndex == -1) || ((potentialGenePrefixIndex != -1) && (validGeneSuffix < potentialGenePrefixIndex)))
				{
					String potentialGene = genomeUppercase.substring(0, validGeneSuffix);
					
					if (potentialGene.length() % 3 == 0)
					{
						genomeUppercase = genomeUppercase.substring(validGeneSuffix + 3);
						potentialGenePrefixIndex = genomeUppercase.indexOf("ATG");
						genes.append(potentialGene + " ");
					}
				}
			}
		}
		
		return (genes.length() > 0) ? genes.toString().split(" ") : new String[0];
	}
}