package com.manchesterdigital;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class SpotifyServiceTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Mock
    private AuthenticationService authenticationService;

    @Test
    public void whenUsernameAndPasswordValidThenAccountIsReturned() {
        SpotifyAccountService subject = new SpotifyAccountService(); // to refactor this, copy and paste above
        //the @Before line, then SpotifyAccountService subject - remove the class name and put private before it
        //private subject, copy subject equal to, then get rid of the like and add a semicolon, new private account service subject
        //in setup paste what you copied, so account service initialised as a mock
        // don't connect to the database when testing??
        //
        String username ="john@test.com";
        String password = "awsdas";

        SpotifyAccount expectedAccount = new SpotifyAccount(username, password);
    //Act
        SpotifyAccount result = subject.verify(username, password);//fucntion call
        //Assert
        Assertions.assertThat(result).isEqualTo(expectedAccount);
    }
    @Test
    public void whenUsernameAndPasswordInvalidThenExeptionThrown(){
        SpotifyAccountService subject = new SpotifyAccountService();
        String username ="john@test.com";
        String password = "awsdas";

        BDDMockito.given(authenticationService.authenticate(Mockito.anyString(), Mockito.anyString()))
                .willReturn(false);

    expectedException.expect(SpotifyAccountNotValidException.class);
        //act
        subject.verify(username, password);

BDDMockito.verify(authenticationService).authenticate(username, password);

    }
}
