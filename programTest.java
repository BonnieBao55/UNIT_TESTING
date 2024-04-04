import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class programTest {
    @Test


    

    public void IsPrime_ZeroValue_ReturnFalse(){
        boolean IsPrime = program.IsPrime(0);

        //assert
        assertFalse(IsPrime);
    }

    @Test
    public void IsPrime_IsPrime_ReturnFalse()
    {
        //Arrange

        //Act
        boolean isPrime;
        
    }

    @Test
    public void testSpecial_Input2023_ThrowException() {
        //arrange

        //act + Assert
        assertThrows(NullPointerException.class, () -> program.Special(2023));
    }
}

