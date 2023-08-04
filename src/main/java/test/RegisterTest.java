package test;

import org.junit.Before;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Before
    public void navigateToRegisterPage(){
        homepage.clickAccountLink();
        homepage.clickRegisterLink();
    }

    @Test
    public void validRegisterTest(){

    }

}
