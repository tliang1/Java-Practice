package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import main.FindingGenes;

/**
 * @author Tony Liang
 *
 */
public class FindingGenesTest
{
	/**
	 * Test method for {@link main.FindingGenes#findGenes(java.lang.String)}.
	 */
	@ParameterizedTest
	@CsvSource({"'TTT, GGGCGT', TTATGTTTTAAGGATGGGGCGTTAGTT", "TACAAGCAACCCAAGAAGGCT, TGTGCGCATCACTCTCAATGTACAAGCAACCCAAGAAGGCTTGAGCCTGG", 
				"'CGACCTCGAAGAGGCCGC, ACAGTCGGTTGGTGC', ATGCGACCTCGAAGAGGCCGCTAAAAATGACAGTCGGTTGGTGCTAAATC", "'', TGTGTGTATAT", 
				"'', CTTCCCAATATGTGAGCATC", 
				"'',''",
				"'', G",
				"'', CDE",
				"',', ''", 
				"',,', ''",
				"'TTT , ,,, ,, GGG', ATGTTTTAAATGGGGTAA"})
	public void testFindGenes(@ConvertWith(ToStringArrayArgumentConverter.class) String[] genes, String genome)
	{
		assertArrayEquals(genes, FindingGenes.findGenes(genome));
	}
}

class ToStringArrayArgumentConverter extends SimpleArgumentConverter
{	
    @Override
    protected Object convert(Object source, Class<?> targetType)
    {
        assertEquals(String[].class, targetType, "Can only convert to String[]");
        
        String sourceAsString = String.valueOf(source).trim();
        
        if (sourceAsString.isEmpty() || !sourceAsString.matches("\\w+\\W*\\w*"))
        {
        	return new String[0];
        }
        else
        {
        	return sourceAsString.split("\\W*,\\W*");
        }
    }
}