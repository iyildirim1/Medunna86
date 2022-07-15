package stepdefinitions.dbStepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class IsmailDBSteps {

    Connection con;
    Statement stmt;
    @Given("Database connection is setup")
    public void databaseConnectionIsSetup() throws SQLException {

        //Setup database connection
        con = DriverManager.getConnection("jdbc:postgresql://medunna.com:5432/medunna_db","medunnadb_user","Medunnadb_@129");

        //step 2
        stmt = con.createStatement();
    }

    @Then("The username {string} provided is checked in the DB systsem for its uniqueness")
    public void theUsernameProvidedIsCheckedInTheDBSystsemForItsUniqueness(String username) throws SQLException {

        //step 3
        String s ="select * from jhi_user where login='"+username+"'";

        ResultSet rs = stmt.executeQuery(s);

        rs.next();
        if(rs.getString("login").equals(username)){

            con.close();
            System.out.println(username+" is already on the database");
            Assert.fail();

        } else{
            con.close();
            Assert.assertTrue(true);
        }

    }


    @Then("the ssn {string} is checked in the database and get data")
    public void theSsnIsCheckedInTheDatabaseAndGetData(String ssn) throws SQLException {

        String s = "Select ssn from jhi_user where ssn='"+ssn+"'";

        ResultSet rs = stmt.executeQuery(s);
        rs.next();
        Assert.assertEquals(ssn,rs.getString("ssn"));

    }
}
