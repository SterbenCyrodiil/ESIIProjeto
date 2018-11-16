import Exceptions.UserDoesNotExists;

import org.junit.jupiter.api.*;

/**
 * Por enquanto só estão escritos os métodos de teste principais e
 * um caso de teste de exemplo.
 *
 * Não esquecer de identificar o ID do caso de teste relativo
 * a cada expressão de assert, etc.!
 */
public class BikeRentalSystemTest {
    BikeRentalSystem brs;

    @BeforeEach
    public void setUp() {
        /* rentalFee = 1, significa que cada unidade de tempo de aluguer da bicicleta
         * corresponde a 1 unidade de crédito
         */
        brs = new BikeRentalSystem(1);
    }

    /**
     * Método relativo às Equivalence Classes #ECP1V e #ECP1IV
     *
     * @param IDDeposit identificação do depósito da bicicleta
     * @param IDUser identificação do utilizador
     * @param starttime valor inicial do tempo de aluguer
     */
    @Test
    public void testGetBicycle(int IDDeposit, int IDUser, int starttime) {
        //Expressão relativa ao caso de teste com output esperado:
        // -> UserDoesNotExists exception
        // (colocar o ID aqui)
        Assertions.assertThrows(UserDoesNotExists.class,
                () -> brs.getBicycle(IDUser, IDDeposit, starttime));

    }

    @Test
    /**
     *
     */
    public void testReturnBicycle() {

    }

    @Test
    /**
     *
     */
    public void testBicycleRentalFee() {

    }

    @Test
    /**
     *
     */
    public void testVerifyCredit() {

    }

    @Test
    /**
     *
     */
    public void testAddCredit() {

    }

    @Test
    /**
     *
     */
    public void testRegisterUser() {

    }
}
