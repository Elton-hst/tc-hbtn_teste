package src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteEmail {

    @Test
    public void testar_email_com_arroba() {
        boolean email = Pessoa.emailValid("email_teste@dominio.com.br");
        assertTrue(email);
    }


    @Test
    public void testar_email_sem_arroba() {
        boolean email = Pessoa.emailValid("email_testedominio.com.br");
        assertFalse(email);
    }

    @Test
    public void testar_email_mais_50_caracteres() {
        boolean email = Pessoa.emailValid("emailtestemuitolongonaodeveser_valido@dominio.com.br");
        assertEquals(email, false);
    }
}